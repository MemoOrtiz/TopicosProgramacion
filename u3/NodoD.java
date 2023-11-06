public class NodoD {
    byte symbol;
    NodoD son;
    NodoD brother;
    public NodoD(byte valor)
    {
        symbol = valor;
        son = null;
        brother = null;
    }

    /*
    – symbol. que contiene un digito de la llave
    – son. apuntador al hijo más viejo del nodo
    – brother. apuntador al hermano más joven siguiente del nodo en el árbol.
     */
}
