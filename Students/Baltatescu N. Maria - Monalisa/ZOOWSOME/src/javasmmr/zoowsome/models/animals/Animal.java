package javasmmr.zoowsome.models.animals;

import java.util.Random;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.*;

public abstract class Animal implements Killer, XML_Parsable {
	// private int nrOfLegs;
	Integer nrOfLegs;
	private String name;
	public Double maintenanceCost;
	public Double dangerPerc;
	private Boolean takenCareOf = false;

	public Animal() {
	}

	public Animal(Double maintenanceCost, Double dangerCost) {
		this.dangerPerc = dangerCost;
		this.maintenanceCost = maintenanceCost;
	}

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public Double getDangerPerc() {
		return dangerPerc;
	}

	public void setDangerPerc(Double dangerPerc) {
		this.dangerPerc = dangerPerc; // nu stiu cum sa rezolv problema asta..
	}

	public Boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean kill() {
		double number = 0.5;
		// Random random = new Random();
		// number = random.nextDouble();

		if (dangerPerc < number)
			return false;
		else
			return true;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf((element.getElementsByTagName("nrOfLegs").item(0).getTextContent())));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf((element.getElementsByTagName("maintenanceCost").item(0).getTextContent())));
		setDangerPerc(Double.valueOf((element.getElementsByTagName("dangerPerc").item(0).getTextContent())));
		setTakenCareOf(Boolean.valueOf((element.getElementsByTagName("takenCareOf").item(0).getTextContent())));
	}
}
