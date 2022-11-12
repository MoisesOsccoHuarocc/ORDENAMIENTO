/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolistasreales;

/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class Cantante {

    //Propiedades de la clase
    private String nombre;

    //Método constructor vacío
    public Cantante() {
    }

    //Método constructor con parámetros
    public Cantante(String nombre) {
        this.nombre = nombre;
    }

    //Método para obtener el nombre del cantante
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String devolverCantante() {
        return "Nombre: " + nombre;
    }
}