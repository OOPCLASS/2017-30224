package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.models.animals.*;
import java.util.*;
import java.io.*;
import javasmmr.zoowsome.services.factories.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/*import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;*/
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.interfaces.*;

public class AnimalRepository {
	public static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {

	}

	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// Create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		// Create an EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		// Create and write Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		// Create content open tag
		StartElement configStartElement = eventFactory.createStartElement(" ", " ", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);

		for (XML_Parsable animal : animals) {
			StartElement sElement = eventFactory.createStartElement(" ", " ", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);

			animal.encodeToXml(eventWriter);

			EndElement eElement = eventFactory.createEndElement(" ", " ", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}

		eventWriter.add(eventFactory.createEndElement(" ", " ", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
				case Constants.Animals.Mammals.Dog:
					Animal dog = new Dog();
					dog.decodeFromXml(element);
					animals.add(dog);
				case Constants.Animals.Mammals.Dolphin:
					Animal dolphin = new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
				case Constants.Animals.Birds.Cock:
					Animal cock = new Cock();
					cock.decodeFromXml(element);
					animals.add(cock);
				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl();
					owl.decodeFromXml(element);
					animals.add(owl);
				case Constants.Animals.Birds.Parrot:
					Animal parrot = new Parrot();
					parrot.decodeFromXml(element);
					animals.add(parrot);
				case Constants.Animals.Aquatics.CatFish:
					Animal catFish = new CatFish();
					catFish.decodeFromXml(element);
					animals.add(catFish);
				case Constants.Animals.Aquatics.Octopus:
					Animal octopus = new Octopus();
					octopus.decodeFromXml(element);
					animals.add(octopus);
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);
				case Constants.Animals.Insects.Ant:
					Animal ant = new Ant();
					ant.decodeFromXml(element);
					animals.add(ant);
				case Constants.Animals.Insects.Bee:
					Animal bee = new Bee();
					bee.decodeFromXml(element);
					animals.add(bee);
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider();
					spider.decodeFromXml(element);
					animals.add(spider);
				case Constants.Animals.Reptiles.Chameleon:
					Animal chameleon = new Chameleon();
					chameleon.decodeFromXml(element);
					animals.add(chameleon);
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle();
					turtle.decodeFromXml(element);
					animals.add(turtle);
				default: break;
				}
			}
		}
		return animals;
	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create STart node
		StartElement sElement = eventFactory.createStartElement(" ", " ", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create end node
		EndElement eElement = eventFactory.createEndElement(" ", " ", name);
		eventWriter.add(eElement);
		eventWriter.add(end);

	}
}
