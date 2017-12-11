package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private  Boolean isDangerous;
	public Insect() { }
	public Insect(Boolean canFly, Boolean isDangerous, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		this.canFly = Boolean.valueOf((element.getElementsByTagName("canFly").item(0).getTextContent()));
		this.isDangerous = Boolean.valueOf((element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
