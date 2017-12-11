package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Octopus extends Aquatic {
	public Octopus() {
	}

	public Octopus(Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(avgSwimDepth, waterType, maintenanceCost, dangerPerc);
		super.setName("Oti");
		super.setNrOfLegs(new Integer(8));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Octopus);
	}
}
