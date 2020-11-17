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
public class TotalFactura {
    public static void main(String[] args) {
     
       Scanner leer = new Scanner(System.in);
       
       //Declaracion e inicializacion de variables
       
       double subtotal, total, descuento;
       int limite1, limite2;
       
       subtotal = 0; total = 0; descuento = 0;
       limite1 = 200; limite2 = 500;
       
       //Ingresar los datos
        System.out.println("Programa para calcular el valor total de una factura con descuentos");
        
        System.out.println("Ingrese el subtotal de la compra:");
        subtotal = leer.nextDouble();
       //Proceso para determinar el descuento en base el subtotal 
        if ((subtotal >= limite1) && (subtotal < limite2))
            descuento = 0.10;
        else 
            if (subtotal >= limite2)
                descuento = 0.15;
        if (subtotal < limite1);
            System.out.println("No hay descuento cuando la compra es menor a 200$");
        
        total = subtotal - (subtotal * descuento);
        
        //Se presenta la salida de datos
        
        System.out.println("El total de la factura es " +total + " con un descuento de " +descuento);
        
        
        
                    
        
                
    }
    
    
}
