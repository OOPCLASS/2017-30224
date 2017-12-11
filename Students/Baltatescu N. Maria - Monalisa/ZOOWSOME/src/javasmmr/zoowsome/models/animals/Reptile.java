package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Reptile() {
	}

	public Reptile(Boolean laysEggs, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		this.laysEggs = Boolean.valueOf((element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
