/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Ordenacion_Intercambio_2{

     public static void main(String arg[]) throws IOException
    {
        //ORDENACIÓN POR INTERCAMBIO
        //El algoritmo se basa en la lectura sucesiva de la lista a ordenar, 
        //comparando el elemento inferior de la lista con los restantes y efectuando un
        //intercambio de posiciones cuando el orden resultante de la comparación no sea el correcto.
       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ORDENACION POR INTERCAMBIO");
        System.out.print("\n Ingrese la cantidad de numeros a ordenar: ");
        int tam = Integer.parseInt(in.readLine());

        int arr[] = new int[tam];
        System.out.println();

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j += 1;
            System.out.print("Numero " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        intercambio(arr);
    }

    static void intercambio(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        System.out.println("LOS NUMEROS ORDENADOS SON:");
        for (int i = 0; i < arreglo.length; i++) {
           
            System.out.print(+ arreglo[i] + "\n");
        }
    }
}