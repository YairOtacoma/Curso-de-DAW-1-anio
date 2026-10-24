package If;

import java.util.Scanner;

public class EnvioPaquete {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce el peso del paquete (kg): ");
        double peso = lector.nextDouble();

        System.out.print("Introduce la distancia de envío (km): ");
        double distancia = lector.nextDouble();

        System.out.print("¿Es envío urgente? (true/false): ");
        boolean esUrgente = lector.nextBoolean();

        // 1. Validar que peso y distancia no sean negativos
        if (peso <= 0 || distancia <= 0) {
            System.out.println("Error: El peso y la distancia deben ser mayores que 0.");
        } else {
            double precioTotal = 5.0; // Precio base inicial (5€)

            System.out.println("\n--- Desglose del Cálculo ---");
            System.out.println("Precio base: 5.0€");

            // Paso 1: Recargo por peso
            if (peso > 5) {
                double kgAdicionales = peso - 5;
                double recargoPeso = kgAdicionales * 2.0;
                precioTotal += recargoPeso;
                System.out.println("Recargo por peso (" + kgAdicionales + " kg extra): +" + recargoPeso + "€");
            } else {
                System.out.println("Recargo por peso: 0.0€ (peso <= 5kg)");
            }

            // Paso 2: Recargo por distancia
            if (distancia > 100) {
                precioTotal += 10.0;
                System.out.println("Recargo por distancia (>100km): +10.0€");
            } else {
                System.out.println("Recargo por distancia: 0.0€ (distancia <= 100km)");
            }

            // Paso 3: Multiplicador por urgencia
            if (esUrgente) {
                precioTotal *= 1.5;
                System.out.println("Incremento por envío urgente: x1.5");
            }

            System.out.println("----------------------------");
            System.out.println("Precio total final: " + precioTotal + "€");
        }

        lector.close();
    }
}