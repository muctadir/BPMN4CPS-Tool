package bpmnforcpsextension;

import java.lang.reflect.Array;

public class MathFunction {
	public MathFunction() {
		super();
	}
	public static int LastOccur(char c,char[] T)
	{
		int i=0;
		int occur=0;int nb=0;
		while(i<T.length)
			{
			if(T[i]==c)
				{occur=i; nb+=1;}
		     i+=1;
			}
			if (nb==0)
				return -1;
			else
				return occur;
	}
	public static int FirstOccur(char c,char[] T)
	{
		int i=0;
		int occur=0; int nb=0;
		while(i<T.length&&nb==0)
			{
				if(T[i]==c)
				 {occur=i; nb+=1;}
				else
					i+=1;
			}
		if (nb==0)
			return -1;
		else
			return occur;
	}
	public static char NatureOfOperator(String ch)
	{
		if(ch.contains("+"))
				return '+';
		if(ch.contains("-"))
			return '-';
		if(ch.contains("*"))
			return '*';
		if(ch.contains("/"))
			return '/';
		return '!';
	}
	public static int OperatorOccurenceNumber(String ch)
	{
		int cont=0;
		char[] T= ch.toCharArray();
		for(int i=0; i<T.length;i++)
			if(T[i]=='+' ||T[i]=='-' ||T[i]=='/' ||T[i]=='*')
				cont+=1;
		return cont;
		
	}
	public static int ContainsLetters (String s)
	{
		char[] T= s.toCharArray();int nbLetters=0; 
		for(int i=0; i<T.length;i++)
			if(((int)T[i]>=65 &&(int)T[i]<=90)||((int)T[i]>=97 &&(int)T[i]<=122))
			{
				nbLetters+=1;
			}
		return nbLetters;
	}
	public static int nbexcal(String[] T)
	{
		int cont=0;
		for(int i=0;i<T.length;i++)
			if (T[i]=="!")
				cont++;
		return cont;
	}
	public  static String AddParentheseHoleFunction(String ch)
	{
		String res="";char[] T1=ch.toCharArray();
		//var resultat  
		for(int i=ch.indexOf("="); i<(T1.length);i++)
		{
	
			if(((int)T1[i]>=65 &&(int)T1[i]<=90)||((int)T1[i]>=97 &&(int)T1[i]<=122)||((int)T1[i]>=48 &&(int)T1[i]<=57))
				{res+=T1[i];  }
		}
		//System.out.println(res);
		
		
		String ch1= ch.substring(0,ch.indexOf("="));
		
		char[] T=ch1.toCharArray();
		String [] VariableTab=new String[T.length+1]; int compteurVariableTab=0;int compteurVariableOp=0;
		char [] VariableOp=new char[T.length+1];
		ch="";
		String chaine="";
		int X=0;int k=0;
                int z=0;
		for(int i=0; i<(T.length);i++)
		{
	
			if(((int)T[i]>=65 &&(int)T[i]<=90)||((int)T[i]>=97 &&(int)T[i]<=122)||((int)T[i]>=48 &&(int)T[i]<=57))
				{ch+=T[i];  }
			else
                        
                            if(i!=T.length)
                            {
                                VariableOp[compteurVariableOp++]=T[i];
                               // System.out.println(X+":"+ch);
                                VariableTab[compteurVariableTab]=ch;
                                compteurVariableTab++;
                                ch="";
                                X=X+1;
                            }
                         if(i==((T.length)-1))
                            {
                                VariableTab[compteurVariableTab]=ch;
                                X=1+X;
                            }
		}
                //System.out.println(""+z);
               
	
		String[]th = new String[X];
		for(int i=0; i<X;i++)
			{
			 th[i]=VariableTab[i];
			// System.out.println(th[i]);
			}
		while(nbexcal(VariableTab)!=(X-1))
		{
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='/')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'/'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}		
			}	
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='*')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'*'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}		
			}	
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='+')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'+'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}		
			}	
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='-')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'-'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}	
			}	
		}
	return chaine+"="+res;
		
	}
	public  static String AddParenthesesubFunction(String ch)
	{
		
		
		
		
		char[] T=ch.toCharArray();
		
		String [] VariableTab=new String[T.length+1]; int compteurVariableTab=0;int compteurVariableOp=0;
		char [] VariableOp=new char[T.length+1];
		ch="";
		String chaine="";
		int X=0;int k=0;
                int z=0;
		for(int i=0; i<(T.length);i++)
		{
	
			if(((int)T[i]>=65 &&(int)T[i]<=90)||((int)T[i]>=97 &&(int)T[i]<=122)||((int)T[i]>=48 &&(int)T[i]<=57))
				{ch+=T[i];  }
			else
                        
                            if(i!=T.length)
                            {
                                VariableOp[compteurVariableOp++]=T[i];
                               // System.out.println(X+":"+ch);
                                VariableTab[compteurVariableTab]=ch;
                                compteurVariableTab++;
                                ch="";
                                X=X+1;
                            }
                         if(i==((T.length)-1))
                            {
                                VariableTab[compteurVariableTab]=ch;
                                X=1+X;
                            }
		}
                //System.out.println(""+z);
               
	
		String[]th = new String[X];
		for(int i=0; i<X;i++)
			{
			 th[i]=VariableTab[i];
			// System.out.println(th[i]);
			}
		while(nbexcal(VariableTab)!=(X-1))
		{
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='/')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'/'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}		
			}	
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='*')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'*'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}		
			}	
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='+')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'+'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}		
			}	
			for(int i=0; i<VariableOp.length;i++)
			{
				int j=i+1;
				if(VariableOp[i]=='-')
				{
					while(VariableTab[j]=="!")
						j++;
					chaine='('+VariableTab[i]+'-'+VariableTab[j]+')';
					VariableTab[j]=chaine;
					VariableTab[i]="!";
					VariableOp[i]='!';
				}	
			}	
		}
	return chaine.substring(1,chaine.length()-1);
		//return chaine;
	}
/*	public static void main(String[] args)
	{
		AddParenthesesubFunction("azerty*reza+fgrtrt-ferrfefe/fr*frefre");
	}*/
	
}
