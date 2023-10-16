import java.util.Random;
import java.util.Scanner;

public class SelectSortStrings {

    public static void selectSort(String x[ ])
    {
        int i, indx, j;
        String large;
        for (i = x.length-1; i > 0; i --) {
            large = x[0];
            indx = 0;
            for (j = 1; j <= i; j++)
                if (x[ j ].compareTo(large) > 0) { 
                    large = x[ j ]; indx = j;
                }
            x[indx] = x[ i ]; x[ i ] = large;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String x[] = new String[10];
//llena arreglos con numeros aleatorios entre 1 y 300
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingresa palabras: ");
            x[i] = sc.next();
        }
//Aplica metodo de selección directa y ordena los datos
        selectSort(x);
//Imprime arreglo ya ordenado
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + "\t");
    }
}
