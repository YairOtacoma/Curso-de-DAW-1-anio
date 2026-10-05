package Operadores;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Ejercicio carta para introducir scanner

        Scanner lector = new Scanner(System.in);

        System.out.println("Número de bebidas:");
        int nBebidas = lector.nextInt();

        System.out.println("Número de bocadillos:");
        int nBocadillos = lector.nextInt();

        System.out.println("Precio de cada bebida:");
        double pBebida = lector.nextDouble();

        System.out.println("Precio de cada bocadillo");
        double pBocadillo = lector.nextDouble();

        System.out.println("Número de alumnos que realizaron la compra:");
        int nAlumnos = lector.nextInt();

        double precioBebidasTotal = nBebidas*pBebida;
        double precioBocadillosTotal = nBocadillos*pBocadillo;
        double costeTotal = precioBebidasTotal+precioBocadillosTotal;
        double pagoAlumno = costeTotal/nAlumnos;

        System.out.println("ARTICULO\t\tCANTIDAD\t\t\tCOSTE\t\t\t\tTOTAL");
        System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t%.2f\n", "Bebidas", nBebidas, pBebida, precioBebidasTotal);
        System.out.printf("%s\t\t\t\t%d\t\t\t\t%.2f\t\t\t\t%.2f\n", "Bocatas", nBocadillos, pBocadillo, precioBocadillosTotal);
        System.out.printf("%s\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", "Coste total", costeTotal);



    }
}
