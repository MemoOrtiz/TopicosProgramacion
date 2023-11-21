import javax.swing.*;
import java.io.*;
import java.util.Arrays;

public class Agenda {
    final String FILE_NAME = "Agenda";

    public Agenda() {
    }

    public void captura() {
        try {
            String nombre, email, telefono;
            FileWriter output = new FileWriter(FILE_NAME, true);
            nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre");
            telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono");
            email = JOptionPane.showInputDialog(null, "Ingrese su email");
            output.write(nombre + ", " + telefono + ", " + email + "\n");
            output.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "¡Se encontro un error! ");
        }
    }

    public void imprimir() {
        final String SEPARATOR = ", ";
        BufferedReader br = null; // Buffer para almacenar linea completo
        try {
            File archivo = new File(FILE_NAME);
            if (archivo.exists()) {
                br = new BufferedReader(new FileReader(FILE_NAME));
                String line = br.readLine();
                while (line != null) {
                    String[] fields = line.split(SEPARATOR);
                    System.out.println(Arrays.toString(fields));
                    line = br.readLine();
                    JOptionPane.showMessageDialog(null, Arrays.toString(fields));
                }
                if (br != null) {
                    br.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Archivo Inexistente! ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Se encontro un error! ");
        }
    }

    public void buscar() {
        final String SEPARATOR = ", ";
        BufferedReader br = null; // Buffer para almacenar linea completo
        try {
            File archivo = new File(FILE_NAME);
            if (archivo.exists()) {
                br = new BufferedReader(new FileReader(FILE_NAME));
                String[] fields;
                String line = br.readLine();
                boolean encontrar = false;
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar");
                while (line != null && !encontrar) {
                    fields = line.split(SEPARATOR);
                    line = br.readLine();
                    if (fields[0].equals(nombre)) {
                        encontrar = true;
                        JOptionPane.showMessageDialog(null, Arrays.toString(fields) + "\n Se encontro");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro");
                    }
                }
                if (br != null) {
                    br.close();
                }
            } else {
                JOptionPane.showMessageDialog(null, "¡Archivo Inexistente! ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Se encontro un error! ");
        }
    }
}
