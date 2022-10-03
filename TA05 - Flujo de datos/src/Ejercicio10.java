import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//declaramos el scanner
		Scanner sc = new Scanner(System.in);
		
		//pedimos el total de ventas que tiene que servira de limite para el for
		System.out.print("Cuantas ventas has hecho ? ");
			int numeroVentas=sc.nextInt();
		
		int totalPrecio=0;
		
		//creamos un bucle el cual pide el precio de cada venta y lo suma a un total
		for (int i = 1; i <= numeroVentas; i++) {
			System.out.print("Indica el precio del producto "+i+" :");
			int precioVenta=sc.nextInt();
			
			totalPrecio=totalPrecio+precioVenta;
		
		}
		//cuando acaba el bucle imprimimos el total
		System.out.println("El precio total de las ventas es de "+totalPrecio);
		
	}

}
