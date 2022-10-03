import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		//creamos panel para pedir el radio del circulo
		String radio=JOptionPane.showInputDialog("Calculadora de areas de circulos: \n-Introduce el radio del circulo");
		//hacemos un parse de string a double (los paneles solo devuelven strings)
			double radioNum=Double.parseDouble(radio);
		//creamos la formula del área
		double area = Math.PI*Math.pow(radioNum,2);	
		//mostramos por panel el resultado	
		JOptionPane.showMessageDialog(null, "El área del círculo és: "+area);;		
	}

}
