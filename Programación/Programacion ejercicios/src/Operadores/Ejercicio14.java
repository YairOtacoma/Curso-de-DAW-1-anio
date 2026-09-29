package Operadores;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Edad de la persona");
        int edad = lector.nextInt();

        System.out.println("Nivel de estudios");
        int estudios = lector.nextInt();

        System.out.println("Ingresos");
        int ingresos = lector.nextInt();

        boolean masDe = edad > 40;
        boolean entre = estudios >= 5 && 8 >= estudios;
        boolean menosDe = ingresos < 15000;

        System.out.println("¿Tiene más de 40 años? "+masDe);
        System.out.println("¿Su nivel de estudias esta entre 5 y 8? "+entre);
        System.out.println("¿Gana menos de 15000? "+menosDe);



    }
}
