import javax.swing.*;

public class AppArbolHebrado {
    public static void main(String[ ] args )
    {
        ArbolHebrado arbol = new ArbolHebrado();
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuántos números: "));
        for (int i = 0; i < n ; i++)
        {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta número: ") );
            arbol.creaArbolHebrado(numero);
        }
//Imprimir contenido del árbol
        arbol.entreOrden();
    }
}
