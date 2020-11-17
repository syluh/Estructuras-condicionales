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
public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //Declarar variables
        double n;
        n = 0;
        
        System.out.println("Programa que permite saber si un número es positivo o si es negativo");
        System.out.println("---------------");
        
        System.out.println("Ingrese el número a comparar");
        n =leer.nextDouble();
        
        //Condiciones
        if (n>0)
            System.out.println("El número es positivo");
        else if (n<0)
            System.out.println("El número es negativo");
    }
}
