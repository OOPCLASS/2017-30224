package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Dog extends Mammal {
	public Dog() {
	}

	public Dog(float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
		super(normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
		super.setName("Zack");
		super.setNrOfLegs(new Integer(4));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Dog);
	}

}
