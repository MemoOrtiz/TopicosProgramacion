import java.util.Random;
import java.util.Scanner;

public class BubbleSortStrings {
    public static void bubbleSort(String []x) {
        int  j, pass;
        String temp;
        boolean switched = true;
        for (pass = 0; pass < x.length - 1 && switched == true; pass++) {
            switched = false;
            for (j = 0; j < x.length - pass - 1; j++)
                if (x [j] .compareTo(x[j + 1])>0) { //intercambio
                    switched = true;
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
        }
    }

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        String [] x = new String[10] ;
        for(int i =0; i<x.length;i++){
            System.out.println("Ingresa palabras: ");
            x[i]=sc.next();
        }

//Aplica metodo de la burbuja y ordena los datos
        bubbleSort(x);
//Imprime arreglo ya ordenado
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + "\t");
    }
}
