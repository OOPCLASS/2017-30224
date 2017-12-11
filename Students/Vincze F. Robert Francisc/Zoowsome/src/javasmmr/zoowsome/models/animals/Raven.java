package javasmmr.zoowsome.models.animals;

public class Raven extends Bird {

	public Raven(Integer nrOfLegs, String Name, Boolean migrates, Integer avgFlightAltitude, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);

	}

	public Raven(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(2);
		this.setName("Raven");
		this.setMigrates(false);
		this.setAvgFlightAltitude(60);

	}
}
