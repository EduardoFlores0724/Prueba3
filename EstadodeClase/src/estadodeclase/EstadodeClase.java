/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadodeclase;

import java.util.Scanner;

/**
 *1. conocer las estructuras de selección 
 *      a. Toma de decición simple 
 *      b. Toma de decición doble
 *      c. Decisiones numericos y caracteres/cadenas
 * 
 * @author HP

 */

/*
       se necesita desarrollar un algoritmo que
determine si un bote de agua de 500 ml
        a. esta arriba de la mitad. (Dato Numerico)
        b. contiene agua o no       (Dato d Caracter })

*/
public class EstadodeClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
      /*  //conociendo la estructura 
        //Palabra Clave "if" y/o "else"
        //El grupo de instrucciones se encierra entre()
        no se usa ";" para los bloques 
        La condición es una comparación bajo d 
        */
int cantidadAgua = 0;
char respuesta = '@';
String respuestaAmbiente = "Jomh Doe";
     
     System.out.println("El bote es de 500 ml");
     System.out.print("Cuanto liquido dices que contiene?");
     cantidadAgua = input.nextInt();
     
if(cantidadAgua >= 250 ){
    System.out.println("si, tiene mas de la mitad");
    System.out.println("Lo puedes beber!!!");
    System.out.println("No nos quedamos sin nada..hay suficiente");
     }
    input.nextLine();
    System.out.println("");
    System.out.println("El liquido que contiene es H2O? (a=Si, b=no)");
    respuesta = input.nextLine().charAt(0);
    
    
    if (respuesta =='a'){
    System.out.println("""
                       Si es agua lo que contine 
                       no es otra cosa... nada embriagante.!!
                           
                       """);
    }
    else{
    System.out.println("""
                       UY uy UY
                       Que sera?
                       """);
            }
  
System.out.printf("\nEse Bote que contiene %d ml", cantidadAgua);      
System.out.println("\nEs amigable con el ambiente");
respuestaAmbiente = input.nextLine();
/*
System.out.printf("Dato de Variable: %s", respuestaAmbiente);

System.out.println("Seguro");
respuestaAmbiente = input.nextLine().toUpperCase();
System.out.printf("Dato de Variable: %s", respuestaAmbiente);

System.out.println("100% Seguro?");
respuestaAmbiente = input.nextLine().toUpperCase();
System.out.printf("Dato de Variable: %s", respuestaAmbiente);
 */
  if (respuestaAmbiente.equals("Si")) {
    System.out.println("Es amigable");
    
  }
    else {
      System.out.println("no es nada amigable");
    }
  }
    
}

