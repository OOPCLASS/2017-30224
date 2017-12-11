package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Ant extends Insect {

	public Ant() {
	}

	public Ant(Boolean canFly, Boolean isDangerous, Double maintenanceCost, Double dangerPerc) {
		super(canFly, isDangerous, maintenanceCost, dangerPerc);
		super.setName("Ani");
		super.setNrOfLegs(new Integer(6));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Ant);
	}
}
