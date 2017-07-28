import org.xml.sax.Attributes;

import org.xml.sax.SAXException;

import org.xml.sax.helpers.DefaultHandler;


public class MyXMLHandler extends DefaultHandler{
   public int compteur=0;
   //Nous nous servirons de cette variable plus tard

   private String node = null;
  


   //début du parsing

   public void startDocument() throws SAXException {

   }

   //fin du parsing

   public void endDocument() throws SAXException {

      

   } 
   
   
   /**

    * Redéfinition de la méthode pour intercepter les événements

    */

   public void startElement(String namespaceURI, String lname,

         String qname, Attributes attrs) throws SAXException {

      

     // System.out.println("---------------------------------------------");

      //cette variable contient le nom du nœud qui a créé l'événement

      //System.out.println("qname = " + qname);

      node = qname;

         

      //Cette dernière contient la liste des attributs du nœud

      if (attrs != null) {

         for (int i = 0; i < attrs.getLength(); i++) {

            //nous récupérons le nom de l'attribut

            String aname = attrs.getLocalName(i);

            //Et nous affichons sa valeur

            //System.out.println("Attribut " + aname + " valeur : " + attrs.getValue(i));

         }

      }

   }   


   public void endElement(String uri, String localName, String qName)

         throws SAXException{

     //System.out.println("Fin de l'élément " + qName);       

   }
   
   public void characters(char[] ch, int start, int end) throws SAXException {
	   
	   
	   if (node.equals("application-class")) {
	   compteur+=1;
       System.out.println("Nom de la Xpage n�" + compteur + ": "+ new String(ch, start, end));
       node="";
     //  System.out.println("Nombre de Xpages : " + compteur);
       
      
       
	   }
}

}