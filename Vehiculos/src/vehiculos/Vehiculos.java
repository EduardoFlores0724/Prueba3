/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int seleccionMenu = 0;
        char seleccionsubmenu =0;
        
        
        System.out.println("Catalago de Vehiculos Inportados");
        System.out.printf("%15s\n","Eriz Shop!!");
        System.out.println("------------------");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.println("3. Mitsubishi");
        System.out.println("4. Ferrari");
        System.out.println("5. Volkwagen");
        System.out.print("respuesta: ");
        seleccionMenu = sc.nextInt();
        
        switch(seleccionMenu){
        
            case 1:
                System.out.println("Catalago de Toyota");
                System.out.println("A. Yaris");
                System.out.println("B. Tacoma");
                System.out.println("C. 22R");
                System.out.print("Respuesta:");
                sc.nextLine();
                seleccionsubmenu = sc.nextLine().toUpperCase().charAt(0);
                switch(seleccionsubmenu){
                    case 'A':
                        break;
                    case 'B':
                        break;
                    case 'C':
                        break;
                    default:
                        break;
                    
                }
                break;
            case 2:
                System.out.println("Catalago de Honda");
                System.out.println("1. CRV");
                System.out.println("2.Civic");
                System.out.println("3. Accord");
                System.out.print("Respuesta:");
                sc.nextLine();
                seleccionsubmenu = sc.nextLine().charAt(0);
                switch(seleccionsubmenu){
                    case '1':
                        break;
                    case '2':
                        break;
                    case '3':
                        break;
                    default:
                        break;
                        
                
                }

                break; 
             case 3:
                 System.out.println("Catalago de Mitsubishi");
                 System.out.println("A. L200");
                 System.out.println("B. OutLander");
                 System.out.println("C. Lancer");
                 System.out.print("Respuesta:");
                 sc.nextLine();
                 seleccionsubmenu = sc.nextLine().toUpperCase().charAt(0);
                 if(seleccionsubmenu == 'A'){
                    System.out.printf("%sCarro de trabajo%n","\u001B[31m","\u001B[0m");
                    
                 }else if(seleccionsubmenu == 'B'){
                    System.out.printf("%sCarro de lujo%n","\u001B[31m","\u001B[0m");
                     
                 }else if(seleccionsubmenu == 'C'){
                    System.out.printf("%sCarro deportivo%n","\u001B[31m","\u001B[0m");
                     
                 }else{
                    System.out.println("Esa opcion no tenemos");

                 }
        
                break;   
             case 4:
                 System.out.println("Catalago de Ferriri");
                break;
             case 5:
                System.out.println("Catalago de Volkswagen");
                break;   
             default:
                System.out.println("No seas mamon... es del 1 al 5"); 
                break;
        }
    }
    
}
