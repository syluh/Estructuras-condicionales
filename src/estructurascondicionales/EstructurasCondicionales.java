
package estructurascondicionales;
import java.util.Scanner;

/**
 *
 * @author VICTOR
 */
public class EstructurasCondicionales {
           
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
          //número a verificar si es par
          int n = 0; 
          
        System.out.println("Programa para verificar si un número es par");
        System.out.println("Ingrese el número a verficiar");
        
        n = leer.nextInt(); //Ingrese el número
        
        if ((n % 2) == 0) 
            System.out.println("El número " +n +" Es par ");
        
            
          
            
    }
    
}
