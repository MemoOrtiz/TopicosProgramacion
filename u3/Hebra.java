public class Hebra {
    int info; //información del nodo
    Hebra izquierdo; //apuntador hijo izquierdo
    Hebra derecho; //apuntador hijo derecho
    int enlace; //indica si es nodo hebra
    /* Constructor */
    public Hebra(int x) {
        info = x;
        izquierdo = null;
        derecho = null;
        enlace = 1;
    }}
