public class ArbolString {
    // Atributo (solo la raíz del árbol)
    private NodoString raiz;

    // Constructor (crea un árbol binario vacío)
    public ArbolString() {
        raiz = null;
    }

    // 1 get
    public NodoString getRaiz() {
        return raiz;
    }

    // 1 set
    public void setRaiz(NodoString nuevaRaiz) {
        raiz = nuevaRaiz;
    }

    // Método para determinar si el árbol está vacío
    public boolean estaVacio() {
        if (raiz == null)
            return true;
        else
            return false;
    }

    // Método PRINCIPAL para insertar un nodo en el árbol
    public void insertar(NodoString n) {
        if (estaVacio()) // si el arbol esta vacio, crea la raiz con este nodo nuevo
            raiz = n;
        else
            insertarAuxiliar(raiz, n); // si ya tiene nodos, busca dónde insertarlo usando un método auxiliar
    }

    // Método AUXILIAR para insertar RECURSIVO agrega < a la izquierda y >= a la
    // derecha
    public void insertarAuxiliar(NodoString raiz, NodoString n) {
        if (n.getDato().compareToIgnoreCase(raiz.getDato()) < 0) { // inserta a la izquierda
            if (raiz.getIzquierdo() == null)
                raiz.setIzquierdo(n); // en esta posición inserta un nuevo nodo
            else // cuando ya tiene hijo izquierdo ese nodo, y no lo puede colgar
                insertarAuxiliar(raiz.getIzquierdo(), n); // se manda llamar a sí mismo para buscar lugar libre
        } else { // mueve a la izquierda el nodo nuevo
            if (raiz.getDerecho() == null)
                raiz.setDerecho(n); // en esta posición inserta un nuevo nodo
            else
                insertarAuxiliar(raiz.getDerecho(), n); // se manda llamar a sí mismo para buscar espacio libre
        }

    }

    // devuelve un String con el recorrido PREORDEN del árbol
    public String preorden(NodoString nodo) {
        if (nodo == null) // caso base o primitiva PARA LA EJECUCIÓN DEL MÉTODO
            return "";
        return nodo.getDato() + "\n" + preorden(nodo.getIzquierdo()) + preorden(nodo.getDerecho());
    }

    // devuelve un String con el recorrido entreORDEN del árbol
    public String entreorden(NodoString nodo) {
        if (nodo == null) // caso base o primitiva PARA LA EJECUCIÓN DEL MÉTODO
            return "";
        return entreorden(nodo.getIzquierdo()) + nodo.getDato() + "\n" + entreorden(nodo.getDerecho());
    }

    // devuelve un String con el recorrido POSTORDEN del árbol
    public String postorden(NodoString nodo) {
        if (nodo == null)
            return "";
        return postorden(nodo.getIzquierdo()) + postorden(nodo.getDerecho()) + nodo.getDato() + "\n";
    }


}
