/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelibreria;

import java.util.Scanner;

/**

 *
 * Ejercicio 2: Uso de la librería Math - Eriz Eduardo Flores Canales
 */
public class Usodelibreria {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        double radio = sc.nextDouble();

        // Cálculo del área: PI * r^2
        double area = Math.PI * Math.pow(radio, 2);
        
        // Cálculo de la circunferencia: 2 * PI * r
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Area del circulo: " + area);
        System.out.println("Circunferencia del circulo: " + circunferencia);

    }
    
}
