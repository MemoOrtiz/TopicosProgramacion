public class StringMatch {
    public static void stringMatch(String text, String pattern) {
        int len_t = text.length();
        int len_p = pattern.length();
        int k = 0, i = 0, j = 0;

        // averiguar la posicion del patron buscado
        for (i = 0; i <= (len_t - len_p); i++) {
            for(j=0;j<len_p;j++) {
                if(text.charAt(i+j)!=pattern.charAt(j))
                    break;
            }
            if(j==len_p) {
                k++;
                System.out.println("patron encontrado en la posicion: " + i);
            }
        }
        if(k==0) {
            System.out.println("no se encontraron coincidencias!");
        }else {
            System.out.println("total de instancias encontradas = " + k);
        }
    }
    public static void main (String[]args) {
        String text="geeksforgeeks is a coding website for geeks";
        String pattern= "geeks";
        stringMatch(text, pattern);
    }
}