package primeraClase.Tarea1;

import javax.swing.JOptionPane;

public class FactorialTest{
public static int factorial(int n) {
	if(n==1) {
		return 1;
	}else {
		return n*factorial(n-1);
	}
}
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n "));
		JOptionPane.showMessageDialog(null, "Factorial es: " + factorial(n));
	}
//Otra manera de hacerlo es de forma ciclica
//	public static int factorial(int n) {
//		int resultado = 1;
//		for(int i = 1; i<=n;i++) {
//			resultado *=i;
//		}
//		return resultado;
//	}
//	public static void main (String[] Args) {
//		System.out.println(factorial(5));
//	}
}
