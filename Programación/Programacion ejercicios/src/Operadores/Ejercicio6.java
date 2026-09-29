package Operadores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Calculo precio - iva

        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor de la compra");
        double valorDeLaCompra = entrada.nextDouble();

        System.out.println("IVA");
        int ivaPorcentaje = entrada.nextInt();

        double iva = 1 + ivaPorcentaje/100.00;
        double compraSinIva = valorDeLaCompra/iva;
        double valorIva = valorDeLaCompra-compraSinIva;

        System.out.println("La compra cn IVA costó: "+valorDeLaCompra);
        System.out.println("La compra sin IVA costó: "+compraSinIva);
        System.out.println("EL valor del IVA es: "+valorIva);

    }
}
