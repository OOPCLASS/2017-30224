package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private WaterType waterType;

	public Aquatic() {
	}

	public Aquatic(Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "waterType", String.valueOf(this.waterType));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		this.avgSwimDepth = Integer.valueOf((element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		this.waterType = WaterType.valueOf((element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
