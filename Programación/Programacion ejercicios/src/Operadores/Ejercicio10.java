package Operadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        //Descomposición número

        Scanner lector = new Scanner(System.in);

        System.out.println("Decenas de mil: ");
        int decenasMil = lector.nextInt();
        System.out.println("Unidades de mil: ");
        int unidadesMil = lector.nextInt();
        System.out.println("Centenas: ");
        int centenas = lector.nextInt();
        System.out.println("Decenas: ");
        int decenas = lector.nextInt();
        System.out.println("Unidades: ");
        int unidades = lector.nextInt();

        int potencia = 10;

        double dM = decenasMil*(Math.pow(potencia,5));
        double uM = unidadesMil*(Math.pow(potencia,4));
        double c = centenas*(Math.pow(potencia,3));
        double d = decenas*(Math.pow(potencia,2));

        double suma = dM+uM+c+d+unidades;

        System.out.println("El número introducido es: "+suma);

    }
}
