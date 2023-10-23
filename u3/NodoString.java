public class NodoString {

    private NodoString izquierdo; //apuntador al hijo izquierdo
    private String dato;            // nodo con UN dato String
    private NodoString derecho;   //apuntador al hijo derecho

    // Constructor: Crea nodos hoja
    public NodoString ( String d ) {
        dato = d;
        izquierdo = derecho = null;
    }

    // 3 get...
    public String getDato ( ) {
        return dato;
    }

    public NodoString getIzquierdo ( ) {
        return izquierdo;
    }

    public NodoString getDerecho ( ) {
        return derecho;
    }

    // 3 set..
    public void setDato (String nuevoD) {
        dato = nuevoD;
    }

    public void setIzquierdo ( NodoString nuevoIzq ) {
        izquierdo = nuevoIzq;
    }

    public void setDerecho ( NodoString nuevoDer ) {
        derecho = nuevoDer;
    }

    // toString
    public String toString() {
        return dato;
    }
}
