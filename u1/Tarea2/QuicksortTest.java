package primeraClase.Tarea2;
import java.util.Random;

public class QuicksortTest {
    public static void main (String[ ] args)
    { Random random = new Random();
        int [ ] a = new int[20];
        for (int i = 0; i < a.length; i++)
        { //Genera numeros enteros aleatorios entre 1 y 500
            a[ i ] = random.nextInt(500) + 1; }
        System.out.println("Números generados:"); for (int i = 0; i < a.length; i++)
    {
        System.out.print(a[i] + "\t"); }
//Aplica ordenamiento QuickSort (recursivo)
        quickSort(a, 0, a.length-1); System.out.println("\nNúmeros ordenados:"); for (int i = 0; i < a.length; i++)
    {
        System.out.print(a[i] + "\t"); }
    }
    public static int partition(int x[], int lb, int ub) {
        int a, down, up, temp;
        a = x[lb];
        up = ub;
        down = lb;
        while (down < up) {
            while (x[down] <= a && down < ub) down++;
            while (x[up] > a) up--;
            if (down < up) {
                temp = x[down];
                x[down] = x[up];
                x[up] = temp;
            }
        }
        x[lb] = x[up];
        x[up] = a;
        return up;
    }

    public static void quickSort(int x[], int lb, int ub) {
        int j;
        if (lb >= ub) return;
        j = partition(x, lb, ub);
        quickSort(x, lb, j - 1);
        quickSort(x, j + 1, ub);
    }
}
