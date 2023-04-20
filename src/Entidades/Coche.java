/*1) Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea tres objetos de la clase "Coche" y muéstralos por pantalla.

 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int precio;

    public Coche() {
    }

    public Coche(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    public void crearCoche(){
        
        Scanner leer = new Scanner(System.in);
       
        for (int i = 0; i < 3; i++) {
            
             System.out.println("Ingrese la marca del coche numero "+(i+1));
        this.marca=leer.next();
        
        System.out.println("Ingrese el modelo del coche");
        this.modelo=leer.next();
        
        System.out.println("Ingrese el precio del coche");
        this.precio = leer.nextInt();
        }
        
       
        
  
    }

  
    
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
}
    

