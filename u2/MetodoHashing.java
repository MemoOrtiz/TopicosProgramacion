import java.util.Random;
/*
 * Desarrollar un metodo llamado Haashing que acepte como parametro un arreglo con valores enteros
 * de dos digitos(entre 0 y 99)
 * Autor: Guillermo Ortiz
 */
public class MetodoHashing {
    public static void hashingSort(int x[ ]) {
        Nodo f[ ] = new Nodo[10];//arreglo de apuntadores a listas enlazadas
        int posicion;
        // /* Inicializa arreglo de apuntadoresa listas enlazadas*/
        for (int i = 0; i < f.length; i++) {
            f[i] = null;
        }
        /* Procesa cada elemento del arreglo y lo ubica en lista enlazada correspondiente */
        for (int i = 0; i < x.length; i++) {
            posicion= x[i]/ f.length;//aplica la function f para ubicar el subarchivo
            place(f, posicion, x[i]); //coloca el elemento en la lista enlazada ordenada
        }//fin for
        /* Procesa arreglo de apuntadores y almacena en arreglo original */
        int i = 0;
        for (int j = 0; j < f.length; j++) {
            Nodo p = f[j];//apuntador a la lista enlazada
            while (p != null) {
                x[i++] = p.info;
                p = p.next;
            }//fin while
        }//fin for
    }
    public static void place(Nodo[] f, int posicion, int x){
        if (f[posicion] == null)
            f[posicion] = new Nodo(x);
        else
            f[posicion].next = new Nodo(x);
    }

    public static void main(String[] argsStrings) {
        Random r = new Random();
        int x[] = new int[10];

        // Llena arreglos con numeros aleatorios entre 1 y 100
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(99);
        }
        // Imprimir arreglo desordenado
        System.out.println("Enteros Desordenados");
        for (int i = 0; i < x.length; i++)
            System.out.print("["+x[i] +"]");

        // Aplica metodo de insercion simple y ordena los datos
        hashingSort(x);

        // Imprime arreglo ya ordenado
        System.out.println("\nEnteros Ordenados");
        for (int i = 0; i < x.length; i++)
            System.out.print("["+x[i] +"]");
    }
}
