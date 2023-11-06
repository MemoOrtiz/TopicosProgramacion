import javax.swing.*;

public class AppArbolDigital {
    public static void main(String[] args) {
        ArbolDigital arbol = new ArbolDigital();
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "MENU\n" + "1. Ingresar Llave\n" + "2. Salir\n" + "Opcion:" ));
            switch(opcion) {
                case 1: String key=JOptionPane.showInputDialog(null, "Llave: ");
//Validar que solo sean digitos
                    if (key.matches("[0-9]*"))
                    { //Coloca cada digito en el árbol de busqueda digital
                        JOptionPane.showMessageDialog(null, arbol.search(key));
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Solo digitos!!");
                    break;
            }//fin switch
        }while (opcion != 2);
    }
}
