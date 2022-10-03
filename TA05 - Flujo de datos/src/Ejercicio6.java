import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

		//Pedimos datos por popups con joption
		String precioP = JOptionPane.showInputDialog("---Calculador de IVA---\nIntroduce un precio");
		//parseamos el dato a double
		double precioProd=Double.parseDouble(precioP);
		//Declaramos el IVA como constante
		final double IVA=0.21;
		//hacemos el calculo
		double precioFinal=precioProd*IVA+precioProd;
		//Mostramos por popup el resultado
		
		JOptionPane.showMessageDialog(null, "El precio final del producto con el IVA es de: "+ precioFinal);
		
	}

}
