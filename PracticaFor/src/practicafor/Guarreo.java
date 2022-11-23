package practicafor;

import java.util.Scanner;

public class Guarreo {

	public static void main(String[] args) {
	    
		int tamaño = 5;
		
		for (int i =1; i<=tamaño; i++) {
	    	System.out.print("*");
	    }
	    System.out.println("");
	    
	    
	    for(int medio=1; medio <= tamaño-2; medio++) {
	    System.out.print("*");
	    
	    for (int j=1; j<=tamaño-2; j++) {
	    	
	    	System.out.print(" ");
	    	
	    }
	    System.out.println("*");
	    
	    }
	    for (int i =1; i<=tamaño; i++) {
	    	System.out.print("*");
	    }
	    
		}
	}


