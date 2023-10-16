package primeraClase.Tarea1;

import javax.swing.JOptionPane;

public class PotenciaNegativa {
	public static int potencia(int x, int n) { 
		if(n==0)
		return 1; //caso base 
	else
		return x * potencia(x, n - 1); 
	}

	public static void main(String[] args)
		{ 
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de x: "));
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n: "));
		System.out.println("Resultado: " + potencia(x, n)); }
}

