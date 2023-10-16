import java.util.Random;
//Se odena de manera desc
public class BubbleSortDesc {
    public static void bubbleSort(int x[]) {
        int temp, j, pass;
        boolean switched = true;
        for (pass = 0; pass < x.length - 1 && switched == true; pass++) {
            switched = false;
            for (j = 0; j < x.length - pass - 1; j++)
                if (x[j] < x[j + 1]) { //intercambio
                    switched = true;
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
        }
    }

    public static void main (String[]args){
        Random r = new Random();
        int x[] = new int[20];
//llena arreglos con numeros aleatorios entre 1 y 300
        for (int i = 0; i < x.length; i++)
        {
            x[i] = r.nextInt(300) + 1;
        }
//Aplica metodo de la burbuja y ordena los datos
        bubbleSort(x);
//Imprime arreglo ya ordenado
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + "\t");
    }
}
