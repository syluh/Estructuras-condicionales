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
public class ParImpar {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Inicializar las variables
        int n = 0;
        String tipo = "";
        
        System.out.println("Programa para verificar si un número es par o impar");
        //Ingreso de datos
        System.out.println("ingrese el número a verificar");
        n = leer.nextInt();
                
        if (n % 2 == 0)
            tipo = "par";
        else 
            tipo = "impar";   
        
        //Salida de datos
        System.out.println("El numero " +n + " es " +tipo);
    }
    
}
