package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{

	private float normalBodyTemp;
	private float percBodyHair;
	
	public Mammal(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		super.setNrOfLegs(nrOfLegs);
		super.setName(name);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
	public Mammal(Double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
	}
	
	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
}
