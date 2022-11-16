package practicafor;

public class Ej6 {
/*Diseñar un programa que muestre la suma de los 10 primeros números impares.*/
	public static void main(String[] args) {
		int impar=0;
		
		for (int i=1; i<20 ; i++) {
			if (i%2==1) {
				impar+=i;
				System.out.println("Voy a sumar "+i+" porque es impar. Y ya tengo "+impar);
			}else {
				System.out.println(i+" es par. Paso de el.");
			}	
		}	
		System.out.println(impar);
	}

}
