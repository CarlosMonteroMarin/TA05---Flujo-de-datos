import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {

		//pedimos por panel los tres datos necesarios y los parseamos a int 
			String num1S = JOptionPane.showInputDialog("Introduce un número entero: ");
				int num1 = Integer.parseInt(num1S);
			String num2S = JOptionPane.showInputDialog("Introduce un segundo número entero: ");
				int num2 = Integer.parseInt(num2S);
			String signo = JOptionPane.showInputDialog("Introduce un signo operacional: ");

			//generamos dos variables para los resultados
			int resultado=0;
			double resultadoDouble=0.0;

			//creamos un sw para las diferentes oparaciones
			switch (signo) {
			case "+":
				resultado=num1+num2;
				
				break;
			case "-":
				resultado=num1-num2;

				break;
			case "*":
				resultado=num1*num2;

				break;
			case "/":
				resultadoDouble=num1/num2;
				
				break;
			case "^":
				resultadoDouble=Math.pow(num1, num2);

				break;
			case "%":
				resultado=num1%num2;
				break;
		
			default:
				System.out.println("No has introducido un signo valido.");
				break;
			}
			
			//para imprimir un resultado u otro
			if (signo.equals("/")) {
				JOptionPane.showMessageDialog(null, "El resultado es: "+resultadoDouble);			
				
			}else if (signo.equals("^")) {
				JOptionPane.showMessageDialog(null, "El resultado es: "+resultadoDouble);			
				
			}else {
				JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);	
			}
		
	}

}
