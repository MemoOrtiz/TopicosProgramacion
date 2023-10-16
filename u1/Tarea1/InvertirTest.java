package primeraClase.Tarea1;

import javax.swing.JOptionPane;

public class InvertirTest {
	public static void invertir(int n) {
		if (n < 10)
			System.out.print(n); // Caso base
		else {
			System.out.print(n % 10);
			invertir(n / 10);
		}
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n? "));

		invertir(n);
	}

}
