package Estructuras;

import java.util.Scanner;

public class SentenciasSelección {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una nota");
        double nota = lector.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("La nota no es valida");
        }
        if (nota < 5) {
            System.out.println("Examen suspenso");
        }else {
            System.out.println("Examen aprobado");
        }
        if (nota <= 3) {
                System.out.println("Suspenso clarisimo");
        } else if (nota < 5) {
                System.out.println("Suspenso pelao");
        } else if (nota < 7) {
                System.out.println("Notable");
        } else if (nota <= 9) {
                System.out.println("Sobresaliente");
        } else {
                System.out.println("Perfecto");
        }
        System.out.println("Terminando el programa de evaluación del examen");


    }
}
