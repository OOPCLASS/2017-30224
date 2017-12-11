package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animals {

	private Boolean canFly;
	private Boolean isDangerous;
	
	public Insect(double maintenanceCost,double dangerPerc)
	{
		super(maintenanceCost,dangerPerc);
	}
	public Boolean isFlying()
	{
		return this.canFly;
	}
	
	public void setCanFly(Boolean canFly)
	{
		this.canFly=canFly;
	}
	
	public Boolean getDanger()
	{
		return this.isDangerous;
	}
	
	public void setDanger(Boolean isDangerous)
	{
		this.isDangerous=isDangerous;
	}
	
	public void makesSound()
	{
		System.out.println("Bzzzzzzzzzzz");
	}
}
