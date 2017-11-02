
public class Function {
	private int[] result = new int [20];
	private InputOutput operation = new InputOutput(); 
	private Polynomial polResult = new Polynomial();
	private int polResultDegree;

	public void add(Polynomial pol1, Polynomial pol2){
		int pol1Degree;
		int pol2Degree;
		int i;
		
		pol1Degree=pol1.getDeegree();
		pol2Degree=pol2.getDeegree();
		
		if(pol1Degree>pol2Degree){
			for (i=0; i<=pol2Degree; i++){
				result[pol1Degree-i]=pol1.coefficientPolynamial[pol1Degree-i]+pol2.coefficientPolynamial[pol2Degree-i];
			}
			for (i=pol1Degree-pol2Degree-1; i>=0; i--)
				result[i]=pol1.coefficientPolynamial[i];
			polResultDegree=pol1Degree;
		}
		else{
			for (i=0; i<=pol1Degree; i++){
				result[pol2Degree-i]=pol2.coefficientPolynamial[pol2Degree-i]+pol1.coefficientPolynamial[pol1Degree-i];
			}
			for (i=pol2Degree-pol1Degree-1; i>=0; i--)
				result[i]=pol2.coefficientPolynamial[i];
			polResultDegree=pol2Degree;
		}
		for (i=0; i<=polResultDegree; i++){
			polResult.createPolynamial(result[i]);
		}
		operation.writePolynomial(polResult);
		polResult.reset();
	}
	
	public void substract(Polynomial pol1, Polynomial pol2){
		int pol1Degree;
		int pol2Degree;
		int i;
		
		pol1Degree=pol1.getDeegree();
		pol2Degree=pol2.getDeegree();
		
		if(pol1Degree>pol2Degree){
			for (i=0; i<=pol2Degree; i++)
				result[pol1Degree-i]=pol1.coefficientPolynamial[pol1Degree-i]-pol2.coefficientPolynamial[pol2Degree-i];
			for (i=pol1Degree-pol2Degree-1; i>=0; i--)
				result[i]=pol1.coefficientPolynamial[i];
			polResultDegree=pol1Degree;
		}
		else{
			for (i=0; i<=pol1Degree; i++)
				result[pol2Degree-i]=pol2.coefficientPolynamial[pol2Degree-i]-pol1.coefficientPolynamial[pol1Degree-i];
			for (i=pol2Degree-pol1Degree-1; i>=0; i--)
				result[i]=pol2.coefficientPolynamial[i];
			polResultDegree=pol2Degree;
		}
		for (i=0; i<=polResultDegree; i++)
			polResult.createPolynamial(result[i]);
		
		operation.writePolynomial(polResult);
		polResult.reset();
	}
	
	public void multiply(Polynomial pol1, Polynomial pol2){
		int pol1Degree;
		int pol2Degree;
		int i, j, poz;
		
		pol1Degree=pol1.getDeegree();
		pol2Degree=pol2.getDeegree();
		
		for (i=0; i<=(pol1Degree+pol2Degree); i++){
			result[i]=0;
		}
		for (i=0; i<=pol1Degree; i++){
			for (j=0; j<=pol2Degree; j++){
				poz=pol1Degree-i+pol2Degree-j;
				result[poz]=result[poz]+pol1.coefficientPolynamial[pol1Degree-i]*pol2.coefficientPolynamial[pol2Degree-j];
			}
		}
		for (i=0; i<=(pol1Degree+pol2Degree); i++)
			polResult.createPolynamial(result[i]);
		
		operation.writePolynomial(polResult);
		polResult.reset();
	}
	
	public void mul_scal(Polynomial pol, int n){
		int polDegree;
		int i, coeff;
		
		polDegree=pol.getDeegree();
		
		for (i=0; i<=polDegree; i++){
			coeff=n*pol.coefficientPolynamial[i];
			polResult.createPolynamial(coeff);
		}
		operation.writePolynomial(polResult);
		polResult.reset();
	}
	
	public int eval(Polynomial pol,int n){
		int i, r=0, x=1;
		int polDegree;
		
		polDegree=pol.getDeegree();
		for (i=polDegree; i>=0; i--){
			r=r+x*pol.coefficientPolynamial[i];
			x=x*n;
		}
		
		return r;
	}
	
	public float evalFloat(Polynomial pol,float n){
		int i;
		float r=0, x=1;
		int polDegree;
		
		polDegree=pol.getDeegree();
		for (i=polDegree; i>=0; i--){
			r=r+x*pol.coefficientPolynamial[i];
			x=x*n;
		}
		
		return r;
	}
	
	public void division (Polynomial pol1, Polynomial pol2){
		float[] rest = new float [20];
		
		PolynomialFloat resultPol = new PolynomialFloat();
		PolynomialFloat restPol = new PolynomialFloat();
		
		int i, j, pol1Degree, pol2Degree;
		float val;
		
		pol1Degree=pol1.getDeegree();
		pol2Degree=pol2.getDeegree();
		
		if (pol1Degree>pol2Degree){
			for (i=0; i<=pol1Degree; i++)
				rest[i]=pol1.coefficientPolynamial[i];
			for (i=0; i<=(pol1Degree-pol2Degree); i++){
				val=rest[i]/pol2.coefficientPolynamial[0];
				resultPol.createPolynamial(val);
				for (j=i; j<=pol2Degree+i; j++){
					rest[j]=rest[j]-val*pol2.coefficientPolynamial[j-i];
				}
			}
			for (i=0; i<=pol1Degree; i++)
				restPol.createPolynamial(rest[i]);
			System.out.println("Rezultat");
			operation.writePolynomialFloat(resultPol);
			resultPol.reset();
			System.out.println("Rest");
			operation.writePolynomialFloat(restPol);
			restPol.reset();
		}
		
	}
	
}











