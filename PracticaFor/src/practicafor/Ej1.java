package practicafor;

import java.util.Scanner;

public class Ej1 {
/*Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.*/
	public static void main(String[] args) {
		
		int numUser;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero:");
		numUser= lee.nextInt();
		
		for (int i=1; i <= numUser; i++) {
			
			System.out.println(i);
		}
		
		//cerramos el scanner
		lee.close();
	}

}
