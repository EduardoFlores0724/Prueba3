/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodos_variables;

import java.util.Scanner;

/**
 * // Ejercicio 1: Cálculo con dos variables - Eriz Eduardo Flores Canales
 *
 * @author HP
 */
public class Calculodos_variables {
public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Area del rectangulo: " + area);
        System.out.println("Perimetro del rectangulo: " + perimetro);

        scanner.close();
    }
    
}
