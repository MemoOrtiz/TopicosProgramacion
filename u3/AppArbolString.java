public class AppArbolString {
    public static void main(String[]args){
        ArbolString arbolString = new ArbolString();
        arbolString.insertar(new NodoString("hola"));
        arbolString.insertar(new NodoString("Edgar"));
        arbolString.insertar(new NodoString("canijo"));
        arbolString.insertar(new NodoString("haz"));
        arbolString.insertar(new NodoString("la"));
        arbolString.insertar(new NodoString("tarea"));

        System.out.print("\nEl ARBOL:\n"+arbolString.preorden(arbolString.getRaiz()));
        System.out.print("\nEl ARBOL:\n"+arbolString.entreorden(arbolString.getRaiz()));
        System.out.print("\nEl ARBOL:\n"+arbolString.postorden(arbolString.getRaiz()));
    }
}
