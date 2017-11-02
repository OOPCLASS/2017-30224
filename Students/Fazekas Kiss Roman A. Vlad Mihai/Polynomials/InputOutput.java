import java.io.*;
import java.util.Scanner;

public class InputOutput {
	
	//asta ii ce am apucat sa fac pana acum. o sa mai adaug, dar nu voiam sa trimit prea tarziu
    
    public static void main(String[] args){
    	FileInputStream in = null;
    	InputStreamReader isr;
    	BufferedReader br;
    	
    	try {
    		in = new FileInputStream("input.txt");
    		isr = new InputStreamReader (in);
    		br= new BufferedReader (isr);
    		
    		// output
    		File outf =new File("output.txt");
    		PrintWriter outp=new PrintWriter(outf);
    		
    		//input
    		String dataline = br.readLine();
    		int p1[] = new int[10];
    		int n1 = 0;
    		Scanner inp = new Scanner(dataline);
        	while (inp.hasNextInt()){
        		p1[n1] = inp.nextInt();
        		n1++;
    		}
        	n1--;
        	invert(p1,n1);
        	outp.print(p1[n1]+"x^" + n1);
        	for (int i = n1-1; i >= 0; i--){
        		outp.print(" + " + p1[i]+ "x" + "^" + i);
        	}
    		
    		
    		dataline = br.readLine();
    		outp.println();
    		int p2[] = new int[10];
    		int n2 = 0;
    		inp=new Scanner(dataline);
        	while (inp.hasNextInt()){
        		p2[n2]=inp.nextInt();
        		n2++;
    		}
        	n2--;
        	invert(p2,n2);
        	outp.print(p2[n2]+"x^" + n2);
        	for (int i=n2-1;i>=0;i--)
        		outp.print(" + "+ p2[i]+"x" + "^" + i );
    		
        	
    		
    			
    		
    		
    		
    		
    		
    		outp.close();
    		
    	} catch (FileNotFoundException e){
    		System.out.println("file not found");
    	}
    	catch (IOException f){
    		System.out.println("error");
    	}
    	
		}
    	
    public static void invert(int[] x,int n){
    	for(int i=0;i<n/2;i++){
    		int aux;
    		aux=x[i];
    		x[i] = x[n-i];
    		x[n-i] = aux;
    	}
    
    }
    
     
    }
