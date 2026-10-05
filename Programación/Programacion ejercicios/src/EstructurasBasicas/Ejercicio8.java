package EstructurasBasicas;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Calculadora de área de un rectángulo.

        Scanner lector = new Scanner(System.in);

        System.out.println("Base del rectángulo:");
        int base = lector.nextInt();

        System.out.println("Altura del rectángulo:");
        int altura = lector.nextInt();

        int area = base*altura;

        System.out.println("La base del rectángulo es: "+base);
        System.out.println("La altura del rectángulo es: "+altura);
        System.out.println("La área del rectángulo es: "+area);

    }
}
