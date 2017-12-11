package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {

	public Owl(Integer nrOfLegs, String Name, Boolean migrates, Integer avgFlightAltitude, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);

	}

	public Owl(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(2);
		this.setName("Owl");
		this.setMigrates(false);
		this.setAvgFlightAltitude(35);

	}
}
