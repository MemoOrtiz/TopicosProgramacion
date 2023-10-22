public class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    //Genera nuevo hijo izq
    public void hijoIzquierdo(Nodo p, int x) {
        Nodo q = new Nodo(x);
        p.izquierdo = q;
    }

    //Genera un hijo der
    public void hijoDerecho(Nodo p, int x) {
        Nodo q = new Nodo(x);
        p.derecho = q;
    }

    //Retorna el apuntador a raiz del arbol
    public Nodo getRaiz() {
        return raiz;
    }

    //Recorrido en pre-orden
    public void preOrden(Nodo p) {
        if (p != null) {
            System.out.print(p.info + "\t");
            preOrden(p.izquierdo);
            preOrden(p.derecho);
        }
    }

    //recorrido en entre-orden
    public void entreOrden(Nodo p) {
        if (p != null) {
            entreOrden(p.izquierdo);
            System.out.print(p.info + " \t");
            entreOrden(p.derecho);
        }
    }

    //Recorrido en posorden
    public void posOrden(Nodo p) {
        if (p != null) {
            posOrden(p.izquierdo);
            posOrden(p.derecho);
            System.out.print(p.info + "\t");
        }
    }
    public void creaArbolBinario(int x) {
        Nodo p, q;
        if (raiz == null)
            raiz = new Nodo(x); //raiz del árbol binario
        else { //avanza a los niveles del árbol binario
            p = raiz;
            q = raiz;
            while (q != null) {
                p = q;
                if (x < p.info)
                    q = p.izquierdo; //avanza al hijo izquierdo
                else
                    q = p.derecho; //avanza al hijo derecho
            }
            if (x < p.info)
                hijoIzquierdo(p, x); //genera nuevo hijo izquierdo del nodo p
            else
                hijoDerecho(p, x); //genera nuevo hijo derecho del nodo p
        }
    }

}
