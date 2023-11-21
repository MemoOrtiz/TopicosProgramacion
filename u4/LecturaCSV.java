import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class LecturaCSV {
    public static void main(String[ ] args)
    { final String SEPARATOR = ",";
        File archivo = null;
        BufferedReader br = null; //Buffer para almacenar linea completa
        try { archivo = new File ("C:\\DatosCSV.txt");
            if (archivo.exists())
            { //Abre archivo y canal de flujo
                br=new BufferedReader(new FileReader("C:\\DatosCSV.txt"));
                String line = br.readLine();
                while (line != null) //Leer hasta fin de archivo
                { String [ ] fields = line.split(SEPARATOR);
                    System.out.println(Arrays.toString(fields));
                    line = br.readLine();//Leer sig linea del archivo
                }//fin while
                if (br != null)
                    br.close(); //Cierre del archivo
            }
            else
                System.out.println("El archivo no existe!!");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
