/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller1.tamagotchi;

/**
 *
 * @author robes
 */
public class Comida {
    private String nombre;
    private int puntosTipo;

    public String getNombre() {
        return nombre;
    }

    public int getPuntosTipo() {
        return puntosTipo;
    }

    public Comida(String nombre, int puntosTipo) {
        this.nombre = nombre;
        this.puntosTipo = puntosTipo;
    }
    
    
}
