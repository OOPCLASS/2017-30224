package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {
	
	public Owl(boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
		super.setName("Bobo");
		super.setNrOfLegs(2);
	}
}
