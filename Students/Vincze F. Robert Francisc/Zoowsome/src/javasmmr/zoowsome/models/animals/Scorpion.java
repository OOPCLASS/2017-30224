package javasmmr.zoowsome.models.animals;

public class Scorpion extends Insect {

	public Scorpion(Integer nrOfLegs, String Name, Boolean canFly, Boolean isDangerous, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setCanFly(canFly);
		this.setDanger(isDangerous);

	}

	public Scorpion(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(4);
		this.setName("Scorpion");
		this.setCanFly(false);
		this.setDanger(true);

	}
}
