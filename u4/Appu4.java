import javax.swing.*;


public class Appu4 {
    public static void main(String[] args) {
        String menu = """
                |1.- Captura de datos en la agenda.
                |2.- Muestra los datos en la agenda.
                |3.- Busca el nombre de una persona en la agenda.
                |4.- Terminar el programa.
                """;
        Agenda agenda = new Agenda();
        int opcion = 0;
        do {
            opcion = JOptionPane.showInputDialog(null, menu).charAt(0);
            switch(opcion) {

                case '1' : agenda.captura();
                    break;
                case '2' : agenda.imprimir();
                    break;
                case '3' : agenda.buscar();
                    break;
                case '4' : JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default : JOptionPane.showMessageDialog(null, "Inserte opción válida");
                    break;
            }
        } while(opcion != '4');
    }
}
