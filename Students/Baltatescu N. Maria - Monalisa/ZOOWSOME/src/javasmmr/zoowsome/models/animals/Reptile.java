package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private boolean laysEggs;

	public Reptile(boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}
}
