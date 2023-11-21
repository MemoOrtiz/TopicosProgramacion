import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerLineas {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "C:\\Users\\juan\\Desktop\\archivo.txt";
        FileReader fr = null;
        BufferedReader br = null; //Buffer para almacenar lineas completas
        try { //Abrir el archivo de texto
            File archivo = new File(FILE_NAME);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
// Lectura del fichero
            String linea = br.readLine();
            while (linea != null)
                System.out.println(linea);
            linea = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null)
                fr.close(); //cierra el archivo

        }
    }
}
