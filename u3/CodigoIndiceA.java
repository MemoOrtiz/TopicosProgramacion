import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodigoIndiceA {

        /**
         * Clase interna que representa un nodo para un termino principal
         */
        public class NodoTermino {
            String termino;
            PaginaTermino pagina;
            NodoTermino izquierdo, derecho;


            /**
             * Contructor de nodo termino
             *
             * @param termino El termino principal.
             * @param pagina El numero de pagina asociado al termino.
             */
            public NodoTermino(String termino, int pagina) {
                this.termino = termino;
                this.pagina = new PaginaTermino(pagina);
                izquierdo = derecho = null;
            }
        }

        /**
         * Clase interna que represent una pagina de un termino
         */
        public class PaginaTermino {
            int numero;
            PaginaTermino siguiente;

            /**
             * contructor de PaginaTermino
             * @param numero El numero de pagina
             */
            public PaginaTermino(int numero) {
                this.numero = numero;
                siguiente = null;
            }
        }

        /**
         * Clase que maneja el indice del libro
         */
        public class IndiceLibro {
            NodoTermino raiz;

            /**
             * Clase que maneja el indice del libro
             */
            public IndiceLibro() {
                raiz = null;
            }

            /**
             * Inserta un termino y su numero de pagina en el indice
             * @param termino El termino principal a insertar
             * @param pagina El numero de pagina asociado al termino
             */
            public void insertarTermino(String termino, int pagina) {
                raiz = insertarTerminoRec(raiz, termino, pagina);
            }

            /**
             * Metodo privado para la insercion recursiva de un termino en el indice
             *
             * @param nodo El nodo actual
             * @param termino El termino principal a insertar
             * @param pagina El numero de pagina asociado al termino
             * @return El nodo modificado con el termino y su pagina asociada
             */
            private NodoTermino insertarTerminoRec(NodoTermino nodo, String termino, int pagina) {
                if (nodo == null) {
                    return new NodoTermino(termino, pagina);
                }

                int comparacion = termino.compareTo(nodo.termino);

                if (comparacion < 0) {
                    nodo.izquierdo = insertarTerminoRec(nodo.izquierdo, termino, pagina);
                } else if (comparacion > 0) {
                    nodo.derecho = insertarTerminoRec(nodo.derecho, termino, pagina);
                } else {
                    // El término ya existe, agregamos la página
                    PaginaTermino nuevaPagina = new PaginaTermino(pagina);
                    nuevaPagina.siguiente = nodo.pagina;
                    nodo.pagina = nuevaPagina;
                }

                return nodo;
            }

            /**
             * Imprime el indice en orden alfabetico, mostrando los terminos y sus paginas
             */
            public void imprimirIndice() {
                imprimirIndiceRec(raiz);
            }

            /**
             * Metodo privado para imprimir el indice recursivamente en orden alfabetico
             * @param nodo El nodo actual
             */
            private void imprimirIndiceRec(NodoTermino nodo) {
                if (nodo != null) {
                    imprimirIndiceRec(nodo.izquierdo);
                    System.out.print(nodo.termino + ": ");
                    imprimirPaginas(nodo.pagina);
                    System.out.println();
                    imprimirIndiceRec(nodo.derecho);
                }
            }

            /**
             * iImprime las paginas asociadas a un termino en orden ascendente
             * @param pagina La pagina del termino
             */
            private void imprimirPaginas(PaginaTermino pagina) {
                ArrayList<Integer> numerosPagina = new ArrayList<>();
                obtenerNumerosPagina(pagina, numerosPagina);
                Collections.sort(numerosPagina);
                for (int num : numerosPagina) {
                    System.out.print(num + " ");
                }
            }

            /**
             * Metodo privado para obtener los numeros de pagina recursivamente
             * @param pagina La pagina del termino
             * @param numerosPagina Lista para almacenar los numeros de la pagina
             */
            private void obtenerNumerosPagina(PaginaTermino pagina, ArrayList<Integer> numerosPagina) {
                if (pagina != null) {
                    numerosPagina.add(pagina.numero);
                    obtenerNumerosPagina(pagina.siguiente, numerosPagina);
                }
            }
        }

        /**
         * Metodo principal que ejecuta el programa
         * @param args
         */
        public static void main(String[] args) {
            CodigoIndiceA codigo = new CodigoIndiceA();
            IndiceLibro indice = codigo.new IndiceLibro();
            Scanner scan = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\nMenú de opciones:");
                System.out.println("1. Capturar un término principal y números de página");
                System.out.println("2. Imprimir el índice en orden alfabético");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opción: \n");
                opcion = scan.nextInt();

                switch (opcion) {
                    case 1:
                        scan.nextLine(); // Limpiar el salto de línea
                        System.out.print("Término principal: ");
                        String termino = scan.nextLine();
                        System.out.print("Número de página: ");
                        int pagina = scan.nextInt();
                        indice.insertarTermino(termino, pagina);
                        break;
                    case 2:
                        System.out.println("Índice en orden alfabético:");
                        indice.imprimirIndice();
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una opción válida.");
                        break;
                }
            } while (opcion != 3);
        }

}
