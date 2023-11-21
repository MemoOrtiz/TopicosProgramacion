import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class EscribeUnArchivo {
    public static void main(String[] args) {
//Capturar una cadena y escribirla al reves en el archivo
        final String FILE_NAME ="C:\\Users\\JJC\\Documents\\backwards.txt";
        try {
            String text= JOptionPane.showInputDialog(null, "Captura un Texto: ");
            FileWriter output = new FileWriter(FILE_NAME, true);
            for (int i = text.length()-1; i >= 0; i--)
            {
                output.write(text.charAt(i));
            }
            output.close();//cierra el archivo
        }
        catch (IOException ex)
        {
            System.out.println("Algo malo a sucedido :-(");
        }
    }
}
