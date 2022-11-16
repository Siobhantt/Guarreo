package practicafor;

import java.util.Scanner;

public class Asteriscos {

	public static void main(String[] args) {
		int num;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num=lee.nextInt();
		
		/*El primer for recorre desde 1 hasta num*/
		//Al acabar el segundo bucle imprime un salto de linea
		for(int i=1; i<=num; i++) {
			
			for(int j=i; j>0;j--) {
				System.out.print("*");
			}
			//Si retiro este print, saldrán todos los asteriscos juntos
			/*Eso quiere decir que */
			System.out.println();
		}
		lee.close();
	}

}
