package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private boolean laysEggs;

	public Reptile() {

	}

	public Reptile(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
