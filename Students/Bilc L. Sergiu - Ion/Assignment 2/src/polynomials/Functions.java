package polynomials;

import java.lang.*;

public class Functions {
	
	private int[] result= new int [20];
	private InputOutput operation=new InputOutput();
	
	
	public void add(Polynomial pol1,Polynomial pol2,Polynomial polResult1) {
		
		
		int pol1Degree=pol1.getDegree();
		int pol2Degree=pol2.getDegree();
		int i=0;
		int coefficient=-1;

		if(pol1Degree>pol2Degree) {
			for(i=0;i<=pol2Degree;i++) {
				coefficient=pol1.coefficientPoly[pol1Degree-i]+pol2.coefficientPoly[pol2Degree-i];
				result[i]=coefficient;				
			}
			for(;i<=pol1Degree;i++) {
				coefficient=pol1.coefficientPoly[pol1Degree-i];
				result[i]=coefficient;
				
			}
				
		}
		else {
				for(i=0;i<=pol1Degree;i++) {
					coefficient=pol1.coefficientPoly[pol1Degree-i]+pol2.coefficientPoly[pol2Degree-i];
					result[i]=coefficient;
				
				}
				for(;i<=pol2Degree;i++) {
					coefficient=pol2.coefficientPoly[pol2Degree-i];
					result[i]=coefficient;
					
				}
				
					
			}
		
		
		for(int j=i-1;j>=0;j--) {
			polResult1.createPolynomial(result[j]);
		}
		
	
		
	}
	
	
	public void substract(Polynomial pol1,Polynomial pol2,Polynomial polResult1) {
		
		
		int pol1Degree=pol1.getDegree();
		int pol2Degree=pol2.getDegree();
		int i=0;
		int coefficient=-1;

		if(pol1Degree>pol2Degree) {
			for(i=0;i<=pol2Degree;i++) {
				coefficient=pol1.coefficientPoly[pol1Degree-i]-pol2.coefficientPoly[pol2Degree-i];
				result[i]=coefficient;
				
			}
			for(;i<=pol1Degree;i++) {
				coefficient=pol1.coefficientPoly[pol1Degree-i];
				result[i]=coefficient;
				
			}
				
		}
		else {
				for(i=0;i<=pol1Degree;i++) {
					coefficient=pol1.coefficientPoly[pol1Degree-i]-pol2.coefficientPoly[pol2Degree-i];
					result[i]=coefficient;
					
					
				}
				for(;i<=pol2Degree;i++) {
					coefficient=pol2.coefficientPoly[pol2Degree-i];
					result[i]=coefficient;
					
				}
				
					
			}
		
		
		for(int j=i-1;j>=0;j--) {
			polResult1.createPolynomial(result[j]);
		}
		
		
		
	}


	public void multiply(Polynomial pol1,Polynomial pol2,Polynomial polResult) {
		int pol1Degree=pol1.getDegree();
		int pol2Degree=pol2.getDegree();
		int k=3,i,j;
		
		int[] vectorResult=new int[20];
		for(k=0;k<=(pol1Degree+pol2Degree);k++) {
			vectorResult[k]=0;
		}
	
		for(i=0;i<=pol1Degree;i++) {
			for(j=0;j<=pol2Degree;j++) {
				k=pol1Degree-i+pol2Degree-j;
				vectorResult[k]=vectorResult[k]+pol1.coefficientPoly[pol1Degree-i]*pol2.coefficientPoly[pol2Degree-j];
			}
		}
		
		for(k=0;k<=(pol1Degree+pol2Degree);k++) {
			polResult.createPolynomial(vectorResult[k]);
		}
	}

	public void  multiplyScal(Polynomial pol1,int scal,Polynomial polResult) {
		int pol1Degree=pol1.getDegree();
		int i;
		
		for(i=0;i<=pol1Degree;i++) {
				result[i]=pol1.coefficientPoly[pol1Degree-i]*scal;
		}
		
		for(i=pol1Degree;i>=0;i--) {
			polResult.createPolynomial(result[i]);
		}
		
	}

	public int eval(Polynomial pol1,int X) {
		
		int pol1Degree=pol1.getDegree();
		int resultPol1=0;
		
		int currentDegree=pol1Degree;
		for(int i=0;i<=pol1Degree;i++) {
			
			resultPol1=resultPol1+pol1.coefficientPoly[i]*((int)(Math.pow((double)X,(double)currentDegree)));
			currentDegree--;
		}

		return resultPol1;
		
		
	}
}
