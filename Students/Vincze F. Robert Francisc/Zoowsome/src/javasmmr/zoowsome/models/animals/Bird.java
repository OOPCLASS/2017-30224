package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animals {

	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public Boolean getMigrates() {
		return this.migrates;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public void makesSound() {
		System.out.println("Cucuriguuuuu");
	}
}
