package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAltitude;
	
	public Bird() {
		
	}
	
	public Bird(boolean migrates, int avgFlightAltitude) {
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
