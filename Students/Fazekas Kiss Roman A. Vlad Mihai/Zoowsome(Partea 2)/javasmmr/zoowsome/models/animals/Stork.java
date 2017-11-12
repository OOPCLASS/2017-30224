package javasmmr.zoowsome.models.animals;

public class Stork extends Bird {

	public Stork(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}

	public Stork(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(2);
		super.setName("Implicit_Stork_Name");
		super.setMigrates(true);
		super.setAvgFlightAltitude(4800);
	}
}
