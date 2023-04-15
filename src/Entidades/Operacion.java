/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. x
A continuación, se deben crear los siguientes métodos: 
Método constructor con todos los atributos pasados por parámetro. x
Método constructor sin los atributos pasados por parámetro. x
Métodos get y set. x
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.x

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Operacion {
    
    private double numero1, numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

  
    
    public void crearOperacion(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer y segundo número");
        this.numero1 = leer.nextDouble();
        this.numero2 = leer.nextDouble();
    }
    //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public double sumar(){
       double result;
       result =  numero1+numero2;       
        return result;
    }
    
    //Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar(){ 
       return numero1-numero2;
    }
    
    //Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
    //si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    
    public double multiplicar(){ 
        double produc;
        
        if (numero1== 0 || numero2==0 ) {
            System.out.println("Error");
            produc=0;
        }else{
        
        produc= numero1*numero2;
        
        }
        return produc;
    }
    
    
//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
    //el método devuelve 0 y se le informa al usuario el error. Si no, se hace la división y se devuelve el resultado al main.

    public double division(){
       double div;
       
        if (numero2==0 ) {
            System.out.println("Error");
          div=0;
        }else{
        
        div= numero1/numero2;
        
        }
        return div;
    }
        
}
