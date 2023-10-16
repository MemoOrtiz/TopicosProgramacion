import javax.swing.JOptionPane;
public class BusquedaBinaria {
    public static void main(String[]args) {
        int[] arreglo= {19, 25,31,34,58, 61,67,70, 75, 77, 89, 97, 120, 125};

        //aplica el metodo de busqueda binaria

        int dato=Integer.parseInt(JOptionPane.showInputDialog(null, "que numero se desea buscar?"));

        System.out.println("el elemento " + dato + " se encuentra en la celda: " +
                busquedaBinaria(arreglo, dato, 0, arreglo.length));
    }
    public static int busquedaBinaria(int a[], int dato, int fin, int inicio) {
        int posicion;
        if(inicio<fin) {
            return -1; //caso base: elemento no encontrado
        }else {
            posicion=(fin + inicio)/2;
            if(dato==a[posicion])
                return posicion +1; //caso base, retorna la posicion del elemento
            //se le pone +1 por que empece a contar del uno en adelante
            if(dato< a[posicion]) {
                return busquedaBinaria(a,dato,fin, posicion-1);
            }else {
                return busquedaBinaria(a, dato, posicion+1, inicio);
            }
        }
    }
}