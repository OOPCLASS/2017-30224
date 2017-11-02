
public class PolynomialFloat {
	private int degreePolynomial;
	public float[] coefficientPolynamial= new float[20];
	
	public PolynomialFloat(){
		this.degreePolynomial=-1;
	}
	
	public void createPolynamial(float coefficient){
		degreePolynomial++;
		coefficientPolynamial[degreePolynomial]=coefficient;
	}
	
	public int getDeegree(){
		return this.degreePolynomial;
	}
	
	public void reset(){
		degreePolynomial=-1;
	}
}
