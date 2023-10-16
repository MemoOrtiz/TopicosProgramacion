package primeraClase.Tarea2;

public class Laberinto {
    public boolean resuelve(char[][] lab, int x, int y) {
        lab[y][x] = '.';
        if (x == 0 || y == 0 || x == lab[0].length - 1 || y == lab.length - 1) {
            imprime(lab);
            return true;
        }
        //Arriba
        if(lab[y-1][x]==' '){
            if (resuelve(lab,x,y-1)==true)
                return true;
        }
        //Abajo
        if(lab[y+1][x]==' '){
            if(resuelve(lab,x,y+1)==true)
                return true;
        }
        //Izquierda
        if(lab[y][x-1]==' '){
            if(resuelve(lab, x-1,y)==true)
                return true;
        }
        //Derecha
        if(lab[y][x+1]==' '){
            if(resuelve(lab,x+1,y)==true)
                return true;
        }
        //Este camino no tiene solución
        lab[y][x]= ' ';
        return false;
    }
    public void imprime(char[][]lab){
        for(int i = 0; i<lab.length; i++){
            for(int j = 0; j< lab[i].length; j++){
                System.out.print(lab[i][j]);
            }System.out.println(" ");
        }
        System.out.println("longitud: "+ lab.length);

    }

}