package Operadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        //Cadena de caracteres

        Scanner lector = new Scanner(System.in);

        System.out.println("Primera cadena");
        String cadena1 = lector.nextLine();

        System.out.println("Segunda cadena");
        String cadena2 = lector.nextLine();

        boolean iguales = cadena1.equals(cadena2);
        //Para comprar dos strings no es con ==, sino con ->.equls().
        boolean menorQue = cadena1.length() < cadena2.length();
        //Para comparar longitud ->.length()
        boolean distintas = !cadena1.equalsIgnoreCase(cadena2);
        //Para saber si son distintas con ->.equalsIgnoreCase
        //IMPORTANTE-> Poner la exclamacion al principio "!"

        System.out.println("¿Son iguales?: "+iguales);
        System.out.println("¿La primera es menor que la segunda? "+menorQue);
        System.out.println("¿Son distintas? "+distintas);


    }
}
