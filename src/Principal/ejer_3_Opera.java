/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import Entidades.Operacion;

/**
 *
 * @author blom3
 */
public class ejer_3_Opera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion oper = new Operacion();
        
        oper.crearOperacion();
        
        System.out.println("La suma es " + oper.sumar());
        System.out.println("La resta es " + oper.restar());
        System.out.println("La mult es " + oper.multiplicar());
        System.out.println("La div es " + oper.division());
       
        
    }
    
}
