package busqueda_dicotomica;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author baske
 */
public class Busqueda_dicotomica {

    /**
       34) Tenemos un array de n�meros ordenados ascendentemente. Dado un n�mero, crea un m�todo que devuelva la primera posici�n en la que se encuentra dicho elemento.
       Si el elemento no est� en el array devolver� -1.
       Haz una segunda versi�n usando una b�squeda dicot�mica.
       Compara el tiempo de b�squeda en un array de 10000 enteros en cada caso (los valores ser�n del 0 al 9999).
     */
    public static void main(String[] args) {
        int[] aBloque = new int[10000];
        int[] aBloque2 = {1,4,7,8,19};
        
        for (int i = 0; i < aBloque.length; i++) {
            aBloque[i] = i;
        }
        int pos = Busqueda(aBloque2,7);
        
        if(pos == -1){
            System.out.println("El numero no se encuentra en el vector");
        }else{System.out.println("La posicion en el vector es de " + pos);}
        
        
        

    }
    public static int Busqueda(int[] A, int dato) {
        int inicio, fin, mitad;
        inicio = 0;
        fin = A.length - 1;

        while (inicio <= fin) {
            mitad = (inicio + fin) / 2;
            if (A[mitad] == dato) {
                return mitad;
            } else if (A[mitad] < dato) {
                inicio = mitad + 1;
            } else {
                fin = mitad - 1;
            }
        }
        return -1;

    }

    
}
