package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Dolphin extends Mammal {
	public Dolphin() {
	}

	public Dolphin(float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
		super(normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
		super.setName("Didi");
		super.setNrOfLegs(new Integer(0));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Dolphin);
	}

}
