package polynomials;

import java.util.Scanner;

import java.io.*;

public class Polynomial {

	private int degreePoly;
	public int[] coefficientPoly=new int[20];
	
	public Polynomial() {
		this.degreePoly=-1;
	}
	
	public void createPolynomial(int coefficient) {
		degreePoly++;
		coefficientPoly[degreePoly]=coefficient;
	}
	
	public int getDegree() {
		return this.degreePoly;
	}
	
	public void reset() {
		degreePoly=-1;
	}

}
