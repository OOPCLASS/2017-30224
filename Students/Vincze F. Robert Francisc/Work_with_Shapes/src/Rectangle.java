
public class Rectangle extends Shape {
    
	double width;
	double lenght;
	
	public Rectangle()
	{
		this.width=1.0;
		this.lenght=1.0;
	}
	
	public Rectangle(double width, double lenght)
	{
		this.width=width;
		this.lenght=lenght;
	}
	
	public Rectangle(double width, double lenght, String color, boolean filled)
	{
		this.width=width;
		this.lenght=lenght;
		this.color=color;
		this.filled=filled;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public  void setWidth(double width)
	{
		this.width=width;
	}
	
	public double getLenght()
	{
		return this.width;
	}
	
	public void setLenght(double lenght)
	{
		this.lenght=lenght;
	}
	
	public double getArea()
	{
		return this.lenght*this.width;
	}
	
	public double getPerimeter()
	{
		return 2*width+2*lenght;
	}
	
	public String toString()
	{
		return "A Rectangle with width="+this.width+" and lenght="+this.lenght+", which is a sublass of "+super.toString();
	}
}
