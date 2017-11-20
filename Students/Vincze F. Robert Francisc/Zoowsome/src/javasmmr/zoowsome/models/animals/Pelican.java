package javasmmr.zoowsome.models.animals;

public class Pelican extends Bird {

	public Pelican(Integer nrOfLegs, String Name, Boolean migrates, Integer avgFlightAltitude, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);

	}

	public Pelican(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(2);
		this.setName("Pelican");
		this.setMigrates(true);
		this.setAvgFlightAltitude(65);

	}
}
