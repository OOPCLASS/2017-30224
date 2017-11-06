
public class RootFunction {
	public float root(Polynomial pol){
		Polynomial polDeriv = new Polynomial();
		Function comm = new Function();
			
		int i, polDegree;
		float x0, x1, f, fDeriv, aux;
		
		x0=1;
		x1=2;
			
		polDegree=pol.getDeegree();
		for (i=0; i<polDegree; i++){
			polDeriv.createPolynamial((polDegree-i)*pol.coefficientPolynamial[i]);	
		}
		while (Math.abs(x1-x0)>0.0001){
			f=comm.evalFloat(pol, x0);
			fDeriv=comm.evalFloat(polDeriv, x0);
			aux= x0-f/fDeriv;
			x0=x1; 
			x1=aux;
		}
		return x1;
	}
}
