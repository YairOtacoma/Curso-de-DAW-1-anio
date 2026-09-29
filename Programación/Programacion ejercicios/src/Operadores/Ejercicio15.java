package Operadores;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Número entero");
        int entero = lector.nextInt();

        entero = entero+5;
        System.out.println("Súmale 5: "+entero);
        entero = entero-3;
        System.out.println("Réstale 3: "+entero);
        entero = entero*10;
        System.out.println("Multiplica por 10: "+entero);
        entero = entero/2;
        System.out.println("División entre 2: "+entero);




    }
}
