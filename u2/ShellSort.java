import java.util.Random;
public class ShellSort {
    //Métodode Shell Sort
    public static void shellSort(int x[], int incrmnts[]) {
        int incr, j, k, span, y;
        for (incr = 0; incr < incrmnts.length; incr++) {
            span = incrmnts[incr];

            //Métodode InsercionSimple
            for (j = span; j < x.length; j++) {
                y = x[j];
                for (k = j - span; k >= 0 && y < x[k]; k -= span) {
                    x[k + span] = x[k];
                }//fin de for
                x[k + span] = y;
            }//fin de for
        }// fin de for
    }

    public static void main (String[] args){
        Random r = new Random();
        int x[] = new int[20];
        int[] incrments= {5, 3, 1};
        //llena arreglos con numeros aleatorios entre 1 y 300
        for (int i= 0; i< x.length; i++){
            x[i] = r.nextInt(300) + 1;
        }
        //Aplica metodo de shell sort y ordena los datos
        shellSort(x, incrments);
        //Imprime arreglo ya ordenado
        for (int i= 0; i< x.length; i++)
            System.out.print(x[i] + "\t");
    }
}
