import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Declaramos el scanner y una contraseña fija
		Scanner sc= new Scanner(System.in);
		String contraseñaFija="MANOLO123";
		
		//generamos un maximo de intentos y creamos un bucle
		int intentos= 3;
		for (int i = 1; i <= intentos; i++) {
			
			//pedimos que introduzca una contraseña
			System.out.print("---LOGIN--- \nIntroduce la contraseña: ");
			String contraseña= sc.nextLine();
			
			//condicion que comprueba si son iguales
			if (contraseña.equals(contraseñaFija)) {
				System.out.println("Enhorabuena, contraseña correcta!");
				//valor superior al maximo de intentos para salir del for
				i=4;
		
			} else {
				System.out.println("Error! Contraseña incorrecta. Pruebe de nuevo");
				System.out.println(i+ " intentos.\n");
 
			}
			
		}
		
	}

}
