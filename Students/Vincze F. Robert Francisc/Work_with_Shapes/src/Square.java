
public class Square extends Rectangle {
   
	public Square()
	{
	   super();	
	}
	
	public Square(double side)
	{
		super(side,side);
	}
	
	public Square(double side,String color,boolean filled)
	{
		super(side,side,color,filled);
	}
	
	///let's say we call the lenght getter
	public double getSide()
	{
		return super.lenght;
	} 
	
	public void setSide(double side)
	{
		super.setLenght(side);
		super.setWidth(side);
	}
	
	///if we wish to overwrite the setters of the superclass, basically
	///setLenght and setWidth are doing the same thing as setSide
	public void setLenght(double side)
	{
		this.setSide(side);
	}
	
	public void setWidth(double side)
	{
		this.setSide(side);
	}
	
	public String toString()
	{
		return "A Square with side="+this.lenght+", which is a subclass of "+ super.toString();
	}
	
	
	
	
}
