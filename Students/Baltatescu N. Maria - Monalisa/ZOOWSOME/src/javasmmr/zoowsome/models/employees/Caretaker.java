package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private Double workingHours;

	public Caretaker() { }
	public Caretaker(String name, Double salary, Boolean isDead, Integer id) {
		super.setName(name);
		super.setSalary(salary);
		super.setIsDead(isDead);
		super.setId(id);
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal animal) {
		if (animal.kill())
			return Constants.Employees.Caretaker.TCO_KILLED;
		if (animal.maintenanceCost > workingHours)
			return Constants.Employees.Caretaker.TCO_NO_TIME;
		animal.setTakenCareOf(true);
		workingHours = workingHours - animal.maintenanceCost;
		return Constants.Employees.Caretaker.TCO_SUCCESS;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		this.workingHours = Double.valueOf((element.getElementsByTagName("workingWours").item(0).getTextContent()));
		
	}
}
