import java.io.*;
import java.util.*;

public class Polynoms{
	public static void main (String [] args) throws IOException {
		File file = new File ("C:\\Users\\calin\\Desktop\\OOP\\2017-30224\\Students\\Florescu F. Calin\\src\\pol.txt.txt");
		List<Integer> pol1 = new ArrayList<Integer>();
		int ctr1=0;
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			if(scanner.hasNextInt()) {
					pol1.add(scanner.nextInt());
					ctr1++;
		}else {
			scanner.next();
		}
		}
		
		int [] polUnu = new int[pol1.size()];
		for(int i = 0; i< ctr1; i++) {
			polUnu[i]=pol1.get(i);
		}
		
		int[]polDoi = new int[ctr1-9];
		
		System.arraycopy(polUnu, 9, polDoi, 0, ctr1-9);
		
		int ctr2 = 4;
		ctr1=9;
		
		System.out.println("Polinomul 1: ");
		
		for(int i = 0; i < ctr1;i++) {
			if(i != ctr1-1) {
				if(polUnu[i]==0) {
					System.out.print(" + ");}
				else
				System.out.print(polUnu[i]+"x"+"^"+(ctr1-(i+1))+"  +  ");
			}
			else {
				if(polUnu[i]==0) {
					System.out.print(" ");
				}
				System.out.print(polUnu[i]+"x"+"^"+(ctr1-(i+1)));
			}
		}
		
		System.out.println("\nPolinomul 2: ");
		
		for(int i = 0;i<ctr2;i++) {
			if(i != ctr2-1) {
				if(polDoi[i]==0) {
					System.out.print(" ");}
				else
				System.out.print(polDoi[i]+"x"+"^"+(ctr2-i)+"  +  ");
			}
			else {
				if(polDoi[i]==0) {
					System.out.print(" + ");
				}
				System.out.print(polDoi[i]+"x"+"^"+(ctr2-i));
			}
		}
		
		//ADD
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String in = null;
		int [] addPolynom;
		while((in=br.readLine())!=null) {
			if((in.contains("ADD"))==true) {
				if(ctr1>ctr2) {
					addPolynom = new int [ctr1];
					for(int i=0;i<ctr1;i++) {
						addPolynom[i]=polUnu[i];
					}
					for(int i = 0;i<ctr1;i++) {
						for(int j=0;j<ctr2;j++) {
							if((ctr1-1-i)==(ctr2-j)){
								addPolynom[i]=polUnu[i]+polDoi[j];
							}
						}
					}
					
					System.out.println("\nRezultatul adunarii polinoamelor este: ");
					for(int i = 0; i < ctr1;i++) {
						if(i != ctr1-1) {
							if(addPolynom[i]==0) {
								System.out.print(" + ");}
							else
							System.out.print(addPolynom[i]+"x"+"^"+(ctr1-(i+1))+"  +  ");
						}
						else {
							if(addPolynom[i]==0) {
								System.out.print(" ");
							}
							System.out.print(addPolynom[i]+"x"+"^"+(ctr1-(i+1)));
						}
					}
				}else
				{
					addPolynom = new int [ctr2];
					for(int i = 0;i<ctr2;i++) {
						addPolynom[i]=polDoi[i];
					}
					for(int i = 0;i<ctr1;i++) {
						for(int j=0;j<ctr2;j++) {
							if((ctr1-i)==(ctr2-j)){
								addPolynom[i]=polUnu[i]+polDoi[j];
							}
						}
					}
					
					System.out.println("\nRezultatul adunarii polinoamelor este: ");
					
					for(int i = 0;i<ctr2;i++) {
						if(i != ctr2-1) {
							if(addPolynom[i]==0) {
								System.out.print(" ");}
							else
							System.out.print(addPolynom[i]+"x"+"^"+(ctr2-i)+"  +  ");
						}
						else {
							if(addPolynom[i]==0) {
								System.out.print(" + ");
							}
							System.out.print(addPolynom[i]+"x"+"^"+(ctr2-i));
						}
					}
					
				}
				
			}
			
			else if((in.contains("SUBSTRACT"))==true) {
				if(ctr1>ctr2) {
					addPolynom = new int [ctr1];
					for(int i=0;i<ctr1;i++) {
						addPolynom[i]=polUnu[i];
					}
					for(int i = 0;i<ctr1;i++) {
						for(int j=0;j<ctr2;j++) {
							if((ctr1-1-i)==(ctr2-j)){
								addPolynom[i]=polUnu[i]-polDoi[j];
							}
						}
					}
					
					System.out.println("\nRezultatul scaderii polinoamelor este: ");
					for(int i = 0; i < ctr1;i++) {
						if(i != ctr1-1) {
							if(addPolynom[i]==0) {
								System.out.print(" + ");}
							else
							System.out.print(addPolynom[i]+"x"+"^"+(ctr1-(i+1))+"  +  ");
						}
						else {
							if(addPolynom[i]==0) {
								System.out.print(" ");
							}
							System.out.print(addPolynom[i]+"x"+"^"+(ctr1-(i+1)));
						}
					}
				}else
				{
					addPolynom = new int [ctr2];
					for(int i = 0;i<ctr2;i++) {
						addPolynom[i]=polDoi[i];
					}
					for(int i = 0;i<ctr1;i++) {
						for(int j=0;j<ctr2;j++) {
							if((ctr1-i)==(ctr2-j)){
								addPolynom[i]=polUnu[i]-polDoi[j];
							}
						}
					}
					
					System.out.println("\nRezultatul scaderii polinoamelor este: ");
					
					for(int i = 0;i<ctr2;i++) {
						if(i != ctr2-1) {
							if(addPolynom[i]==0) {
								System.out.print(" ");}
							else
							System.out.print(addPolynom[i]+"x"+"^"+(ctr2-i)+"  +  ");
						}
						else {
							if(addPolynom[i]==0) {
								System.out.print(" + ");
							}
							System.out.print(addPolynom[i]+"x"+"^"+(ctr2-i));
						}
					}
					
				}
				
			}
			
		}
			
	}
	
}