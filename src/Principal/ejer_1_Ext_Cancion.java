/*/*Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías 
y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 * 
*/
package Principal;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class ejer_1_Ext_Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Cancion song = new Cancion();
        
        System.out.println("Ingrese el título de la canción");
        song.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese el autor de la canción");
        song.setAutor(leer.nextLine());
        
        System.out.println(song.toString());
        
    }
    
}
