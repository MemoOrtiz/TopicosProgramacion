import java.util.Random;

public class InsercionSimple {
    public static void insercionSimple(int x[ ]) {
        int i, y;
        for (int k = 1; k < x.length; k++) {
            y = x[k];//elemento a ordenar y colocar en subarchivo
            for (i = k - 1; i >= 0 && y < x[i]; i--) {
                x[i + 1] = x[i]; //fin de for
            }
            x[i + 1] = y;
        }//fin de for
    }

    public static void main (String[] args){
        Random r = new Random();
        int x[] = new int[20];
        //llenaarregloscon numerosaleatoriosentre 1 y 300
        for (int i= 0; i< x.length; i++){
            x[i] = r.nextInt(300) + 1;
        }
        //Aplicametodode insercionsimple y ordenalos datos
        insercionSimple(x);
        //Imprimearregloyaordenado
        for (int i= 0; i< x.length; i++)
            System.out.print(x[i] + "\t");
    }
}
