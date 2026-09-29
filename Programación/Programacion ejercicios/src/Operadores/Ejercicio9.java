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

        System.out.println("El precio de las bebidas en total fue de: "+precioBebidasTotal);
        System.out.println("El precio de los bocadillos en total fue de: "+precioBocadillosTotal);
        System.out.println("El coste total fue de: "+costeTotal);
        System.out.println("Cada alumno tuvo que pagar: "+pagoAlumno);



    }
}
