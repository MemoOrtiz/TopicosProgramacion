import java.util.Random;
import javax.swing.JOptionPane;

public class BusquedaSecuencial {
    public static int busquedaSecuencial(int x[], int elemento) {
        for (int indice = 0; indice < x.length; indice++) {
            if (x[indice] == elemento)
                return indice +1;//se le pone + 1 si se va a contar del uno en adelante
            // retorna la posicion del elemento
        }
        return -1;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int x[] = new int[10];
        // llena arreglos con numeros aleatorios entre 1 y 300
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(300) + 1;
        }
        System.out.println("Numeros generados:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("[" + x[i] + "]" + "\t");
        }
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("numero a buscar: "));
        System.out.println("\nel numero " + elemento+ " se encuentra en la casilla: "+busquedaSecuencial(x, elemento));
    }
}

