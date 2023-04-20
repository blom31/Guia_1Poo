/*2) Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para mostrar por pantalla los estudiantes 
que tienen una nota media superior.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void calcularnota(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Nombre del estudiante");
        
        

}
    
    
    
}
