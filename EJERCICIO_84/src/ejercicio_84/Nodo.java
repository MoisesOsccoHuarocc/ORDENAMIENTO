/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_84;

/**
 *
 * @author Coms-Lap
 */
public class Nodo {

    String dato;
    Nodo enlace;

    public Nodo(String entrada) {
        dato = entrada;
        enlace = this; // se apunta asímismo
    }
}