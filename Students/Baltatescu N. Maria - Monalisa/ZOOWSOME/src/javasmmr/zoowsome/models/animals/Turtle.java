package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Turtle extends Reptile {
	public Turtle() {
	}

	public Turtle(Boolean laysEggs, Double maintenanceCost, Double dangerPerc) {
		super(laysEggs, maintenanceCost, dangerPerc);
		super.setName("Toto");
		super.setNrOfLegs(new Integer(4));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Turtle);
	}
}
