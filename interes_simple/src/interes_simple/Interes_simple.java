/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;

import java.util.Scanner;

/**
 * // Ejercicio 3: Interés simple - Eriz Eduardo Flores Canales
 *
 * @author HP
 */
public class Interes_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el capital inicial: ");
        double capital = sc.nextDouble();

        System.out.print("Ingrese la tasa de interes anual (numero entero, ej. 5 para 5%): ");
        int tasa = sc.nextInt();

        System.out.print("Ingrese el tiempo en anos: ");
        int tiempo = sc.nextInt();

        // Fórmula: (Capital * Tasa * Tiempo) / 100
        double interes = (capital * tasa * tiempo) / 100.0;

        System.out.println("\n--- RESULTADO ---");
        System.out.println("El interes generado es: " + interes);

        
    }
    
}
