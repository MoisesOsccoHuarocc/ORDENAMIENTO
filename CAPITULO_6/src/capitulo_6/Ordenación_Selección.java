/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_6;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenación_Selección {
 public static void main(String[] args) {
        // ORDENAMIENTO POR SELECCIÓN
        //El algoritmo se apoya en las pasadas que intercambian el elemento más pequeño, 
        //sucesivamente con el elemento de la lista, a[], que ocupa la posición igual al orden de pasada.
        System.out.println("ORDENACION POR SELECCION");     
        int[] arreglo = {26,58,26,89,63,784,100,231,455,999,1000,472,1,10,5,2,6 };
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

    
