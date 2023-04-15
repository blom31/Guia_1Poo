/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Circunferencia { //Declaración una clase llamada Circunferencia
   
    
    private double radio; //atributo privado el radio de tipo real
    
    public Circunferencia(double radio) { //método constructor con parametros como radio de tipo doble
        this.radio = radio;
    }

    public double getRadio() { // método Get se utiliza para consultar el estado del objeto
        return radio;
    }

    public void setRadio(double radio) { //métdo Set  se usa para modificar el estado del objeto
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){ //método que pide el radio y lo guarda en el atributo radio (objeto)
        Scanner leer = new Scanner(System.in);
       // Double radio;
        System.out.print("Ingresa por favor el radio para calcular el área y su perímetro: ");
        radio = leer.nextDouble();
        this.radio=radio;
        
    }
    
    public double area(){ // método área que calcula el área de la circunferencia  (Area=〖π*radio〗^2).
        return Math.PI * Math.pow(radio,2); // Math.pow se usa para calcular un número elevado a la potencia de X numero
    }
    
    public double perimetro(){ //método  para crear el perimetro 
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}


