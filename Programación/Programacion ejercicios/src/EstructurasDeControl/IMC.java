package EstructurasDeControl;

import javax.swing.*;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Peso en Kg: ");
        double peso = lector.nextDouble();

        System.out.println("Altura en m: ");
        double altura = lector.nextDouble();


        if (altura <= 0 || peso <= 0) {
            System.out.println("Datos incorrectos, imposible calcular IMC.");
        } else {
            double imc = peso / (altura * altura);
            System.out.println("Tu IMC es: " + imc);
            if (imc > 18.5 && imc < 24.9) {
                System.out.println("Estas en el peso normal");
            } else if (imc > 24.9) {
                System.out.println("Estas por encima del peso normal");
            } else {
                System.out.println("Estas por debajo del peso normal");
            }

        }
    }
}