package bpmnforcpsextension;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.search.strategy.IntStrategyFactory;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class perse {
   public static void main(String[] args) {
  try {
    	  Solver solver = new Solver("T");
    	  IntVar[] T = new IntVar[5];
    	  for (int i =0; i<T.length; i++){
    		  T[i] = VF.bounded("T_i", 0, 900, solver); 
    	  }
    	  Constraint[] c = new Constraint[5];
    	  IntVar[] A = new IntVar[5];
    	  for (int i =0; i<A.length; i++){
    		  A[i] = VF.bounded("A_i", 0, 900, solver); 
    	  }
         File inputFile = new File("input.txt");
         DocumentBuilderFactory dbFactory 
            = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder;

         dBuilder = dbFactory.newDocumentBuilder();

         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();

         XPath xPath =  XPathFactory.newInstance().newXPath();

         String expression = "/class/student";	        
         NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
         for (int i = 0; i < nodeList.getLength(); i++) {
            Node nNode = nodeList.item(i);
            System.out.println("\nCurrent Element :"   + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Student roll no : " 
                  + eElement.getAttribute("rollno"));
               
               System.out.println("First Name : " 
                  + eElement
                     .getElementsByTagName("firstname")
                     .item(0)
                     .getTextContent());
             
              System.out.println("Marks : " 
                  + eElement
                     .getElementsByTagName("marks")
                     .item(0)
                     .getTextContent());
              int a1 = Integer.parseInt(eElement.getAttribute("rollno"));
              int a2 = Integer.parseInt(eElement.getElementsByTagName("marks").item(0).getTextContent());
              T[i] = VF.bounded("T[i]", a2, a1, solver);
            }
         }
         for (int i = 0; i < T.length-1; i++) {
        	
        	c[i] = ICF.sum(new IntVar[]{T[i], T[i+1]} , A[i]);
        	 System.out.print(A[i]);
        	  solver.post(c[i]) ; 
         }
         
         // 4. Define the search strategy
         solver.set(IntStrategyFactory.lexico_LB(T));
         //solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, x);
         solver.findAllSolutions();
         for (int i = 0; i < c.length; i++) {
         System.out.print("Done" + c[i] );
         }
         
      } catch (ParserConfigurationException e) {
         e.printStackTrace();
      } catch (SAXException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (XPathExpressionException e) {
         e.printStackTrace();
      }
   }
}
	