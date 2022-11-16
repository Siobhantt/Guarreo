package practicafor;

import java.util.Scanner;

public class Ej5 {
/*Pedir diez números por teclado y mostrar la media.*/
	public static void main(String[] args) {
		int numUser;
		double suma = 0;
		int contador;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 10 numeros: ");
		numUser = lee.nextInt();
		
		for (contador=1; contador<10; contador++) {
			
			suma+=numUser;
		numUser = lee.nextInt();
		
		}
		
		System.out.println("La media de los numeros introducidos es " + (suma/contador));
	
		lee.close();
	
	}

}
