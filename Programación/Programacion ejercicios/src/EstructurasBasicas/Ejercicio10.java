package EstructurasBasicas;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        //Conversión en temperatura

        Scanner lector = new Scanner(System.in);

        System.out.println("Temperatura en celsius:");
        int celsius = lector.nextInt();

        double cAf= (celsius*9/5) +32; //CUIDADO con poner paréntesis de más

        System.out.println("Temperatura en Farenheit: "+cAf);

    }





}
