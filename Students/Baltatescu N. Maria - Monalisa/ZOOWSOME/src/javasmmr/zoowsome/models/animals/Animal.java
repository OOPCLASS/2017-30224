package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	public final double maintenanceCost;
	public final double dangerPerc;
	private boolean takenCareOf = false;

	public Animal(double maintenanceCost, double dangerCost) {
		this.dangerPerc = dangerCost;
		this.maintenanceCost = maintenanceCost;
	}

	public int getNrOfLegs() {
		return nrOfLegs;
	}

	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean kill() {
		double number = 0.5;
		//Random random = new Random();
		//number = random.nextDouble();

		if (dangerPerc < number)
			return false;
		else
			return true;
	}
}
