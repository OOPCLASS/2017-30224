package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {

	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(int nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public Bird(Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	
	public Boolean getMigrates() {
		return migrates;
	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
}
