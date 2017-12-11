
public class Circle extends Shape {
   
	double radius;
	
	public Circle()
	{
		this.radius=1.0;
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public Circle(double radius, String color,boolean filled)
	{
		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter()
	{
		return 2 *Math.PI *radius;
	}
	
	public String toString()
	{
		return "A circle with radius="+this.radius+" which is subclass of "+super.toString();
	}
	
	
}
