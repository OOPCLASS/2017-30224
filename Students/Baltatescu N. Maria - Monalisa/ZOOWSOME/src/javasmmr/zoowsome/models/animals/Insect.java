package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	public Insect() {
		
	}
	
	public Insect(boolean canFly, boolean isDangerous) {
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
}
