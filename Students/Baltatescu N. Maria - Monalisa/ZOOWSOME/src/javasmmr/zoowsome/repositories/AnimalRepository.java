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

public class AnimalRepository extends EntityRepository{
	public static final String XML_FILENAME = "Animals1.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}


	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
				.getTextContent();
		switch (discriminant) {
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Mammals.Dog:
			Animal dog = new Dog();
			dog.decodeFromXml(element);
			return dog;
		case Constants.Animals.Mammals.Dolphin:
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animals.Birds.Cock:
			Animal cock = new Cock();
			cock.decodeFromXml(element);
			return cock;
		case Constants.Animals.Birds.Owl:
			Animal owl = new Owl();
			owl.decodeFromXml(element);
			return owl;
		case Constants.Animals.Birds.Parrot:
			Animal parrot = new Parrot();
			parrot.decodeFromXml(element);
			return parrot;
		case Constants.Animals.Aquatics.CatFish:
			Animal catFish = new CatFish();
			catFish.decodeFromXml(element);
			return catFish;
		case Constants.Animals.Aquatics.Octopus:
			Animal octopus = new Octopus();
			octopus.decodeFromXml(element);
			return octopus;
		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
		case Constants.Animals.Insects.Ant:
			Animal ant = new Ant();
			ant.decodeFromXml(element);
			return ant;
		case Constants.Animals.Insects.Bee:
			Animal bee = new Bee();
			bee.decodeFromXml(element);
			return bee;
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Reptiles.Chameleon:
			Animal chameleon = new Chameleon();
			chameleon.decodeFromXml(element);
			return chameleon;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle();
			turtle.decodeFromXml(element);
			return turtle;
		default: break;
		}
		return null;
	}
}


