import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//declaramos el scanner
		Scanner sc = new Scanner (System.in);
		//pedimos los datos y los recogemos 
		System.out.print("Introduce un número para saber si es divisible entre 2: ");
		int num=sc.nextInt();
		
		//condicion si el residuo del numero es 0 saltara esta condicion 
		if (num % 2 == 0) {
			System.out.println("El número "+num+" es divisible entre 2.");
			
		}else {
			System.out.println("El número "+num+" no es divisible entre 2.");
		}
		
	}

}
