package primeraClase.Tarea1;

import javax.swing.JOptionPane;

public class FibonacciTest {
	public static int fibo(int n) {
		if (n == 0 || n == 1)
			return n; // Caso base
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	public static void main (String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n? ")); JOptionPane.showMessageDialog(null, "Resultado: " + fibo(n));
	}
}