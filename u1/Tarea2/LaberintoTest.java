package primeraClase.Tarea2;

public class LaberintoTest {
    public static void main(String[]args){
    char[][] laberinto = new char[][]{
            {'#', '#', '#', '#', '#', '#'},
            {'#', '.', '#', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#', '#'},
            {'#', ' ', '#', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#', '#'},
            {'#', ' ', '#', ' ', ' ', '#'},
            {'#', '#', '#', '#', ' ', '#'}};
    Laberinto laber = new Laberinto();
        System.out.println("\nSituacion inicial: ");
        laber.imprime(laberinto); //imprime el laberinto inicial
        System.out.println();
        laber.resuelve(laberinto,1,1);

    }
}
