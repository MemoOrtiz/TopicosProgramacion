import javax.swing.JOptionPane;
public class BinarySearch {
    public static void main(String[]args) {
        int[] arreglo= {19, 25,31,34,58, 61,67,70, 75, 77, 89, 97, 120, 125};
        //aplica el metodo de busqueda binaria

        int valorBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Que numero se desea buscar?"));

        System.out.println("El elemento " + valorBuscar + " se encuentra en la celda: " +
                binarySearch(valorBuscar,arreglo));
    }
    public static int binarySearch(int valorBuscar, int[] arreglo) {
        int buscar = valorBuscar;
        int arregloBuscar[] = arreglo;
        int inicio = 0;
        int fin = arregloBuscar.length - 1;
        int posicion;

        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;

            if (arregloBuscar[posicion] == buscar)
                return posicion +1 ;
                //se le pone +1 por que empece a contar del uno en adelante

            else if (buscar > arregloBuscar[posicion]){
                inicio = posicion + 1;
            } else {
                fin = posicion - 1;
            }
        }
        return -1;
    }
}
