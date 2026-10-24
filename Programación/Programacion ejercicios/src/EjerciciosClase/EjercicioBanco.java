package EjerciciosClase;

import java.util.Scanner;

public class EjercicioBanco {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double saldo = 1000.0; // Saldo inicial
        int opcion;

        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo actual es: %.2f€\n", saldo);

                case 2 -> {
                    System.out.print("Introduce la cantidad a retirar: ");
                    double retiro = lector.nextDouble();

                    // Bucle while para validar que la cantidad sea válida y no supere el saldo
                    while (retiro <= 0 || retiro > saldo) {
                        if (retiro <= 0) {
                            System.out.println("Error: La cantidad debe ser mayor a 0€.");
                        } else {
                            System.out.printf("Error: Saldo insuficiente (Saldo disponible: %.2f€).\n", saldo);
                        }
                        System.out.print("Introduce una cantidad válida a retirar: ");
                        retiro = lector.nextDouble();
                    }

                    saldo -= retiro; // Restamos la cantidad al saldo
                    System.out.printf("Has retirado %.2f€. Saldo restante: %.2f€\n", retiro, saldo);
                }

                case 3 -> {
                    System.out.print("Introduce la cantidad a depositar: ");
                    double deposito = lector.nextDouble();

                    // Validación de depósito positivo
                    if (deposito <= 0) {
                        System.out.println("Error: No puedes depositar cantidades menores o iguales a 0€.");
                    } else {
                        saldo += deposito; // Sumamos la cantidad al saldo
                        System.out.printf("Has depositado %.2f€. Nuevo saldo: %.2f€\n", deposito, saldo);
                    }
                }

                case 4 -> System.out.println("Gracias por utilizar nuestro cajero. ¡Hasta pronto!");

                default -> System.out.println("Opción no válida. Por favor, elige un número del 1 al 4.");
            }

        } while (opcion != 4); // Se repite mientras no elija salir

        lector.close();
    }
}