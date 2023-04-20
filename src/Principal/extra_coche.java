/*1) Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.

 */
package Principal;


import Entidades.Coche;
import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class extra_coche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
       
        coche1.crearCoche();
        
        
        System.out.println( coche1.toString());
         System.out.println(coche2.toString()); 
         System.out.println(coche3.toString());
       
    }
    
}
