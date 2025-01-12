package dicotomica;

import java.util.Scanner;

/**
 *
 * @author baske
 */
 /**
       34) Tenemos un array de n�meros ordenados ascendentemente. Dado un n�mero, crea un m�todo que devuelva la primera posici�n en la que se encuentra dicho elemento.
       Si el elemento no est� en el array devolver� -1.
       Haz una segunda versi�n usando una b�squeda dicot�mica.
       Compara el tiempo de b�squeda en un array de 10000 enteros en cada caso (los valores ser�n del 0 al 9999).
     */
public class Busqueda_dicotomica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] aPrueba = {1, 3, 6, 8, 10, 43, 56, 674, 4342};

        System.out.println("Que numero deseas buscar?");
        int usuario = teclado.nextInt();

        int resultado = buscador(aPrueba, usuario);

        if (resultado == -1) {

            System.out.println("El numero no est� en el vector");
        } else {
            System.out.println("El numero se encuentra en la posici�n del vector: " + resultado);
        }

    }
    
    /**
     * El objetivo es partir el array por la mitad una y otra vez para llegar al numero m�s r�pidamente al deshacerte del 50% de los datos de una
     * @param vector El array en el que deseamos buscar
     * @param usuario El numero que queremos buscar
     * @return nos devolver� la posici�n del array o -1 si no existe
     */
    public static int buscador(int[] vector, int usuario) {

        int inicio, fin, medio;

        inicio = 0;
        fin = vector.length - 1;

        do {
            medio = (inicio + fin) / 2;

            if (usuario == vector[medio]) {
                return medio;

            } else if (usuario > vector[medio]) {
                inicio = medio + 1;

            } else {
                fin = medio - 1;
            }

        } while (inicio <= fin);

        return -1;
    }

}

