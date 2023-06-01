package bpmnforcpsextension;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.xpath.XPathConstants;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.search.strategy.IntStrategyFactory;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.chocosolver.solver.variables.VariableFactory;
import org.eclipse.core.resources.team.TeamHook;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder; 
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.testng.annotations.Test;

import zmq.Sub.SubSession;

public class Verif 
{	
   public Verif() {}
   public static void parse(File _FilePath, int n1, int n2) 
   {
	 org.jdom2.Document document = null ;
	 Solver solver =  new Solver("T");
	 Constraint[] c = new Constraint[2000];
	 int cont=-1;
	 int ti= -1;
	 List<Element>listedesSequencesflow=new ArrayList<Element>();
	 try 
	 {
	   SAXBuilder sxb = new SAXBuilder();
	   document = sxb.build(_FilePath);
	   IntVar[] T = new IntVar[1500];
	   for (int i =0; i<T.length; i++)
	   {
	    	 // T[i] = VF.bounded("T_i", 0, 900, solver); 
	   }
	   IntVar[] A = new IntVar[800];
	   for (int i =0; i<A.length; i++)
	   {
	    	// A[i] = VF.bounded("A_i", 0, 900, solver); 
	   }
	   Element racine = document.getRootElement();
	   XPathFactory xpf=XPathFactory.instance();
	   Namespace namespace = Namespace.getNamespace("bpmn2", "http://www.omg.org/spec/BPMN/20100524/MODEL");
	   XPathExpression<Element> xpath = xpf.compile("//bpmn2:process", Filters.element(),null,namespace);  
	   List<Element> lesdesprocess = xpath.evaluate(document);
	   String trgRef;
	   String srcRef;
	   String minval;
	   String maxval;
	   String id_task;
	   String min_dur;
	   String max_dur;
	   String nom_task;
	   String sourceRefForseqflow;
 	   String targetRefForseqflow;
 	   IntVar finishtimesrcSeqflow = null;
       IntVar starttimetargetSeqflow=null;
       List<Element>allTasks= new ArrayList<Element>();
	   for (Element process : lesdesprocess) 
	   { 
	  	  trgRef ="" ;
	      srcRef="";
	      minval="";
	      maxval="";
	      min_dur="";
	      max_dur="";
	      List<Element> listedesTasks= process.getChildren("task", namespace);
	      List<Element> listTasksansEntityPhysique= new ArrayList<Element>();
	     
	      for(Element task:listedesTasks)
	      {
	    	  if(!(task.getAttributeValue("type",Namespace.getNamespace("http://org.eclipse.BpmnForCpsExtension/ext")).equals("PhysicalEntity")))
	    	  {
	    		  listTasksansEntityPhysique.add(task);
	    	  }
	      }
	      List<Element> listedesservicetask= process.getChildren("serviceTask", namespace);
	      List<Element> listemanualtask= process.getChildren("manualTask", namespace);
	      List<Element> listedesusertask= process.getChildren("userTask", namespace);
	      List<Element> listedesscripttasks= process.getChildren("scriptTask", namespace);
	      List<Element> listedesbusinessruletask= process.getChildren("businessRuleTask", namespace);
	      List<Element> listedessendtask=process.getChildren("sendTask", namespace);
	      List<Element> listedesreceivetask= process.getChildren("receiveTask", namespace);
	      List<Element> listedesboundaryenvents= process.getChildren("boundaryEvent", namespace);
	      allTasks = new ArrayList<>(listTasksansEntityPhysique.size() + listedesservicetask.size()+
	    		  listemanualtask.size()+listedesusertask.size()+listedesscripttasks.size()+
	    		  listedesbusinessruletask.size()+listedessendtask.size()+listedesreceivetask.size());
	      allTasks.addAll(listTasksansEntityPhysique);
	      allTasks.addAll(listedesservicetask);
	      allTasks.addAll(listemanualtask);
	      allTasks.addAll(listedesusertask);
	      allTasks.addAll(listedesbusinessruletask);
	      allTasks.addAll(listedessendtask);
	      allTasks.addAll(listedesreceivetask);
	      allTasks.addAll(listedesscripttasks);
   // begin tasks's constraints
	      if(allTasks.isEmpty())
			   Test2.prompt("No tasks in  " +process.getAttributeValue("name"));
		   else
		   {
			   	  Test2.prompt("Tasks in " + process.getAttributeValue("name"));	
			      for(Element task :allTasks)
			      {
			        nom_task =task.getAttributeValue("name");
			        Test2.prompt("   "+nom_task);
			        id_task=task.getAttributeValue("id");
			        for(Element boundaryevent:listedesboundaryenvents)
			        {
			        	String a =boundaryevent.getAttributeValue("attachedToRef");
			        	String b =boundaryevent.getChild("eventDefinition",namespace).getAttributeValue("type",Namespace.getNamespace("http://www.w3.org/2001/XMLSchema-instance"));
			        	if(a.equals("mm:"+id_task)&& b.equals("mm:Duration"))
			        	{
			        		min_dur=boundaryevent.getChild("eventDefinition",namespace).getAttributeValue("Min_time_duration");
			        	 	max_dur=boundaryevent.getChild("eventDefinition",namespace).getAttributeValue("Max_time_duration");
			        	}
			         }
			         int dur_min= Integer.parseInt(min_dur);
			  		 int dur_max= Integer.parseInt(max_dur);
			  		 ti+=1;
			         T[ti]  = VariableFactory.bounded("Start_Time_"+id_task, n1, n2, solver); 
			         T[ti+1]= VariableFactory.bounded("Finish_Time_"+id_task,n1, n2, solver);
			         Test2.prompt("          "+T[ti]+".............." +T[ti+1]);
			         T[ti+2]=VariableFactory.bounded("Duration_"+id_task,dur_min, dur_max, solver);
			         cont+=1;
			      	 c[cont] = ICF.arithm(T[ti],"<=",T[ti+1]);
			      	 //Test2.prompt("          "+"constraint number " +cont+" : "+c[cont]);
			      	 c[cont+1] = ICF.sum(new IntVar[] {T[ti+2],T[ti]},"<=",T[ti+1]);
			      	 ti+=2;
			      	 cont+=1;
			      	 
			      	 
			      	 
			        /*IntVar Start_time  = VariableFactory.bounded("Start_Time", 10, 20, solver);
			      	IntVar Duration= VariableFactory.bounded("Duration",5, 10, solver);
			      	IntVar Finish_time= VariableFactory.bounded("Finish_Time",10,20, solver);
			      	c[cont] = ICF.sum(new IntVar[] {Start_time,Duration},"<=",Finish_time);
			      	solver.post(c[cont]);
			      	solver.set(IntStrategyFactory.lexico_LB(Start_time,Duration,Finish_time));
			      	solver.findAllSolutions();
			      	
			      	
			      	Start_time*/
			      	 
			      	 
			      	 
			      	
			        
			     }
			 }
	   }
// end tasks's constraints
	   Test2.prompt("\n");
//begin constraints between tasks 
	//tasks related via a sequence flow
	   for(Element process:lesdesprocess)
	   {
		      List<Element> listedesTasks1= process.getChildren("task", namespace);
		      List<Element> listedesseqflow= process.getChildren("sequenceFlow", namespace);
		      List<Element> listTasksansEntityPhysique1= new ArrayList<Element>();
		     
		      for(Element task:listedesTasks1)
		      {
		    	  if(!(task.getAttributeValue("type",Namespace.getNamespace("http://org.eclipse.BpmnForCpsExtension/ext")).equals("PhysicalEntity")))
		    	  {
		    		  listTasksansEntityPhysique1.add(task);
		    	  }
		      }
		      List<Element> listedesservicetask1= process.getChildren("serviceTask", namespace);
		      List<Element> listemanualtask1= process.getChildren("manualTask", namespace);
		      List<Element> listedesusertask1= process.getChildren("userTask", namespace);
		      List<Element> listedesscripttasks1= process.getChildren("scriptTask", namespace);
		      List<Element> listedesbusinessruletask1= process.getChildren("businessRuleTask", namespace);
		      List<Element> listedessendtask1=process.getChildren("sendTask", namespace);
		      List<Element> listedesreceivetask1= process.getChildren("receiveTask", namespace);
		      allTasks = new ArrayList<>(listTasksansEntityPhysique1.size() + listedesservicetask1.size()+
		    		  listemanualtask1.size()+listedesusertask1.size()+listedesscripttasks1.size()+
		    		  listedesbusinessruletask1.size()+listedessendtask1.size()+listedesreceivetask1.size());
		      allTasks.addAll(listTasksansEntityPhysique1);
		      allTasks.addAll(listedesservicetask1);
		      allTasks.addAll(listemanualtask1);
		      allTasks.addAll(listedesusertask1);
		      allTasks.addAll(listedesbusinessruletask1);
		      allTasks.addAll(listedessendtask1);
		      allTasks.addAll(listedesreceivetask1);
		      allTasks.addAll(listedesscripttasks1);
		      if(process.getChildren("sequenceFlow", namespace).isEmpty())
				   Test2.prompt("No sequenceflow in " +process.getAttributeValue("name"));
			   else
			   {    
				  Test2.prompt("Sequenceflow in " +process.getAttributeValue("name"));
			      for (Element seqflow:process.getChildren("sequenceFlow",namespace))
			      {
			    	  sourceRefForseqflow = seqflow.getAttributeValue("sourceRef");
			    	  targetRefForseqflow = seqflow.getAttributeValue("targetRef");
			    	  Boolean bo=sourceRefForseqflow.contains("ParallelGateway")|| sourceRefForseqflow.contains("IntermediateCatchEvent")||
				    			sourceRefForseqflow.contains("ExclusiveGateway")|| sourceRefForseqflow.contains("StartEvent")||
				    			sourceRefForseqflow.contains("EndEvent")|| targetRefForseqflow.contains("ParallelGateway")||
				    			targetRefForseqflow.contains("StartEvent")|| targetRefForseqflow.contains("EndEvent")||
				    			targetRefForseqflow.contains("IntermediateCatchEvent")||targetRefForseqflow.contains("ExclusiveGateway");
			    	  String a=""; String b="";
			    	  if (!bo)
			    	   { 
			    		  for(Element task:allTasks)
				    	  {
			    			  id_task =task.getAttributeValue("id");
				    		   if(id_task.equals(sourceRefForseqflow))
				    		  {
				    			   a= task.getAttributeValue("name");
				    			   for(int j = 0; j < T.length; j++)
				    			   {
				    				  if (T[j]!=null)
				    				  {
					    				  if (T[j].getName().startsWith("Finish_Time_"+id_task))
					    					  finishtimesrcSeqflow=T[j];
				    				  }
				    			  }
				    		  }
				    		  if(id_task.equals(targetRefForseqflow))
				    		  { 
				    			   b=task.getAttributeValue("name");
				    			   for(int j = 0; j < T.length; j++)
					    		   {
				    				   if (T[j]!=null)
				    				   {
				    					   if (T[j].getName().startsWith("Start_Time_"+id_task))
						    				 starttimetargetSeqflow=T[j];
				    				   }
					    				  
					    			}
				    		  }
				    	  }
			    		  Test2.prompt("            "+"sequenceflow between  "+a+" and "+b);
			    		  
			    	      c[cont]=ICF.arithm(finishtimesrcSeqflow,"<=",starttimetargetSeqflow);
			    	      
			    	      //Test2.prompt("               constraint: "+c[cont]);
			    	      cont+=1;
			    	  } 
			     }
			   }    
	    }
	 //tasks related via an exclusiveGateway
	   Test2.prompt("\n ");
	   for(Element process:lesdesprocess)
	   {
		      if(process.getChildren("exclusiveGateway", namespace).isEmpty())
				   Test2.prompt("No exclusiveGateway in " +process.getAttributeValue("name"));
			   else
			   {    
				  Test2.prompt("ExclusiveGateway in " +process.getAttributeValue("name"));
				  int  x=0;
				 // Liste<Element> listeseqflow=process.getChildren(cname);
				  for(Element exclusivegatway: process.getChildren("exclusiveGateway",namespace))
				  {
					  x++;
					 Test2.prompt("   exclusiveGateway number :" +x);
					 List<Element> income= exclusivegatway.getChildren("incoming", namespace);
					 for(Element inc: income)
					 {
						 String seqflocIncoming=inc.getText().substring(3);
						 Test2.prompt("     incoming :"+seqflocIncoming);
					 }
					List<Element> outcome= exclusivegatway.getChildren("outgoing", namespace);
					for(Element outc: outcome)
					 {
						 String seqfloxOutcoming=outc.getText().substring(3);
						 Test2.prompt("     outcoming :"+seqfloxOutcoming);
					 }
					Test2.prompt("\n");
				  }
			   }
	   }
	   Test2.prompt("\n");
	 //tasks related via a parallelGateway
	   for(Element process:lesdesprocess)
	   {
		      if(process.getChildren("parallelGateway", namespace).isEmpty())
				   Test2.prompt("No parallelGateway in " +process.getAttributeValue("name"));
			   else
			   {    
				  Test2.prompt("ParallelGateway in " +process.getAttributeValue("name"));
				  int x=0; 
				  for(Element parallelgatway: process.getChildren("parallelGateway",namespace))
				  {   x+=1;
					  Test2.prompt("   parallelgatway number :" +x);
					  List<Element> income= parallelgatway.getChildren("incoming", namespace);
						 for(Element inc: income)
						 {
							 String seqflocIncoming=inc.getText().substring(3);
							 Test2.prompt("     incoming :"+seqflocIncoming);
						 }
						List<Element> outcome= parallelgatway.getChildren("outgoing", namespace);
						
						for(Element outcom: outcome)
						 {
							 String seqfloxOutcoming=outcom.getText().substring(3);
							 Test2.prompt("     outcoming :"+seqfloxOutcoming);
						 }
						Test2.prompt("\n");
				  }
			   }
	   }
//end constraints between tasks
	   Test2.prompt("\n");

//begin periodic/sporadic event
	   Test2.prompt("\n");
	   for(Element process:lesdesprocess)
	   {
		   List<Element> listedesTasks= process.getChildren("task", namespace);
		   List<Element> listTasksansEntityPhysique= new ArrayList<Element>();
		     
		      for(Element task:listedesTasks)
		      {
		    	  if(!(task.getAttributeValue("type",Namespace.getNamespace("http://org.eclipse.BpmnForCpsExtension/ext")).equals("PhysicalEntity")))
		    	  {
		    		  listTasksansEntityPhysique.add(task);
		    	  }
		      }
		   List<Element> listedesservicetask= process.getChildren("serviceTask", namespace);
		      List<Element> listemanualtask= process.getChildren("manualTask", namespace);
		      List<Element> listedesusertask= process.getChildren("userTask", namespace);
		      List<Element> listedesscripttasks= process.getChildren("scriptTask", namespace);
		      List<Element> listedesbusinessruletask= process.getChildren("businessRuleTask", namespace);
		      List<Element> listedessendtask=process.getChildren("sendTask", namespace);
		      List<Element> listedesreceivetask= process.getChildren("receiveTask", namespace);
		      allTasks = new ArrayList<>(listTasksansEntityPhysique.size() + listedesservicetask.size()+
		    		  listemanualtask.size()+listedesusertask.size()+listedesscripttasks.size()+
		    		  listedesbusinessruletask.size()+listedessendtask.size()+listedesreceivetask.size());
		      allTasks.addAll(listTasksansEntityPhysique);
		      allTasks.addAll(listedesservicetask);
		      allTasks.addAll(listemanualtask);
		      allTasks.addAll(listedesusertask);
		      allTasks.addAll(listedesbusinessruletask);
		      allTasks.addAll(listedessendtask);
		      allTasks.addAll(listedesreceivetask);
		      allTasks.addAll(listedesscripttasks);
		 List<Element> listedesIntermediateCatchEvent= process.getChildren("intermediateCatchEvent", namespace);
	     if(process.getChildren("intermediateCatchEvent", namespace).isEmpty())
		   Test2.prompt("No Periodic /Sporadic Activities in " +process.getAttributeValue("name"));
    	 else
		 {
		   Test2.prompt("Periodic /Sporadic Activities in " +process.getAttributeValue("name"));
		   for(Element InterCatchEvent:listedesIntermediateCatchEvent)
		   {
			 if (InterCatchEvent.getChildren("eventDefinition").isEmpty())
			 {
			   List<Element> childEventDef=InterCatchEvent.getChildren("eventDefinition",namespace);
			   Element outcoming= InterCatchEvent.getChild("outgoing",namespace);
			   IntVar durationTarget=null;
			   IntVar startTimeTarget=null;
			   IntVar FinishTimeTarget=null;
			   int maxloop = 0;
			   IntVar intvarmaxloop = null;
			   int valueTime;
			  for(Element seqFlow :process.getChildren("sequenceFlow",namespace))
			   {  
				  if(outcoming!=null)
					  if (outcoming.getText().equals("mm:"+seqFlow.getAttributeValue("id")))
					   {
						   //Test2.prompt(outcoming.getText()+"--------"+"mm:"+seqFlow.getAttributeValue("id"));
						   String idtarget=seqFlow.getAttributeValue("targetRef");
						   for(Element task :allTasks)
							 {
								 if(task.getAttributeValue("id").equals(idtarget))
								 {
									//Duration
									    for(int j = 0; j < T.length; j++)
									      if (T[j]!=null && T[j].getName().startsWith("Duration_"+task.getAttributeValue("id")))
											 durationTarget=T[j];	
									//StartTime
									    for(int j = 0; j < T.length; j++)
										  if (T[j]!=null && T[j].getName().startsWith("Start_Time_"+task.getAttributeValue("id")))
											  startTimeTarget=T[j];		
									 //FinishTime
										for(int j = 0; j < T.length; j++)
										  if (T[j]!=null && T[j].getName().startsWith("Finish_Time_"+task.getAttributeValue("id")))
											   FinishTimeTarget=T[j];
									//periodic/sporadic
										for(Element childEvent:childEventDef)
										   {
										     //begin periodic event
											   if (childEvent.getAttributeValue("type",Namespace.getNamespace("http://www.w3.org/2001/XMLSchema-instance")).equals("mm:PeriodicEvent"))
											   {	
												   valueTime= Integer.parseInt(childEvent.getAttributeValue("value"));	
												 //maxloop
													 if(task.getChildren("standardLoopCharacteristics", namespace)!=null)
													 {
														 List<Element> l = task.getChildren("standardLoopCharacteristics", namespace);
														 for(Element ll:l)
														 {  maxloop=Integer.parseInt(ll.getAttributeValue("loopMaximum"));
														    intvarmaxloop=VariableFactory.bounded("Maxloop_AttachedTo_"+idtarget, maxloop, maxloop, solver);
														 }
												  //periodic event constraint
													Test2.prompt("      \n     Periodic event details ");
														 Test2.prompt("            "+startTimeTarget);
														 Test2.prompt("            "+FinishTimeTarget);
														 Test2.prompt("            "+durationTarget);
														 Test2.prompt("            Loop Maximum = "+maxloop);
														 Test2.prompt("            Executed every = "+valueTime+" unit of time\n");
														
												   //periodic event constraint 
														 T[ti]=intvarmaxloop;
														 int var=(maxloop-1)*valueTime;
														 IntVar  var1=VariableFactory.bounded("Peridic_Event_ValueTime_AttachedTo_"+idtarget, var, var, solver);
													     c[cont]=ICF.sum(new IntVar[] {startTimeTarget,durationTarget,var1},"=",FinishTimeTarget);
													     cont+=1;
													 }
											  }
											   
											 //end periodic event
											 //begin sporadic event
											   if (childEvent.getAttributeValue("type",Namespace.getNamespace("http://www.w3.org/2001/XMLSchema-instance")).equals("mm:SporadicEvent"))
											   {
												   int min_time= Integer.parseInt(childEvent.getAttributeValue("Min_time"));
												   int max_time= Integer.parseInt(childEvent.getAttributeValue("Max_time"));	
												 //maxloop
													 if(task.getChildren("standardLoopCharacteristics", namespace)!=null)
													 {
														 List<Element> l = task.getChildren("standardLoopCharacteristics", namespace);
														 for(Element ll:l)
														 {  maxloop=Integer.parseInt(ll.getAttributeValue("loopMaximum"));
														    intvarmaxloop=VariableFactory.bounded("Maxloop_AttachedTo_"+idtarget, maxloop, maxloop, solver);
														 }
														 Test2.prompt("            \n     Sporadic event details");
														 Test2.prompt("            "+startTimeTarget);
														 Test2.prompt("            "+FinishTimeTarget);
														 Test2.prompt("            "+durationTarget);
														 Test2.prompt("            Loop Maximum = "+maxloop);
														 Test2.prompt("            Executed in "+min_time+" to  " +max_time+" unit of time\n");
												  
													//sporadic event constraint
														 T[ti]=intvarmaxloop;
														 int varmax=(maxloop-1)*max_time;
														 int varmin=(maxloop-1)*min_time;
														 IntVar  varmax1=VariableFactory.bounded("Sporadic_Event_Maximum_Time_AttachedTo_"+idtarget, varmax, varmax, solver);
														 IntVar  varmin1=VariableFactory.bounded("Sporadic_Event_Minimum_Time_AttachedTo_"+idtarget, varmin, varmin, solver);
													     c[cont]=ICF.sum(new IntVar[] {startTimeTarget,durationTarget,varmax1},">=",FinishTimeTarget);
													     c[cont+1]=ICF.sum(new IntVar[] {startTimeTarget,durationTarget,varmin1},"<=",FinishTimeTarget);
													     cont+=2;
													 }
											 }
											 //end sporadic event
									     }
								  }	
							   }
							}
			  }
		    } 
		 }
	   }
}
//end periodic/sporadic event
// begin physical dependency
		 Test2.prompt("\n");
		   for(Element process:lesdesprocess)
		   {
			   List<Element> listedesTasks= process.getChildren("task", namespace);
			   List<Element> listTasksansEntityPhysique= new ArrayList<Element>();
			     
			      for(Element task:listedesTasks)
			      {
			    	  if(!(task.getAttributeValue("type",Namespace.getNamespace("http://org.eclipse.BpmnForCpsExtension/ext")).equals("PhysicalEntity")))
			    	  {
			    		  listTasksansEntityPhysique.add(task);
			    	  }
			      }
			      List<Element> listedesservicetask= process.getChildren("serviceTask", namespace);
			      List<Element> listemanualtask= process.getChildren("manualTask", namespace);
			      List<Element> listedesusertask= process.getChildren("userTask", namespace);
			      List<Element> listedesscripttasks= process.getChildren("scriptTask", namespace);
			      List<Element> listedesbusinessruletask= process.getChildren("businessRuleTask", namespace);
			      List<Element> listedessendtask=process.getChildren("sendTask", namespace);
			      List<Element> listedesreceivetask= process.getChildren("receiveTask", namespace);
			      List<Element> listedesbounderyevent5=process.getChildren("boundaryEvent",namespace);
			      allTasks = new ArrayList<>(listTasksansEntityPhysique.size() + listedesservicetask.size()+
			    		  listemanualtask.size()+listedesusertask.size()+listedesscripttasks.size()+
			    		  listedesbusinessruletask.size()+listedessendtask.size()+listedesreceivetask.size());
			      allTasks.addAll(listTasksansEntityPhysique);
			      allTasks.addAll(listedesservicetask);
			      allTasks.addAll(listemanualtask);
			      allTasks.addAll(listedesusertask);
			      allTasks.addAll(listedesbusinessruletask);
			      allTasks.addAll(listedessendtask);
			      allTasks.addAll(listedesreceivetask);
			      allTasks.addAll(listedesscripttasks);
			      List<Element> physicalproperties=new ArrayList<Element>();
			      int number =0;
			      String ch="Physical dependancies in "+process.getAttributeValue("name")+"\n";
			 for(Element eventbound: listedesbounderyevent5)
			 {
				 physicalproperties.clear();
			     List<Element> listesdesEventdef= eventbound.getChildren("eventDefinition", namespace);
				 for(Element eventdef: listesdesEventdef)
				 {
					 if (eventdef.getAttribute("Physical_dependency_function")!=null)
						 {
						   ch+="        "+ eventdef.getAttributeValue("Physical_dependency_function")+" attached to "+eventbound.getAttributeValue("attachedToRef").substring(3, eventbound.getAttributeValue("attachedToRef").length())+"\n";
						   number+=1;
						   physicalproperties.add(eventdef);
						 }
				 }
				 Iterator<Element> physprop=physicalproperties.iterator();
				 while(physprop.hasNext())
				 {
					 Element courant=(Element) physprop.next();
					 String chaine=courant.getAttributeValue("Physical_dependency_function").toString();
					 char[] Tab = null;
					 IntVar firstphysicaldep=null;
					 IntVar secondphysicaldep=null;
					 IntVar thirdphysicaldep=null;
					 IntVar starttime=null;
					 IntVar finishtime=null;
					 IntVar duration=null;
					 IntVar part1IntVar = null;
					 IntVar part2IntVar=null;
					 IntVar res=null;
					 String namePhysicalProp1="";
					 String namePhysicalProp2="";
					 String namePhysicalProp3="";
		//lets recover variables!
			//recover the first physical property
					 if(courant.getAttribute("First_physical_property")!=null)
					 {
						 namePhysicalProp1=courant.getAttributeValue("First_physical_property");
						 if(courant.getAttribute("Min_value_of_the_first_physical_property")!=null)
							 	firstphysicaldep=VariableFactory.bounded(courant.getAttributeValue("First_physical_property"), Integer.parseInt(courant.getAttributeValue("Min_value_of_the_first_physical_property")), Integer.parseInt(courant.getAttributeValue("Max_value_of_the_first_physical_property")), solver);
						 else
							firstphysicaldep=VariableFactory.bounded(courant.getAttributeValue("First_physical_property"), 0, Integer.parseInt(courant.getAttributeValue("Max_value_of_the_first_physical_property")), solver);
					}
			//recover the second physical property
					 if(courant.getAttribute("Second_physical_property")!=null)
					 {
						 namePhysicalProp2=courant.getAttributeValue("Second_physical_property");
						 if(courant.getAttribute("Min_value_of_the_second_physical_property")!=null)
							 	secondphysicaldep=VariableFactory.bounded(courant.getAttributeValue("Second_physical_property"), Integer.parseInt(courant.getAttributeValue("Min_value_of_the_second_physical_property")), Integer.parseInt(courant.getAttributeValue("Max_value_of_the_second_physical_property")), solver);
						 else
							 secondphysicaldep=VariableFactory.bounded(courant.getAttributeValue("Second_physical_property"), 0, Integer.parseInt(courant.getAttributeValue("Max_value_of_the_second_physical_property")), solver);
					 }
			//recover third physical property
					 if(courant.getAttribute("Third_physical_property")!=null)
					 {
						 namePhysicalProp3=courant.getAttributeValue("Third_physical_property");
						 if(courant.getAttribute("Min_value_of_the_thrid_physical_property")!=null)
							 	thirdphysicaldep=VariableFactory.bounded(courant.getAttributeValue("Third_physical_property"), Integer.parseInt(courant.getAttributeValue("Min_value_of_the_third_physical_property")), Integer.parseInt(courant.getAttributeValue("Max_value_of_the_third_physical_property")), solver);
						 else
							 thirdphysicaldep=VariableFactory.bounded(courant.getAttributeValue("Third_physical_property"), 0, Integer.parseInt(courant.getAttributeValue("Max_value_of_the_third_physical_property")), solver);
					 }
			//recover the start time, the finish time and the duration
					
					 String task=eventbound.getAttributeValue("attachedToRef").substring(3, eventbound.getAttributeValue("attachedToRef").length());
					 for(int i=0; i<T.length;i++)
					 {
						 if(T[i]!=null)
						 {
							 if(T[i].getName().startsWith("Start_Time_"+task))
							  starttime=T[i];
							 if(T[i].getName().startsWith("Finish_Time_"+task))
							  finishtime=T[i];
							 if(T[i].getName().startsWith("Duration_"+task))
								   duration=T[i];
						 }
					 }
					 //Test2.prompt(firstphysicaldep+"..."+secondphysicaldep+"-----"+starttime+",,,,,,"+finishtime+"((("+duration+"&&&&"+thirdphysicaldep);
		
		//developing math code of a multi-operator function
					 IntVar[] X=new IntVar[1000];
					 int PosX=0;
					 String XX="";
					 Test2.prompt("the function is :" +chaine );
					 while (MathFunction.OperatorOccurenceNumber(chaine)!=1) 
					 {
						 Tab = chaine.toCharArray();
						 if (MathFunction.LastOccur('(',Tab)==-1)
							  {chaine=MathFunction.AddParentheseHoleFunction(chaine);Tab = chaine.toCharArray();}
						 
						 
					//extract the first sub-function
						 IntVar res_subsection=VF.bounded("res_subsection", -1000, 1000, solver);
						 
						 
						 if(MathFunction.LastOccur('(',Tab)!=-1)
							{
							  String subfunction="";
							  if(MathFunction.LastOccur('(',Tab)>MathFunction.FirstOccur(')',Tab))
							  {
								  char[] sousTab= new char[2000]; int j=0;
								  for(int i=MathFunction.LastOccur('(',Tab)+1;i<Tab.length;i++)
								  {
									  sousTab[j]=Tab[i];  j+=1;
								  }
								  for(int a=0;a<MathFunction.FirstOccur(')',sousTab);a++)
									 {
										 subfunction+=sousTab[a];//here we find the first sub function that we will operate
									 }
							  }
							  else
								  for(int a=MathFunction.LastOccur('(',Tab)+1;a<MathFunction.FirstOccur(')',Tab);a++)
									 {
										 subfunction+=Tab[a];//here we find the first sub function that we will operate
									 }
							  if (MathFunction.OperatorOccurenceNumber(subfunction)!=1)
							  	{String h =MathFunction.AddParenthesesubFunction(subfunction); 
							  	Test2.prompt(h);
							  	char[] Tabsubsectionx = h.toCharArray();
							  	h="";
							  	if(MathFunction.LastOccur('(',Tabsubsectionx)<MathFunction.FirstOccur(')',Tabsubsectionx))
								  {
									  char[] sousTab= new char[2000]; int j=0; 
									  for(int i=MathFunction.LastOccur('(',Tabsubsectionx)+1;i<Tabsubsectionx.length;i++)
									  {
										  sousTab[j]=Tabsubsectionx[i];  j+=1;
									  }
									  for(int a=0;a<MathFunction.FirstOccur(')',sousTab);a++)
										 {
											 h+=sousTab[a];//here we find the first sub function that we will operate
										 }
								  }
								  else
									  for(int a=MathFunction.LastOccur('(',Tabsubsectionx)+1;a<MathFunction.FirstOccur(')',Tabsubsectionx);a++)
										 {
											 h+=Tabsubsectionx[a];//here we find the first sub function that we will operate
										 }
							    subfunction=h;
							  	}
							Test2.prompt("subsection  "+subfunction);
							 
							  char[] Tabsubsection = subfunction.toCharArray();
							  char operator=MathFunction.NatureOfOperator(subfunction);
							  int posOp=MathFunction.FirstOccur(operator,Tabsubsection);
							  String part_gche=subfunction.substring(0, posOp); 
							  String part_dte=subfunction.substring(posOp+1,subfunction.length()); 
							//find part1
							  if(part_gche.equals("StartTime"))
								   part1IntVar=starttime;
							 if(part_gche.equals("FinishTime"))
								  part1IntVar=finishtime;
							  else
							  if(part_gche.equals("Duration"))
								  part1IntVar=duration;
							  else
							  if(part_gche.equals(namePhysicalProp1))
								  part1IntVar=firstphysicaldep;
							  else
							  if(part_gche.equals(namePhysicalProp2))
								  part1IntVar=secondphysicaldep;
							  else
							  if(part_gche.equals(namePhysicalProp3))
								  part1IntVar=thirdphysicaldep;
							  else
								  if(part_gche.startsWith("XX"))
								  {
									  int indice =Integer.parseInt(part_gche.substring(2,part_gche.length()));
									  part1IntVar=X[indice];
								  }
					     //find part2
							  if(part_dte.equals("StartTime"))
								  part2IntVar=starttime;
							  else
							  if(part_dte.equals("FinishTime"))
								  part2IntVar=finishtime;
							  else
							  if(part_dte.equals("Duration"))
								  part2IntVar=duration;
							  else
							  if(part_dte.equals(namePhysicalProp1))
								  part2IntVar=firstphysicaldep;
							  else
							  if(part_dte.equals(namePhysicalProp2))
								  part2IntVar=secondphysicaldep;
							  else
							  if(part_dte.equals(namePhysicalProp3))
							    part2IntVar=thirdphysicaldep;
							  else
								  if(part_gche.startsWith("XX"))
								  {
									  int indice =Integer.parseInt(part_gche.substring(2,part_gche.length()));
									  part2IntVar=X[indice];
								  }
						//create constraint
							  if(operator=='+')
							  { c[cont]=ICF.sum(new IntVar[] {part1IntVar,part2IntVar},res_subsection); X[PosX]=res_subsection;}
							  if(operator=='*')
								  {c[cont]=ICF.times(part1IntVar,part2IntVar,res_subsection);X[PosX]=res_subsection;}
							  if(operator=='/')
							  { c[cont]=ICF.eucl_div(part1IntVar,part2IntVar,res_subsection);X[PosX]=res_subsection;}
							  if(operator=='-')
							  { c[cont]=ICF.sum(new IntVar[] {part1IntVar,VF.minus(part2IntVar)},res_subsection);X[PosX]=res_subsection;}
							  cont+=1;
							 
							  //Test2.prompt("-----   "+subfunction);
							 
							  
							  
							  
							  chaine=chaine.substring(0,chaine.indexOf(subfunction)-1)+("XX"+PosX)+chaine.substring(chaine.indexOf(subfunction)+subfunction.length(	)	 +1				  ,chaine.length());
								 
							   char[] k=chaine.toCharArray();
							  int  p1= MathFunction.FirstOccur('(', k);
							  int  p2= MathFunction.FirstOccur(')', k);
							  int  p3= MathFunction.FirstOccur('X', k);
							 // for (int i=0; i<k.length;i++)
							  //	Test2.prompt(k[i]+" indice " +i);
							   if((p1+1)==(p3)&&(p2-1)==(p3+2))
							         {
								     	Test2.prompt("hhhi" + subfunction + "             "+chaine);
								     	subfunction= chaine.substring(0,p1)+("XX"+PosX)+chaine.substring(p2+1,chaine.length());
								     	Test2.prompt(subfunction);
								     	chaine=subfunction;
								     	
								     }
							   PosX+=1;
							//  Test2.prompt("subfunction sans ( )    "+subfunction);
							  Test2.prompt("new chaine = " +chaine);
							  
					 }		 
				}
					 
					 
	//developing math code of a unique-operator function
					 String part1="";
					 String part2="";
					 String resultat="";
							 if(MathFunction.OperatorOccurenceNumber(chaine)==1)
							 {
								 Tab=chaine.toCharArray();
								 char operator=MathFunction.NatureOfOperator(chaine);
								 int posOp=MathFunction.FirstOccur(operator,Tab);
								 int posEgale=MathFunction.FirstOccur('=',Tab);
								 //Test2.prompt("operator "+ operator+" position "+posOp);
								// Test2.prompt(" position "+posEgale);
								if(MathFunction.LastOccur('(',Tab)!=-1)
									 {
										 part1=chaine.substring(1,posOp);
										 part2=chaine.substring(posOp+1,posEgale-1);
										 resultat=chaine.substring(posEgale+1,chaine.length());
									 }
							    	if(MathFunction.LastOccur('(',Tab)==-1)
							    {
										 part1=chaine.substring(0, posOp);
										 part2=chaine.substring(posOp+1,posEgale);
										 resultat=chaine.substring(posEgale+1,chaine.length());
									 }
								// Test2.prompt("part1 "+part1 );
								// Test2.prompt(" part2 "+part2);
								// Test2.prompt(" resultat "+resultat);
								//find part1
								  if(part1.equals("StartTime"))
									   part1IntVar=starttime;
								 if(part1.equals("FinishTime"))
									  part1IntVar=finishtime;
								  else
								  if(part1.equals("Duration"))
									  part1IntVar=duration;
								  else
								  if(part1.equals(namePhysicalProp1))
									  part1IntVar=firstphysicaldep;
								  else
								  if(part1.equals(namePhysicalProp2))
									  part1IntVar=secondphysicaldep;
								  else
								  if(part1.equals(namePhysicalProp3))
									  part1IntVar=thirdphysicaldep;
								  else
									  if(part1.startsWith("XX"))
										  {
											  int indice =Integer.parseInt(part1.substring(2,part1.length()));
											  part2IntVar=X[indice];
										  }
						     //find part2
								  if(part2.equals("StartTime"))
									  part2IntVar=starttime;
								  else
								  if(part2.equals("FinishTime"))
									  part2IntVar=finishtime;
								  else
								  if(part2.equals("Duration"))
									  part2IntVar=duration;
								  else
								  if(part2.equals(namePhysicalProp1))
									  part2IntVar=firstphysicaldep;
								  else
								  if(part2.equals(namePhysicalProp2))
									  part2IntVar=secondphysicaldep;
								  else
								  if(part2.equals(namePhysicalProp3))
								    part2IntVar=thirdphysicaldep;
								  else
								  if(part2.startsWith("XX"))
									  {
										  int indice =Integer.parseInt(part2.substring(2,part2.length()));
										  part2IntVar=X[indice];
									  }
							//find resultat
								  if(resultat.equals("StartTime"))
									  res=starttime;
								  else
								  if(resultat.equals("FinishTime"))
									  res=finishtime;
								  else
								  if(resultat.equals("Duration"))
								    res=duration;
								  else
								  if(resultat.equals(namePhysicalProp1))
								    res=firstphysicaldep;
								  else
								  if(resultat.equals(namePhysicalProp2))
								     res=secondphysicaldep;
								  else
								  if(resultat.equals(namePhysicalProp3))
									  res=thirdphysicaldep;
								  
						//create constraint
								  if(operator=='+')
									  c[cont]=ICF.sum(new IntVar[] {part1IntVar,part2IntVar},res);
								  if(operator=='*')
									  c[cont]=ICF.times(part1IntVar,part2IntVar,res);
								  if(operator=='/')
									  c[cont]=ICF.eucl_div(part1IntVar,part2IntVar,res);
								  if(operator=='-')
									  c[cont]=ICF.sum(new IntVar[] {part1IntVar,VF.minus(part2IntVar)},res);
								  
								  
								 // Test2.prompt("constraint dep " +c[cont]);
								  cont+=1;
								  
							 }
				 }
			}
			 if(number==0)
				 Test2.prompt("No physical dependancy in  " + process.getAttributeValue("name"));
			 else
				 Test2.prompt(ch);
		   
	 }	   
// end physical dependency
		 //begin temporal dependency
		   for(Element process:lesdesprocess)
		   {
			   String id_bnd;
			   List<Element> listedesboundaryenvents1= process.getChildren("boundaryEvent", namespace);
			   if(process.getChildren("flowElement", namespace).isEmpty())
				   Test2.prompt("No temporal dependancies in " +process.getAttributeValue("name"));
			   else
			   {
				   Test2.prompt("temporal dependancies in " +process.getAttributeValue("name"));
				   for(Element flowElement :process.getChildren("flowElement", namespace))
				   {
					  trgRef = flowElement.getAttributeValue("targetRef");
			    	  srcRef = flowElement.getAttributeValue("sourceRef");
			          minval = flowElement.getAttributeValue("Min_value");
			       	  maxval = flowElement.getAttributeValue("Max_value");
			       	  IntVar srcData=null;
			          IntVar trgData=null;
			       	  int minval1 = Integer.parseInt(flowElement.getAttributeValue("Min_value"));
			       	  int maxval1 = Integer.parseInt(flowElement.getAttributeValue("Max_value"));
					   if(minval1!=0 && maxval1!=0)
					   {
					       	  Test2.prompt("     -> temporal dependency between "+trgRef+ " and "+srcRef);
						      Test2.prompt("     -> minimum value= "+minval+"   maximum value = "+maxval);
						      for(Element boundaryevent:listedesboundaryenvents1) 
						 	  {
						 		 id_bnd = boundaryevent.getAttributeValue("id");
						    	 String type = boundaryevent.getChild("eventDefinition",namespace).getAttributeValue("type",Namespace.getNamespace("http://www.w3.org/2001/XMLSchema-instance"));
						    	if(id_bnd.equals(srcRef))
						    	 {
						    		 if(type.compareTo("mm:MFI")!=0)
							    	 {
							    	    String ref_task = boundaryevent.getAttributeValue("attachedToRef");
					    		        String ch =ref_task.substring(3);
						    			for(int j = 0; j < T.length; j++)
							    		{
						    			   if (T[j]!=null)
						    			   {
						    				   if (T[j].getName().startsWith("Finish_Time_"+ch))
						    						   srcData=T[j];
						    			   }  
							    		}
							         }
						    		 if(type.compareTo("mm:MSI")!=0)
							    	 {
						    			String ref_task = boundaryevent.getAttributeValue("attachedToRef");
							    		String ch =ref_task.substring(3);
						    			for(int j = 0; j < T.length; j++)
							    		{
						    			   if (T[j]!=null)
						    			   {
						    				   if (T[j].getName().startsWith("Start_Time_"+ch))
						    						   srcData=T[j]; 
						    			   }  
							    		}
							         }
						    	   }
						    	if(id_bnd.equals(trgRef))
						    	 {
						    		 if(type.compareTo("mm:MFI")!=0)
							    	 {
							    	    String ref_task = boundaryevent.getAttributeValue("attachedToRef");
					    		        String ch =ref_task.substring(3);
						    			for(int j = 0; j < T.length; j++)
							    		{
						    			   if (T[j]!=null)
						    			   {
						    				   if (T[j].getName().startsWith("Finish_Time_"+ch))
						    						   trgData=T[j]; 
						    			   }  
							    		}
							         }
						    		 if(type.compareTo("mm:MSI")!=0)
							    	 {
						    			String ref_task = boundaryevent.getAttributeValue("attachedToRef");
							    		String ch =ref_task.substring(3);
						    			for(int j = 0; j < T.length; j++)
							    		{
						    			   if (T[j]!=null)
						    			   {
						    				   if (T[j].getName().startsWith("Start_Time_"+ch))
						    				   	 trgData=T[j]; 
						    			   }  
							    		}
							         }
						    	   }
						 	   }
						      
						    	c[cont]= ICF.arithm(trgData,">=",srcData,"+",minval1);
						    	c[cont+1]= ICF.arithm(trgData,"<=",srcData,"+",maxval1);
						    	Test2.prompt("     **** Temporal dependency constraint = "+ c[cont]);
						    	c[cont+1]= ICF.arithm(trgData,"<=",srcData,"+",maxval1);
						    	Test2.prompt("     **** Temporal dependency constraint = "+ c[cont+1]);
						    	cont+=2;
					   }
					
				   }
			     }
		      }
		   
	//end temporal dependency
	   for (int i = 0; i < c.length; i++) {
		   if(c[i]!=null)
		   {
       	      solver.post(c[i]) ; 
		   }
        }
        for (int i = 0; i < T.length; i++) {
        	if(T[i]!=null)
        	{
        		solver.set(IntStrategyFactory.lexico_LB(T[i]));
        	}
        }
        solver.findAllSolutions();
        Test2.prompt(""+solver);
        for (int i = 0; i < T.length; i++) 
        {
        	if(T[i]!=null)
        	{
        		Test2.prompt(""+T[i]);
        	}
        } 
        
	 }
//end try
	 catch (IOException e) 
	 {
	    Test2.prompt("Error while reading the file "+ e.getMessage());//Erreur lors de la lecture du fichier
	    e.printStackTrace();
	 } 
	 catch (JDOMException e)
	 {
	   	Test2.prompt("Error while building the JDOM file "+ e.getMessage() );//Erreur lors de la construction du fichier JDOM
	    e.printStackTrace();
	 }
   }
}