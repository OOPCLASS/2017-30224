package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}

	public Eagle(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(2);
		super.setName("Implicit_Eagle_Name");
		super.setMigrates(true);
		super.setAvgFlightAltitude(11000);
	}
}
