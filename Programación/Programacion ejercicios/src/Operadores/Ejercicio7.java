package Operadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Circunferencia valores

        Scanner lector = new Scanner(System.in);
        System.out.println("El radio de la circunferencia es:");
        double radio = lector.nextInt();
        double pi = Math.PI; //PI es una constante y van en mayúsculas
        lector.close();

        //Longitud de circunferencia

        double longitud = 2*pi*radio;

        //Área del círculo

        double area = pi*Math.pow(radio,2); //Math.pow para poder elevar los numeros


        System.out.println("El radio de la circunferencia es "+radio);
        System.out.println("La longitud del círculo es: "+longitud);
        System.out.println("El área del círculo es: "+area);

    }

}