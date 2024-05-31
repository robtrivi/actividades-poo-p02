/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.taller1;

import ec.edu.espol.taller1.tamagotchi.Comida;
import ec.edu.espol.taller1.tamagotchi.Mascota;
import java.util.Scanner;

/**
 *
 * @author robes
 */
public class Main {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }
    
    public static void ejercicio1(){
        int numGenerado;
        int conteo = 0;
        do{
            numGenerado = (short) (100*Math.random()+1);
            System.out.println("Número aleatorio: " + numGenerado);
            if (numGenerado % 2 == 0) {
                conteo++;
            }
        }while(conteo < 5);
        System.out.println("FIN. Se han generado 5 números pares");
    }
    
    public static void ejercicio2(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nombre de la mascota: ");
        String nombreMascota = scn.nextLine();
        System.out.println("Puntos de comida de la mascota: ");
        int puntosComida = scn.nextInt();
        scn.nextLine();
        System.out.println("Puntos de salud de la mascota: ");
        int puntosSalud = scn.nextInt();
        scn.nextLine();
        Mascota mascota = new Mascota(nombreMascota,puntosComida,puntosSalud);
        System.out.println("------------------------------------------");
        System.out.println("Nombre de la comida: ");
        String nombreComida = scn.nextLine();
        System.out.println("Puntos de comida de la mascota: ");
        int puntosRecupera = scn.nextInt();
        scn.nextLine();
        Comida comida = new Comida(nombreComida,puntosRecupera);
        System.out.println("------------------------------------------");
        mascota.visitarMedico();
        mascota.comer(comida);
        mascota.jugar();
        mascota.mostrarEstadistica();
        scn.close();
        
    }
}
