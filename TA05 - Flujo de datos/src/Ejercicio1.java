import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//pedimos variables 
		System.out.print("Introduzca un número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		int num2 = sc.nextInt();
		sc.close();
		
		if (num2<num1) {
			System.out.println("El número más alto es: "+num1);
		}else if (num2>num1) {
			System.out.println("El número más alto es: "+num2);
		}else if (num2==num1) {
			System.out.println("Los dos numeros son iguales.");
		}
	}
	
}
