public class AppArbol {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();//raíz es null
         //crea el árbol binario
        arbol.creaArbolBinario(432);
        arbol.creaArbolBinario(320);
        arbol.creaArbolBinario(543);
        //imprime contenido del árbol binario
        arbol.entreOrden(arbol.getRaiz());
    }
}
