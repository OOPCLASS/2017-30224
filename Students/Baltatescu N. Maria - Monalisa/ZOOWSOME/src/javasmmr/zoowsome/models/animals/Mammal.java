package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {
	private Float normalBodyTemp;
	private Float percBodyHair;

	public Mammal() {
	}

	public Mammal(Float normalBodyTemp, Float percBodyHair, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		this.normalBodyTemp = Float.valueOf((element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		this.percBodyHair = Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent());
	}

}
