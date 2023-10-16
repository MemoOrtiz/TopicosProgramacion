import java.util.Scanner;

public class InsercionSimpleString {
    public static void insercionSimple(String x[ ]) {
        int i;
        String y;
        for (int k = 1; k < x.length; k++) {
            y = x[k];//elemento a ordenar y colocar en subarchivo
            for (i = k - 1; i >= 0 && y.compareTo(x[i])<0; i--) {
                x[i + 1] = x[i]; //fin de for
            }
            x[i + 1] = y;
        }//fin de for
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String [] x = new String [10];
        //llenaarregloscon numerosaleatoriosentre 1 y 300
        for (int i= 0; i< x.length; i++){
            System.out.println("Ingresa palabras: ");
            x[i]=sc.next();
        }
        //Aplicametodode insercion simple y ordenalos datos
        insercionSimple(x);
        //Imprime arreglo ya ordenado
        for (int i= 0; i< x.length; i++)
            System.out.print(x[i] + "\t");
    }
}
