package practicafor;

import java.util.Scanner;

public class Ej4 {
/*Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.*/
	public static void main(String[] args) {
		int contador3=0;
		int numUser;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		numUser = lee.nextInt();
		
		for (int i=1; i<= numUser; i++) {
			
			if(i%3==0) {
			 contador3++;
			}
			
		}
		System.out.println("La cantidad de multiplos de 3 que hay hasta el numero introducido es " + contador3);
	lee.close();
	}
	
}
