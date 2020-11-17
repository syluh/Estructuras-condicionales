/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;
/**
 *
 * @author VICTOR
 */
public class Mayor3n {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //Declarar las variables 
         double n1,n2,n3;
         n1 = 0; n2 = 0; n3 = 0;
         
         System.out.println("Programa que permite saber cual es el mayor de 3 números");
         System.out.println("------------------------");
         
        System.out.println("Ingres el primer numero");
        n1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextDouble();
        System.out.println("Ingrese el tercer número");
        n3 = leer.nextDouble();
        
        //Proceso con condiciones
        
          if ((n1>n2)&&(n2>n3)){
            System.out.println("El número mayor es " +n1);
        } else if ((n2>n1)&& (n1>n3)){
              System.out.println("El número mayor es " +n2);
              
        } else if ((n3>n2)&&(n2>n1)){
              System.out.println("El número mayor es " +n3);
              
        } else if ((n1>n2)&&(n1>n3)){
              System.out.println("El número mayor es  " +n1);
        } else if ((n2>n1)&&(n2>n3)) {
            System.out.println("El número mayor es " +n2);
        
            } else if ((n3>n1)&&(n3>n2))
                System.out.println("El número mayor es " +n3);
          
          
          
    }
     
}
