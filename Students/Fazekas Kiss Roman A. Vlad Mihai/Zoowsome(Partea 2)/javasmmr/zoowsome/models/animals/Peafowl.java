package javasmmr.zoowsome.models.animals;

public class Peafowl extends Bird {

	public Peafowl(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}

	public Peafowl(Double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(2);
		super.setName("Implicit_Peafowl_Name");
		super.setMigrates(false);
		super.setAvgFlightAltitude(0);
	}
}
