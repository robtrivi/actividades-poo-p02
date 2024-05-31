/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tarea01;

import java.util.Scanner;

/**
 *
 * @author robes
 */
public class Tarea01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // ejercicio01(scn);
        // ejercicio02(scn);
        // ejercicio03(scn);
        // ejercicio04v1(scn);
        // ejercicio04v2(scn);
        // ejercicio05(scn);
        // ejercicio06v1(scn);
        // ejercicio06v2(scn);
        scn.close();
    }
    
    public static void ejercicio01(Scanner scn){
        double base, altura, area;
        System.out.print("Ingrese base del triángulo: ");
        base = scn.nextDouble();
        System.out.print("Ingrese altura del triángulo: ");
        altura = scn.nextDouble();
        area = base*altura/2;
        System.out.println("El promedio es: " + area);
    }
    
    public static void ejercicio02(Scanner scn){
        System.out.print("Ingrese un número: ");
        int numero = scn.nextInt();
        for (int n = 1; n <= 12; n++) {
            System.out.printf("%d x %d = %d\n",numero,n,numero*n);
        }
    }
    
    public static void ejercicio03(Scanner scn){
        int anio;
        String resp;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese año: ");
            anio = scn.nextInt();
            if ((anio%4==0 && anio%100!=0) || anio%400==0) {
                resp = "es";
            }else{
                resp = "NO es";
            }
            System.out.printf("El año %d %s bisiesto\n",anio,resp);
        }
    }
    
    public static void ejercicio04v1(Scanner scn){
        int numeroIngresado, total = 0;
        double promedio = 0, suma = 0;
        do{
            System.out.print("Ingrese un número: ");
            numeroIngresado = scn.nextInt();
            if (numeroIngresado >= 0){
                suma += numeroIngresado;
                total ++;
            }
        }while(numeroIngresado >= 0);
        if (total > 0){
            promedio = suma/total;
        }
        System.out.printf("El promedio es: %.2f\n",promedio);
    }
    
    public static void ejercicio04v2(Scanner scn){
        int numeroIngresado, total = 0;
        double promedio = 0, suma = 0;
        do{
            System.out.print("Ingrese un número: ");
            numeroIngresado = scn.nextInt();
            if (numeroIngresado < 0){
                break;
            }
            suma += numeroIngresado;
            total ++;
        }while(numeroIngresado >= 0);
        if (total > 0){
            promedio = suma/total;
        }
        System.out.printf("El promedio es: %.2f\n",promedio);
    }
    
    public static void ejercicio05(Scanner scn){
        int suma = 0, digito, numeroIngresado, numeroTemp;
        System.out.print("Ingrese un número: ");
        numeroIngresado = scn.nextInt();
        numeroTemp = numeroIngresado;
        while (numeroTemp > 0){
            digito = numeroTemp%10;
            suma += digito;
            numeroTemp/=10;
        }
        System.out.println("La suma de digitos es: " + suma);
    }
    
    public static void ejercicio06v1(Scanner scn){
        short numAleatorio = (short) (100*Math.random()+1);
        int intentos = 5, numIngresado;
        String resp;
        boolean gano = false;
        System.out.println("El número ha sido generado...Buena suerte");
        while (intentos > 0 && !gano){
            System.out.print("Ingrese un número: ");
            numIngresado = scn.nextInt();
            if (numIngresado == numAleatorio){
                System.out.println("¡Felicidades, adivinaste!");
                gano = true;
            }else{
                intentos--;
                if (numIngresado > numAleatorio) {
                    resp = "MENOR";
                }else{
                    resp = "MAYOR";
                }
                System.out.printf("El número a adivinar es %s\n al que ingresó",resp);
                System.out.printf("Te quedan %d intentos\n",intentos);
            }
        }
        if (!gano) {
            System.out.println("Has perdido...");
        }
    }
    
    public static void ejercicio06v2(Scanner scn){
        short numAleatorio = (short) (100*Math.random()+1);
        int intentos = 5, numIngresado;
        String resp;
        System.out.println("El número ha sido generado...Buena suerte");
        while (intentos > 0){
            System.out.print("Ingrese un número: ");
            numIngresado = scn.nextInt();
            if (numIngresado == numAleatorio){
                System.out.println("¡Felicidades, adivinaste!");
                break;
            }
            intentos--;
            if (numIngresado > numAleatorio) {
                resp = "MENOR";
            }else{
                resp = "MAYOR";
            }
            System.out.printf("El número a adivinar es %s\n al que ingresó",resp);
            System.out.printf("Te quedan %d intentos\n",intentos);

        }
        if (intentos<=0) {
            System.out.println("Has perdido...");
        }
    }
}
