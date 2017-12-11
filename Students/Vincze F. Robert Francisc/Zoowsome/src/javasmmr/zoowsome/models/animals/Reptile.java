package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animals {

	private Boolean laysEggs;

	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public Boolean doesLayEggs() {
		return this.laysEggs;
	}

	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public void makesSound() {
		System.out.println("Sssssssssss");
	}
}
