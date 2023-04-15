/*Definir una clase llamada Punto que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, 
siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Punto.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Punto {
    
    private double x1,y1,x2, y2;
    
    public Punto(){ //constructor vacío 
    }
    
    public Punto(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    
    public double getX1(){
        return x1;
    }
    
    public void setX1(double x1){
        this.x1=x1;
    }

     public double getY1(){
         return y1;
     }
     
     public void setY1(double y1){
         this.y1=y1;
     }
     
     public double getX2(){
         return x2;
     }
     
     public void setX2(double x2){
     this.x2=x2;
     }
     
     public double getY2(){
         return y2;
     }
     
     public void setY2(double y2){
         this.y2=y2;
     }
     
     public void crearPuntos(){ // método para crear un objeto punto nuevo
         
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Indique el valor de X en el punto 1");
         x1= leer.nextDouble();
         System.out.println("Indique el valor de Y en el punto 1");
         x2= leer.nextDouble();
         System.out.println("Indique el valor de X en el punto 2");
         y1= leer.nextDouble();
         System.out.println("Indique el valor de Y en el punto 2");
         y2= leer.nextDouble();
     }      
     
     public void distancia(){
         double distancia;
         
         distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
         System.out.println("La distancia entre ambos puntos es " + distancia);
         
     }
         
}

