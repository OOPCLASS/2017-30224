package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Parrot extends Bird {
	public Parrot() {
	}

	public Parrot(Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, Double dangerPerc) {
		super(migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
		super.setName("Paco");
		super.setNrOfLegs(new Integer(2));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Parrot);
	}
}
