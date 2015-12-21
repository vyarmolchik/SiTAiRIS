package pharmacy;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

public class ReadXMLFile {

    public static void main(String argv[]) {

        try {

            File fXmlFile = new File("j:/pharmacy1.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            String tagName = argv[0];

            if(tagName.equals("pharmacy") || 
               tagName.equals("pharmacyOwner") || 
               tagName.equals("pharmacyName") || 
               tagName.equals("pharmacyDruggist") || 
               tagName.equals("pharmacyOpenDate") || 
               tagName.equals("pharmacyPhone") || 
               tagName.equals("pharmacyCount")) {

                NodeList nList = doc.getElementsByTagName("pharmacy");
                if(tagName.equals("pharmacy")) {
                    for (int temp = 0; temp < nList.getLength(); temp++) {

                        Node nNode = nList.item(temp);

                        System.out.println("\nCurrent Element :" + nNode.getNodeName());

                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;

                            System.out.println("Pharmacy : " + eElement.getAttribute("id"));
                            System.out.println("Owner : " + eElement.getElementsByTagName("pharmacyOwner").item(0).getTextContent());
                            System.out.println("Name pharmacy : " + eElement.getElementsByTagName("pharmacyName").item(0).getTextContent());
                            System.out.println("Druggist : " + eElement.getElementsByTagName("pharmacyDruggist").item(0).getTextContent());
                            System.out.println("Opening date : " + eElement.getElementsByTagName("pharmacyOpenDate").item(0).getTextContent());
                            System.out.println("Phone : " + eElement.getElementsByTagName("pharmacyPhone").item(0).getTextContent());
                            System.out.println("Count : " + eElement.getElementsByTagName("pharmacyCount").item(0).getTextContent());

                        }
                    }
                }
                else {   
                    for (int temp = 0; temp < nList.getLength(); temp++) {
                        Node nNode = nList.item(temp);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;

                            System.out.println(tagName + " : " + eElement.getElementsByTagName(tagName).item(0).getTextContent());
                        }
                    }
                }
            }
            else{
                System.out.println("This element does not exist");
            }
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
            e.printStackTrace();
        }
    }
}