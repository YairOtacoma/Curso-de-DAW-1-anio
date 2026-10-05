package OperadoresFáciles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Primer número:");
        int entero1 = lector.nextInt();

        System.out.println("Segundo número:");
        int entero2 = lector.nextInt();

        int suma = entero1+entero2;
        int resta = entero1-entero2;
        int multi = entero1*entero2;
        int divi = entero1/entero2;
        int resto = entero1%entero2;

        System.out.println("Suma :"+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación "+multi);
        System.out.println("División: "+divi);
        System.out.println("Módulo: "+resto);


    }
}
