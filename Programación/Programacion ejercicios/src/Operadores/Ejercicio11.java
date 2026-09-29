package Operadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Número entero:");
        int entero = lector.nextInt();

        int division = entero/2;
        int resto = entero%2;

        boolean esPar = resto == 0;
        boolean mayorQue50 = entero > 50;

        System.out.println("¿El número es par?: "+esPar);
        System.out.println("¿El número es mayor que 50: "+mayorQue50);



    }
}
