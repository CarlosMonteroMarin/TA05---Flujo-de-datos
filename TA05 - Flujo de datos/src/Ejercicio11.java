import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		//creamos un panel para pedirle un dia de la semana
		String dia = JOptionPane.showInputDialog("Introduce un día de la semana y te diré si es laboral o no: ");
		//lo formateamos a todo minusculas
		dia=dia.toLowerCase();
		//creamos un switch para gestionar las respuestas de los distintos dias.
		switch (dia) {
		case "lunes" :
			JOptionPane.showMessageDialog(null, "Es un dia laboral.");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "Es un dia laboral.");			
			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, "Es un dia laboral.");			
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "Es un dia laboral.");			
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "Es un dia laboral.");			
			break;
		case "sabado":
			JOptionPane.showMessageDialog(null, "No es un día laboral.");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "No es un día laboral.");
			break;

		default:
				JOptionPane.showMessageDialog(null, "No has introducido un dia de la semana correcto.");
			break;
		}
	}

}
