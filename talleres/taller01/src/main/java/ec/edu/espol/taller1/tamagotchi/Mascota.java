/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.taller1.tamagotchi;

/**
 *
 * @author robes
 */
public class Mascota {
    private String nombre;
    private int puntosComida;
    private int puntosSalud;
    private boolean esFeliz;

    public Mascota(String nombre, int puntosComida, int puntosSalud) {
        this.nombre = nombre;
        this.puntosComida = puntosComida;
        this.puntosSalud = puntosSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosComida() {
        return puntosComida;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public boolean isEsFeliz() {
        return esFeliz;
    }

    
    
    public Mascota(String nombre) {
        this(nombre,15,10);
    }
    
    public void visitarMedico(){
        if ((this.puntosSalud + 10) <= 60) {
            this.puntosSalud += 10;
        }
        System.out.printf("%s se siente mejor\n",this.getNombre());
    }
    
    public void comer(Comida comida){
        this.puntosComida += comida.getPuntosTipo();
        System.out.printf("%s está comiendo %s\n",this.getNombre(),comida.getNombre());
    }
    
    public void jugar(){
        this.esFeliz = true;
        System.out.printf("%s está jugando\n",this.getNombre());
    }
    
    public void mostrarEstadistica(){
        System.out.printf("Nombre de la mascota: %s\n",this.nombre);
        System.out.printf("Puntos comida: %d\n",this.puntosComida);
        System.out.printf("Salud: %d\n",this.puntosSalud);
        String estado = "Triste";
        if (this.esFeliz){
            estado = "Alegre";
        }
        System.out.printf("Estado de ánimo: %s\n", estado);   
    }
}
