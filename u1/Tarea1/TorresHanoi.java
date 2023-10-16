package primeraClase.Tarea1;

import javax.swing.*;

public class TorresHanoi {
    public static void hanoi(int n, String ini, String aux, String fin){
        if(n>0){
            hanoi(n-1,ini,fin,aux);
            System.out.println("Mover disco "+ n+ " de "+ini+" a "+fin);
            hanoi(n-1,aux, ini, fin);
        }
        //caso base
    }
    public static void main(String[]args){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Num discos: "));
        hanoi(n,"Primera Torre", "Tercera Torre","Segunda Torre");
    }
}
