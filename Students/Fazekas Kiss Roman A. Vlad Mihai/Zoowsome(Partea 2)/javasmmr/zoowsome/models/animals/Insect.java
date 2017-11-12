package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {

	private Boolean canFly;
	private Boolean isDangerous;

	public Insect(int nrOfLegs, String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public Insect(Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	
	public Boolean getCanFly() {
		return canFly;
	}

	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}

	public Boolean getIsDangerous() {
		return isDangerous;
	}

	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
}
