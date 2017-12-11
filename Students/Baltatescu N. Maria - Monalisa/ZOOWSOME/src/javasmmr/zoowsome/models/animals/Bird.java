package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Bird() {
	}

	public Bird(Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		this.migrates = Boolean.valueOf((element.getElementsByTagName("migrates").item(0).getTextContent()));
		this.avgFlightAltitude = Integer
				.valueOf((element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
