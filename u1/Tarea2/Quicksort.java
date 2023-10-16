package primeraClase.Tarea2;

public class Quicksort {
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
