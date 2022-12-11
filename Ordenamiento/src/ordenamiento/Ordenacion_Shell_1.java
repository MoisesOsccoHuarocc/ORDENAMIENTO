/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;

import java.util.Scanner;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenacion_Shell_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ORDENAMIENTO SHELL
        //La ordenación Shell debe el nombre a su inventor, D. L. Shell. Se suele denominar también
        //ordenación por inserción con incrementos decrecientes. Se considera que el método Shell es una
        //mejora del método de inserción directa.
        Scanner teclado = new Scanner(System.in);
        int Arreglo[] = new int[20];
        int numero, i, j, k, incremento, aux;
        System.out.println("ORDENACION POR SHELL");
        System.out.print("Ingrese dimension del arreglo: ");
        numero = teclado.nextInt();

        for (i = 1; i <= numero; i++) {
            System.out.print("NUMERO[" + i + "]= ");
            Arreglo[i] = teclado.nextInt();
        }

        incremento = numero / 2;
 
        while (incremento > 0) {
            for (i = incremento + 1; i <= numero; i++) {
                j = i - incremento;
                while (j > 0) {
                    if (Arreglo[j] >= Arreglo[j + incremento]) {
                        aux = Arreglo[j];
                        Arreglo[j] = Arreglo[j + incremento];
                        Arreglo[j + incremento] = aux;
                    } else {
                        j = 0;
                    }
                    j = j - incremento;
                }
            }
            incremento = incremento / 2;
        }

        System.out.println("LOS NUMEROS ORDENADOS SON: ");
        for (i = 1; i <= numero; i++) {
            System.out.print(" " + Arreglo[i]);

        }

    }
}
    
    

