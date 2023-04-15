/*/*Declarar una clase llamada ejer_2_Circu que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase ejer_2_Circu.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Principal;

import Entidades.Circunferencia;
import java.util.Scanner;
//import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejer_2_Circu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
        Circunferencia radio1 = new Circunferencia(0);
       radio1.crearCircunferencia(0);
        System.out.println("el radio es " + radio1.area());
        System.out.println(" El perimetro es: "+ radio1.perimetro());
        
           
         
      
    }
    
}
