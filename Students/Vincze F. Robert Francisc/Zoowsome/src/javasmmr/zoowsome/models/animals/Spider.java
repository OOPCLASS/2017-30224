package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(Integer nrOfLegs, String Name, Boolean canFly, Boolean isDangerous, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(nrOfLegs);
		this.setName(Name);
		this.setCanFly(canFly);
		this.setDanger(isDangerous);

	}

	public Spider(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setNrOfLegs(8);
		this.setName("Spider");
		this.setCanFly(false);
		this.setDanger(true);

	}
}
