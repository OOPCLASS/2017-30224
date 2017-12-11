package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.*;

public abstract class Employee implements XML_Parsable{
	private String name;
	private Integer id;
	private Double salary;
	private Boolean isDead;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Boolean getIsDead() {
		return isDead;
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}
	public void decodeFromXml(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setId(Integer.valueOf((element.getElementsByTagName("id").item(0).getTextContent())));
		setSalary(Double.valueOf((element.getElementsByTagName("salary").item(0).getTextContent())));
		setIsDead(Boolean.valueOf((element.getElementsByTagName("isDead").item(0).getTextContent())));
	}
}


