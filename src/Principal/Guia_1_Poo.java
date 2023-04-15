/*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un libro 
pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas.
 */
package Principal;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Guia_1_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
     
        Libro libro_1 = new Libro(); 
        

     
        System.out.println("Ingresa el ISBN");
        libro_1.setISBN(leer.nextLong());
        
        System.out.println("Ingresa el Título");
        libro_1.setTitulo(leer.next());
        
       System.out.println("Ingresa el autor");
       libro_1.setAutor(leer.next());
        
        System.out.println("ingresa el numero de paginas");
        libro_1.setNumPag(leer.nextInt());

        System.out.println(libro_1.toString());
    }
    
}
