package primeraClase.Tarea2;

import javax.swing.JOptionPane;

/**
 * Programa que hara de reinas para escpar y huyan en un tablero de ajedrez.
 */
public class OchoReinas {
    private static final int DIMENSION = 8;

    public static void main(String[] args) {
        int[][] t = new int[DIMENSION][];
        for (int i = 0; i < DIMENSION; i++) {
            t[i] = new int[DIMENSION];
        }
        //Colocar reina en la fila cero
        colocarReina(t, 0);
    }

    public static boolean colocarReina(int[][] t, int fila) {
        if (fila == DIMENSION) {
            System.out.println("Solución encontrada: ");
            imprimir(t);
            return true;
        }
        for (int columna = 0; columna < DIMENSION; columna++) {
            if (!amenazada(t, fila, columna)) {
                //colocamos la reina i-esima
                t[fila][columna] = fila + 1;
                boolean tmp = colocarReina(t, fila + 1);
                if (tmp == true) {
                    return true;
                }
                //borramos la solucion invalida
                t[fila][columna] = 0;
            }
        }
        return false;
    }

    public static void imprimir(int[][] lab) {
        for (int i = 0; i < lab.length; i++) {
            for (int j = 0; j < lab[i].length; j++) {
                System.out.print("[ "+lab[i][j]+" ]");
            }System.out.println();
        }
    }

    public static boolean amenazada(int[][] t, int fila, int columna) {
        //mira si hay alguna reina en la misma fila o columna
        for (int i = 0; i < DIMENSION; i++) {
            if (t[fila][i] != 0 || t[columna][i] != 0) {
                return true;
            }
        }
        //Diagonal arriba a la izquierda
        for (int f = fila, c = columna; f >= 0 && c >= 0; f--, c--) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }
        }
        //Diagonal abajo a la derecha
        for (int f = fila, c = columna; f >= 0 && c < DIMENSION; f--, c++) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }
        }
        //Diagonal abajo a la izquierda
        for (int f = fila, c = columna; c >= 0 && f < DIMENSION; f++, c--) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }
        }
        //Diagonal abajo a la derecha
        for (int f = fila, c = columna; f < DIMENSION && c < DIMENSION; f++, c++) {
            if (t[f][c] != 0 || t[f][c] != 0) {
                return true;
            }
        }
        return false;
    }
}
