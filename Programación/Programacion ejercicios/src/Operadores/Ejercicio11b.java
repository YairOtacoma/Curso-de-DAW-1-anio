package Operadores;

import java.util.Scanner;

public class Ejercicio11b {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Dinero del que dispongo:");
        double dinero = lector.nextDouble();

        System.out.println("El IVA que se aplica");
        int ivaPorcentaje = lector.nextInt();

        System.out.println("Artículo sin IVA 1:");
        double articulo1 = lector.nextDouble();

        System.out.println("Artículo sin IVA 2:");
        double articulo2 = lector.nextDouble();

        double iva = 1 + ivaPorcentaje/100.00;

        double precioArticulo1 = articulo1*iva;
        double precioArticulo2 = articulo2*iva;
        double sumaArticulos = precioArticulo1+precioArticulo2;

        boolean comprarArticulo1 = precioArticulo1<=dinero;
        boolean comprarArticulo2 = precioArticulo2<=dinero;
        boolean comprarLosDos = precioArticulo1+precioArticulo2<=dinero;

        System.out.println("¿Puedo comprar el primer artículo? "+comprarArticulo1);
        System.out.println("¿Puedo comprar el segundo artículo? "+comprarArticulo2);
        System.out.println("¿Puedo comprar los dos artículos? "+comprarLosDos);


    }
}
