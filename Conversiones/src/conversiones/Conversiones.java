/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
            //Declaracion de variables 

        int pulgada = 0;
        double resultadoCM = 0;
        
        double kilometros =100;
        double millas = 0;
        double gcelsius = 0;
        double gfarenheit = 0;
         

System.out.println("Tenemos 5 pulgadas");
System.out.println("Cuanto es eso en CM");

pulgada =5;

resultadoCM = pulgada * 2.54;
System.out.printf("%d pulgadas es equivalente a %.2f cm", pulgada,resultadoCM);

pulgada = 12;
resultadoCM = pulgada * 2.54;
System.out.printf("\n%.2f es equivalente a %d pulgadas",resultadoCM,pulgada);

System.out.println("\n Dime cuantos kilometros son?");
kilometros = teclado.nextDouble();

millas = kilometros / 1.6;
System.out.printf("%.2f km es = a %.3f millas",kilometros,millas);
System.out.print(kilometros + "km es equivalente a " + millas +"millas\n");

System.out.println("\n dime cuantos grados celsius son");
gcelsius = teclado.nextDouble();

gfarenheit =(gcelsius * 1.8) +32;
System.out.printf("Resultado Farenheit: %.2f", gfarenheit);

    }//Fin de MAIN
    
}
