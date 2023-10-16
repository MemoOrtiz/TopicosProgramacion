package primeraClase.Tarea1;

import javax.swing.JOptionPane;

public class MultiplicarTest {
	public static int multi(int a, int b) {
		if (b == 0)
			return 0; // Caso base
		else
			return a + multi(a, b - 1);
	}

	public static void main(String[] args) {
		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de a? "));
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de b? "));
		JOptionPane.showMessageDialog(null, "Resultado: " + multi(a, b));
	}
}