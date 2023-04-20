/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores  adivinar  números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author blom3
 */
public class Juego {

    
    private String juga1, juga2;
    private int num;

    public Juego() {
    }

    public Juego(String juga1, String juga2, int num) {
        this.juga1 = juga1;
        this.juga2 = juga2;
        this.num = num;
    }

    public String getJuga1() {
        return juga1;
    }

    public void setJuga1(String juga1) {
        this.juga1 = juga1;
    }

    public String getJuga2() {
        return juga2;
    }

    public void setJuga2(String juga2) {
        this.juga2 = juga2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);

        int opor = 0, jugador1 = 0, jugador2 = 0;
        String resp = "";
        
        System.out.println("         **** ADIVINA EL NÚMERO ****");
        System.out.println("");
        System.out.print("Jugador 1 ingresa tu nombre: ");
        juga1 = leer.next();

        System.out.print("Jugador 2 ingresa tu nombre: ");
        juga2 = leer.next();

        System.out.println("                **** PLAY ****");
        
        do {
            System.out.print(juga1 + " Ingresa tu número secreto :");
            num = leer.nextInt();

            do {

                System.out.print(juga2 + " Adivina el numero de  " + juga1 + " ");
                int num2 = leer.nextInt();

                if (num2 == num) {
                    opor++;
                    jugador2++;
                    System.out.println(juga2 + " Ganaste con " + opor + " intento");
                    break;
                } else {
                    if (num < num2) {
                        System.out.println("Un número mas bajo");

                    } else {
                        System.out.println("Un número mas alto");
                    }
                    opor++;
                    System.out.println("");
                }
            } while (opor < 3);
            if (opor == 3) {
               
                jugador1++;

            }
            System.out.println("Quiere seguir jugando? S/N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));
        
        System.out.println("El jugador 1 gano: "+jugador1+" veces.");
        System.out.println("El jugador 2 gano: "+jugador2+" veces.");

    }

}
