package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot() {
		super.setNrOfLegs(2);
		super.setName("Paco");
	}
	
	public Parrot(boolean migrates, int avgFlightAltitude) {
		super(migrates, avgFlightAltitude);
	}
}
