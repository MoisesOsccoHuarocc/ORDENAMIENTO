/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo_8;

/**
 *
 * @author Coms-Lap
 */
public class Nodo1 {

    String dato;
    Nodo1 enlace;

    public Nodo1(String entrada) {
        dato = entrada;
        enlace = this; // se apunta asímismo
    }
}