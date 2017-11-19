package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {

	public Parrot(boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
		super.setName("Paco");
		super.setNrOfLegs(2);
	}
}
