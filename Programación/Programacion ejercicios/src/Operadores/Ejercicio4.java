package Operadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Carta amigos

        Scanner lector = new Scanner(System.in);

        final double PRECIO_BOCATA = 2.05;
        final double PRECIO_BEBIDA = 1.35;

        System.out.println("Cuantas bebidas quieres");
        int nBebidas = lector.nextInt();

        System.out.println("Cuantos bocadillos quieres");
        int nBocatas = lector.nextInt();

        double costeBebidas = nBebidas * PRECIO_BEBIDA;
        double costeBocatas = nBocatas * PRECIO_BOCATA;
        double consumicionTotal = costeBebidas + costeBocatas;

        System.out.println("Coste bebidas: "+costeBebidas);
        System.out.println("Coste bocatas: "+costeBocatas);
        System.out.println("Coste de consumición: "+consumicionTotal);




    }
}