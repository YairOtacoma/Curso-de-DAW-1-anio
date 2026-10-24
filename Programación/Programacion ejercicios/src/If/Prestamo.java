package If;

import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Edad del usuario: ");
        int edad = lector.nextInt();

        System.out.println("Ingresos mensuales: ");
        int ingresos = lector.nextInt();

        System.out.println("¿Tienes deudas pendientes?: ");
        boolean deuda = lector.nextBoolean();

        if (edad < 0 || ingresos < 0){
            System.out.println("Datos no válidos");
        }else{
            boolean entre21y65 = edad>=21 && edad<=65;
            boolean ingresosMin = ingresos >= 1000;
            boolean sinDeudas = !deuda;
            boolean elegible = entre21y65 && ingresosMin && sinDeudas;

            System.out.println("¿Edad entre 21 y 65?: "+entre21y65);
            System.out.println("¿Ingresos de al menos 1000 euros?: "+ingresosMin);
            System.out.println("¿Sin deudas pendientes?: "+sinDeudas);
            System.out.println("¿Es elegible para el préstamo?: "+elegible);

            if (elegible) {
                System.out.println("Felicidades, eres elegible para solicitar el préstamo.");
            } else {
                // 2. Abrimos llave para incluir la frase Y las explicaciones de los errores
                System.out.println("Lo sentimos, no cumples los requisitos:");

                if (!entre21y65) {
                    System.out.println("- La edad debe estar entre 21 y 65 años (tienes " + edad + ").");
                }
                if (!ingresosMin) {
                    System.out.println("- Los ingresos deben ser de al menos 1000€ (tienes " + ingresos + "€).");
                }
                if (!sinDeudas) {
                    System.out.println("- Tienes deudas pendientes registradas.");
                }
            }
        }
    }

}