package primeraClase;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class OrdenarMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int tamaño = scanner.nextInt();

        // Verificar si el tamaño ingresado es válido
        if (tamaño <= 0) {
            System.out.println("El tamaño de la matriz debe ser un número positivo.");
            return;
        }

        // Crear matriz1 de tamaño ingresado
        int[][] matriz1 = new int[tamaño][tamaño];

        // Llenar matriz1 de manera secuencial
        int contador = 1;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz1[i][j] = contador;
                contador++;
            }
        }

        // Crear matriz2 con el patrón de acomodo deseado
        int[][] matriz2 = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz2[i][j] = matriz1[(tamaño - 1) - i][j];
            }
        }

        // Imprimir la matriz reorganizada (matriz2)
        System.out.println("Matriz 2 reorganizada:");
        imprimirMatriz(matriz2);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}
