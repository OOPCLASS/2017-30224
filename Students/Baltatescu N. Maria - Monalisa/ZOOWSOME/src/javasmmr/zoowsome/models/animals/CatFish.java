package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class CatFish extends Aquatic {

	public CatFish() {
	}

	public CatFish(Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(avgSwimDepth, waterType, maintenanceCost, dangerPerc);
		super.setName("Pisi");
		super.setNrOfLegs(new Integer(0));
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.CatFish);
	}
}
