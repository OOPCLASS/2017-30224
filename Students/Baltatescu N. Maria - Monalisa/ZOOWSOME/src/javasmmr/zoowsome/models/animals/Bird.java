package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAltitude;
	
	public Bird(boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
