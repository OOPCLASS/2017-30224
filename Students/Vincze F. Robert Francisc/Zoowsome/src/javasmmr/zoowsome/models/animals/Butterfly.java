package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(Integer nrOfLegs, String Name, Boolean canFly, Boolean isDangerous, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setCanFly(canFly);
		this.setDanger(isDangerous);

	}

	public Butterfly(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(4);
		this.setName("Butterfly");
		this.setCanFly(true);
		this.setDanger(false);

	}
}
