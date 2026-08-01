/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Donaciondesangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner input=new Scanner (System.in);
        int edad =0;
        int peso =0;
        double sangre =0;
        double respuesta =0;
        boolean desayuno = true;
        String genero = "Masculino";
        int hierro =0;
        
        
        System.out.println("¿Cual es su edad");
        edad = input.nextInt();
        System.out.println("¿Cual es su peso en libras");
        peso= input.nextInt();
        
        if (edad >=18 && edad <= 64 && peso >=110){
            input.nextLine();
            
            System.out.println("si puede donar sangre");
            System.out.println("Ha desayunado? Si | No");
            
            respuesta = input.nextLine() .charAt(0);
            if(respuesta == 'S' || respuesta == 's'){
                System.out.println("Si se puede donar sangre");
            }
            else{
                System.out.println("Es necesario que desayune, no puedes donar! :(");
            }       
        }else{
            System.out.println("Lo sentimos... no puede donar sangre:");
            } 
        System.out.println("Ingrese su nivel de hierro en sangre");
        hierro = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Ingrese su genero");
        genero = input.nextLine().toUpperCase();
        
        if((hierro >= 14 && genero.equals("MASCULINO")) || (hierro >=12 && genero.equals("FEMENINO"))){
            System.out.println("Si puede donar sangre");
        
                   
        }else{
            System.out.println("No puede donar sangre");
            
        }
        
        
        
        
    }
    
}
