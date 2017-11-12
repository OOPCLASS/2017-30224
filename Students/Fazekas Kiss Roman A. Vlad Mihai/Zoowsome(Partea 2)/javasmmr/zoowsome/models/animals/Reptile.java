package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {

	private Boolean laysEggs;

	public Reptile(int nrOfLegs, String name, Boolean laysEggs, Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		this.laysEggs = laysEggs;
	}
	
	public Reptile(Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	
	public Boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(Boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
