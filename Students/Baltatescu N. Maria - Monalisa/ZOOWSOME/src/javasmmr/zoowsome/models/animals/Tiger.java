package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {
	public Tiger() {
	}

	public Tiger(float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
		super(normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
		super.setName("Timi");
		super.setNrOfLegs(new Integer(4));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}

}
