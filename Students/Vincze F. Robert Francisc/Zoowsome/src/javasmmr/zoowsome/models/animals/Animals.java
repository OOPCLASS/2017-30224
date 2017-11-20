package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animals implements Killer {

	private Integer nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	boolean takenCareOf;

	public Animals(double maintenanceCost, double dangerPerc) {
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		this.takenCareOf = false;
	}

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public abstract void makesSound();

	public boolean kill() {
		Random rand = new Random();
		float randomNumber = rand.nextInt(100) / 100;

		return (randomNumber >= this.dangerPerc);
	}

}
