
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape Shape1=new Shape("Yellow",false);
		
		System.out.println(Shape1.toString());
		
		Shape1.setColor("Red");
		
		System.out.println(Shape1.toString());
		
	    if(Shape1.isFilled())
	    {
	      System.out.println("Shape1 is filled");
	    }
	    else
	    {
	    	System.out.println("Shape1 is not filled");
	    }
	    
	    Rectangle Rectangle1=new Rectangle(3,7,"Black",true);
	    
	    System.out.println(Rectangle1.toString());
	    
	    System.out.println("Area of Rectangle1 is "+ Rectangle1.getArea());
	    System.out.println("Perimeter of Rectangle1 is "+ Rectangle1.getPerimeter());
	    
        Square Square1=new Square(7.5,"White",true);
        
        System.out.println(Square1.toString());
        
        Square1.setLenght(5);
        
        System.out.println("Area of Square1 is "+ Square1.getArea());
	    System.out.println("Perimeter of Square1 is "+ Square1.getPerimeter());
	    
	}

}
