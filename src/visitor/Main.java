package visitor;

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

         

         parser.parse("/home/oscar/Documents/lutece-dev2/lutece-dev-example/webapp/WEB-INF/plugins/example.xml", new MyXMLHandler());


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
      System.out.println("Fin du parsing");
      
   }

}