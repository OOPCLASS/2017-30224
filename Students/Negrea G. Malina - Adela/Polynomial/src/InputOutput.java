import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InputOutput {
	
	public static void write(int[] coef) {
		
		try {
			FileWriter fw = new FileWriter("output.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.print(coef[0] +" x^"+(coef.length-1));
			for(int i=1; i<coef.length;i++) {
				pw.print(" +" + coef[i] + " x^"+(coef.length-i-1));
			}
			
			pw.print('\n');
			
			pw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void write(int val) {
		
		try {
			FileWriter fw = new FileWriter("output.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(val);

			pw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public static void read(int[] coef,int k){
		String line = new String();
		try {
			FileReader fr = new FileReader("pol.txt");
			BufferedReader br = new BufferedReader(fr);
			
			 try {
				if((line = br.readLine()) != null) {
					 for(int i=0; i<line.length();i++) {
						 if(line.charAt(i)!=' ') {
							 coef[k]=(int)line.charAt(i);
							 k++;
						 }
					 }
					 
				 }
			} catch (IOException e) {
				e.printStackTrace();
			}
		    try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void read(String line) {
		
		FileReader fr;
		try {
			fr = new FileReader("pol.txt");
			BufferedReader br = new BufferedReader(fr);
			try {
				line = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
