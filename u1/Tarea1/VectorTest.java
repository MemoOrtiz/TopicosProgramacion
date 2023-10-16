package primeraClase.Tarea1;

import javax.swing.JOptionPane;

public class VectorTest {
	public static int sumaVector(int[] vector, int n) {
		if (n == 0)
			return vector[n];
		else
			return vector[n] + sumaVector(vector, n - 1);
	}

	public static void main(String[] args) {

		int[] arreglo = new int[10];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor? "));
		}
		System.out.println("Resultado=" + sumaVector(arreglo, arreglo.length - 1));
	}
}
