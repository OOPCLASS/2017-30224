package javasmmr.zoowsome.models.animals;

public class Cock extends Bird {
	
	public Cock(boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
		super.setName("Coco");
		super.setNrOfLegs(2);
	}
}
