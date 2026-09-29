package Operadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Conversión a tiempo

        Scanner lector = new Scanner(System.in);

        System.out.println("Que cantidad de segundos quieres pasar a h;m;s");
        int segundosSistema = lector.nextInt(); //25678
        // 1h -> 3600s
        // 1h -> 60m
        // 1m -> 60s
        lector.close();

        int horas = segundosSistema/3600;
        int segundosRestantes = segundosSistema%3600;
        int minutos = segundosRestantes/60;
        int segundos = segundosRestantes%60;

        System.out.println("Horas: "+horas);
        System.out.println("Minutos "+minutos);
        System.out.println("Segundos "+segundos);






    }
}
