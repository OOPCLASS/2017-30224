package javasmmr.zoowsome.models.animals;

public class Cock extends Bird {
	public Cock() {
		super.setNrOfLegs(2);
		super.setName("Coco");
	}
	
	public Cock(boolean migrates, int avgFlightAltitude) {
		super(migrates, avgFlightAltitude);
	}
}
