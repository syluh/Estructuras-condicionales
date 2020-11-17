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
public class ConvHoras {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Declarar las variables
            int h24, m24, h12, m12;
            String periodo;
            
            h24 = 0; m24 = 0; h12 = 0; m12 = 0;
            periodo = "a.m.";
            
            System.out.println("Programa para convertir las horas en formato de 24 a 12 horas");
            //Ingresar los datos de entrada
            System.out.println("---Si no esta en formado 24h el programa no va a lanzar los datos de manera correcta----");
            System.out.println("Ingrese la hora en formato 24 a trasformar");
            h24 = leer.nextInt();
            System.out.println("Ingrese los  minutos a trasnformar");
            m24 = leer.nextInt();
            //Proceso
            if ((h24 < 25)&&(h24 > 0)){
                if (((h24 >= 0) && (h24 <= 24)) && ((m24 >= 0) && (m24 <= 60))) {
                    if (m24 == 60){
                        h24 = h24 + 1;
                        m24 = 0;
                    }
                    
                        
                        
                    else{
                        m12 = m24;
                        
                    
                            
                            } 
                    
                    }
                        
                    if (h24 >= 12){
                        h12 = h24 -12;
                        periodo = "p.m.";}

                        }  
                    
                               
                
                    System.out.println("EL tiempo de "  +h24 + " horas y " +m24 + " minutos" + " am " );
                    
                    System.out.println("Equivale a "  +h12 + " horas y " +m12 + " minutos" + " pm ");
                    
}            
                        
                        
                
                
                
         
           
            
                    
    
   
    }       
                    
     

