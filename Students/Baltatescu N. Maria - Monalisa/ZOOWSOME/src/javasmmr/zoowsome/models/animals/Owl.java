package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {
	public Owl() {
		super.setNrOfLegs(2);
		super.setName("Bobo");
	}
	
	public Owl(boolean migrates, int avgFlightAltitude) {
		super(migrates, avgFlightAltitude);
	}
}
