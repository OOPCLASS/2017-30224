package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect {
	public Spider() {
	}

	public Spider(Boolean canFly, Boolean isDangerous, Double maintenanceCost, Double dangerPerc) {
		super(canFly, isDangerous, maintenanceCost, dangerPerc);
		super.setName("Soso");
		super.setNrOfLegs(new Integer(6));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider);
	}
}
