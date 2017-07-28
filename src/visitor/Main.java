import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import javax.xml.parsers.SAXParser;

import javax.xml.parsers.SAXParserFactory;

import javax.xml.transform.TransformerFactoryConfigurationError;

import org.w3c.dom.DOMException;

import org.xml.sax.SAXException;


public class Main {


   public static void main(String[] args) {


      try {

    	  SAXParserFactory factory = SAXParserFactory.newInstance();

         SAXParser parser = factory.newSAXParser();
         
         MyXMLHandler xmlH = new MyXMLHandler();
         

         parser.parse("example.xml", xmlH);
         
         System.out.println("Nombre de Xpages : "+xmlH.compteur);


      } catch (DOMException e) {

         e.printStackTrace();

      } catch (ParserConfigurationException e) {

         e.printStackTrace();

      } catch (TransformerFactoryConfigurationError e) {

         e.printStackTrace();

      } catch (SAXException e) {

         e.printStackTrace();

      } catch (IOException e) {

         // TODO Auto-generated catch block

         e.printStackTrace();

      }

      
   }

}import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import javax.xml.parsers.SAXParser;

import javax.xml.parsers.SAXParserFactory;

import javax.xml.transform.TransformerFactoryConfigurationError;

import org.w3c.dom.DOMException;

import org.xml.sax.SAXException;


public class Main {


   public static void main(String[] args) {


      try {

    	  SAXParserFactory factory = SAXParserFactory.newInstance();

         SAXParser parser = factory.newSAXParser();
         
         MyXMLHandler xmlH = new MyXMLHandler();
         

         parser.parse("example.xml", xmlH);
         
         System.out.println("Nombre de Xpages : "+xmlH.compteur);


      } catch (DOMException e) {

         e.printStackTrace();

      } catch (ParserConfigurationException e) {

         e.printStackTrace();

      } catch (TransformerFactoryConfigurationError e) {

         e.printStackTrace();

      } catch (SAXException e) {

         e.printStackTrace();

      } catch (IOException e) {

         // TODO Auto-generated catch block

         e.printStackTrace();

      }

      
   }

}