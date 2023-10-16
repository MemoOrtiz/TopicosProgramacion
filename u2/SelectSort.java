import java.util.Random;

public class SelectSort {
    //Selección Directa
    public static void selectSort(int x[ ])
    {
        int i, indx, j, large;
        for (i = x.length-1; i > 0; i --) {
            large = x[0];
            indx = 0;
            for (j = 1; j <= i; j++)
                if (x[ j ] > large) { large = x[ j ]; indx = j;
                }
            x[indx] = x[ i ]; x[ i ] = large;
        }
    }

    public static void main (String[] args) {
        Random r = new Random();
        int x[] = new int[20];
//llena arreglos con numeros aleatorios entre 1 y 300
        for (int i = 0; i < x.length; i++)
        {
            x[i] = r.nextInt(300) + 1; }
//Aplica metodo de selección directa y ordena los datos
        selectSort(x);
//Imprime arreglo ya ordenado
        for (int i = 0; i < x.length; i++) System.out.print(x[i] + "\t");
    }

}
