package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {

	private Integer nrOfLegs;
	private String name;
	final Double maintenanceCost;
	final Double dangerPerc;
	private Boolean takenCareOf = false;

	public Animal(Double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public boolean kill() {
		if ((new Random()).nextDouble() < dangerPerc) {
			return true;
		}
		return false;
	}

	public Double getMaintenanceCost() {
		return maintenanceCost;
	}

	public Boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
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
}
