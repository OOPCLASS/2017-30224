
public class Complex {

	private double real;
	private double imag;
	
	public Complex()
	{
		real=0.0;
		imag=0.0;
	}
	
	public Complex(double real, double imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	public double getReal()
	{
		return this.real;
	}
	
	public void setReal(double real)
	{
		this.real=real;
	}
	
	public double getImag()
	{
		return this.imag;
	}
	
	public void setImag(double imag)
	{
		this.imag=imag;
	}
	
	public void setValue(double real, double imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	public String toString()
	{ 
		
		return this.real+" + "+"i*("+this.imag+")";
	}
	
	public boolean isReal()
	{
		return this.imag==0;
	}
	
	public boolean isImaginary()
	{  
		return this.real==0;	
	}
	
	
	public boolean equals(double real, double imag)
	{
		return(real==imag);
	}
	
	public boolean equals(Complex another)
	{
		return (this.real==another.real && this.imag==another.imag);
	}
	
	public double magnitude()
	{
		return Math.sqrt(this.real*this.real+this.imag*this.imag);
	}

	public double argument()
	{
		return Math.toRadians(Math.atan(this.imag/this.real));
	}
	
	public Complex add(Complex right)
	{
	  
		this.real=this.real+right.real;
		this.imag=this.imag+right.imag;
		
		return this;
	}
	
	public Complex addNew(Complex right)
	{
		Complex c=new Complex();
		
		c.real=this.real+right.real;
		c.imag=this.imag+right.imag;
		
		return c;
	}
	
	public Complex substract(Complex right)
	{
		this.real=this.real-right.real;
		this.imag=this.imag-right.imag;
		
		return this;
	}
	
	public Complex substractNew(Complex right)
	{
		Complex c=new Complex();
		
		c.real=this.real-right.real;
		c.imag=this.imag-right.imag;
		
		return c;
	}
	
	public Complex multiply(Complex right)
	{
		this.real=this.real*right.real;
		this.imag=this.imag*right.imag;
		
		return this;
	}
	
	public Complex divide(Complex right)
	{
		this.real=this.real/right.real;
		this.imag=this.imag/right.imag;
		
		return this;
	}
	
	public Complex conjugate()
	{
		this.imag=this.imag*(-1);
		
		return this;
	}
	
	
	
	
	
	
	
}
