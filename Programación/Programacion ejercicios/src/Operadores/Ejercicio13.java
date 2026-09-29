package Operadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Primer número:");
        int entero1 = lector.nextInt();

        System.out.println("Segundo número");
        int entero2 = lector.nextInt();

        int division = entero1/2;
        int resto = entero1%2;

        int disvision2 = entero2/2;
        int resto2 = entero2%2;

        boolean par = resto == 0 && resto2 != 0;
        boolean superior = entero1 > 2*entero2 && entero1< 8;
        boolean iguales = entero1 == entero2 || (entero1-entero2) < 2;

        System.out.println("El primero es par y el segundo es impar: "+par);
        System.out.println("El primero es superior al doble del segundo e inferior: a 8 "+superior);
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2: "+iguales);


    }
}
