package EstructurasDeControl;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");

        int edad = lector.nextInt();

        if(edad < 0){
            System.out.println("Edad no válida");
        }else if (edad>=18){
            System.out.println("Eres mayor de edad, puedes votar");
        }else {
            System.out.println("Eres menor de edad, no puedes votar");
        }

    }


}
