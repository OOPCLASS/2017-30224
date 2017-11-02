
public class Polynomial {
		private int degreePolynomial;
		public int[] coefficientPolynamial= new int[20];
		
		public Polynomial(){
			this.degreePolynomial=-1;
		}
		
		public void createPolynamial(int coefficient){
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
