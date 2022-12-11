/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenacion_Seleccion_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ORDENAMIENTO POR SELECCIÓN
        //El algoritmo se apoya en las pasadas que intercambian el elemento más pequeño, 
        //sucesivamente con el elemento de la lista, a[], que ocupa la posición igual al orden de pasada.
        System.out.println("ORDENACION POR SELECCION");     
        int[] arreglo = {65,14,10,2,0,89,78,13,1,3,9,485,963,6520,365,784,985,120,741,48};
        System.out.println("LOS NUMEROS SIN ORDENAR SON: ");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
        // Ordenamos. Recuerda: en Java los arreglos se pasan por referencia así que no necesitamos obtener
        // el resultado, ya que dentro de la función se modifica al arreglo       
        ordenarPorSeleccion(arreglo);

        System.out.println("\nLOS NUMEROS ORDENADOS SON: ");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
    }

    public static void ordenarPorSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
}
    
    

