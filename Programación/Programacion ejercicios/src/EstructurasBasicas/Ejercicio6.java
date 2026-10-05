package EstructurasBasicas;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Primera variable numérica:");
        int var1 = lector.nextInt();
        System.out.println("Número 1: "+var1);

        System.out.println("Segunda variable numérica:");
        int var2 = lector.nextInt();
        System.out.println("Número 2: "+var2);

        int suma = var1+var2;
        int resta = var1-var2;
        int multiplicacion = var1*var2;
        int division = var1/var2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.println("División :"+division);
    }
}
