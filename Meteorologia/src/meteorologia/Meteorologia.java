/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meteorologia;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Meteorologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int temperatura =0;
        
        int dia =1;//Variable de control
        int tempAcum =0;
        double promedioTemp =0;
        
        
        while( dia <= 7){
            
            System.out.print("ingrese la Tamperatura ");
            temperatura = sc.nextInt();
            
        System.out.printf("Dia %d: \tTemperatura es: %d\t TempAcumulado %d",dia, temperatura, tempAcum);
         dia++;
        tempAcum += temperatura;
        System.out.println("");
        
       // dia +=1;//dia =dia +1;

        
        
        }//fin de while
        dia--;
        System.out.printf("dia Final: %d",dia);
        promedioTemp = tempAcum / dia;
        
        System.out.printf(" Promedio: %.2f",promedioTemp);
        
        
        
        
    }//fin de main
    
}//fin de class

