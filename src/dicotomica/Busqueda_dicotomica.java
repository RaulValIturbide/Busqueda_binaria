package dicotomica;

import java.util.Scanner;

/**
 *
 * @author baske
 */
 /**
       34) Tenemos un array de números ordenados ascendentemente. Dado un número, crea un método que devuelva la primera posición en la que se encuentra dicho elemento.
       Si el elemento no está en el array devolverá -1.
       Haz una segunda versión usando una búsqueda dicotómica.
       Compara el tiempo de búsqueda en un array de 10000 enteros en cada caso (los valores serán del 0 al 9999).
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

            System.out.println("El numero no está en el vector");
        } else {
            System.out.println("El numero se encuentra en la posición del vector: " + resultado);
        }

    }
    
    /**
     * El objetivo es partir el array por la mitad una y otra vez para llegar al numero más rápidamente al deshacerte del 50% de los datos de una
     * @param vector El array en el que deseamos buscar
     * @param usuario El numero que queremos buscar
     * @return nos devolverá la posición del array o -1 si no existe
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

