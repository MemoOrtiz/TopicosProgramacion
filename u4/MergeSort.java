import javax.swing.*;
import java.io.*;

public class MergeSort {
    public static final String INPUT = "/Users/memopispo/Documents/Semestre_Ago-Dic_2023/Topicos/ProgramasTopicos/u4/OrdenE.txt";
    public static final String AUX1 = "/Users/memopispo/Documents/Semestre_Ago-Dic_2023/Topicos/ProgramasTopicos/u4/Aux1.txt";
    public static final String AUX2 = "/Users/memopispo/Documents/Semestre_Ago-Dic_2023/Topicos/ProgramasTopicos/u4/Aux2.txt";
    public static void main(String[]args) throws IOException
    {
        {
            File input = new File(INPUT);
            FileWriter fw = new FileWriter(input);
            int datos = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos datos vas a poner"));
            for (int i = 0; i < datos; i++) {
                String d = JOptionPane.showInputDialog(null,"Dato a ingresar");
                fw.write(d + "\n");
            }
            fw.close();
            try
            {
                boolean sorted = split(INPUT, AUX1, AUX2);
                while(!sorted)
                {
                    merge(AUX1, AUX2, INPUT);
                    sorted = split(INPUT, AUX1, AUX2);
                }
                System.out.println("Esta resuelto");
                printFileContent(INPUT);
            } catch(IOException ex) {
                System.out.println("Ocurrio un problema");
            }
        }
    }

    public static void printFileContent(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        System.out.println("Contenido del archivo " + filePath + ":");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static boolean split(String input, String output1, String output2) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader(input));
        BufferedWriter out = new BufferedWriter(new FileWriter(output1));
        BufferedWriter other = new BufferedWriter(new FileWriter(output2));
        boolean sorted = true;
        String previous = "";
        String current = in.readLine();

        while(current != null)
        {
            if(previous.compareTo(current) > 0)
            {
                sorted = false;
                BufferedWriter tmp = out;
                out = other;
                other = tmp;
            }
            out.write(current);
            out.newLine();
            previous = current;
            current = in.readLine();
        }
        in.close();
        out.close();
        other.close();
        return sorted;
    }
    public static void merge(String input1, String input2, String output) throws IOException
    {
        BufferedReader in1 = new BufferedReader(new FileReader(input1));
        BufferedReader in2 = new BufferedReader(new FileReader(input2));
        BufferedWriter out = new BufferedWriter(new FileWriter(output));
        String current1 = in1.readLine();
        String current2 = in2.readLine();
        while((current1 != null && current2 != null))
        {
            if(current1.compareTo(current2) <= 0)
            {
                out.write(current1);
                out.newLine();
                current1 = in1.readLine();
            } else {
                out.write(current2);
                out.newLine();
                current2 = in2.readLine();
            }
        }
        while(current1 != null)
        {
            out.write(current1);
            out.newLine();
            current1 = in1.readLine();
        }
        while(current2 != null)
        {
            out.write(current2);
            out.newLine();
            current2 = in2.readLine();
        }
        in1.close();
        in2.close();
        out.close();
    }
}
