package EjerciciosClase;

import java.util.Scanner;

public class EjercicioSueldo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double sumaTotal = 0;
        int mayores1000 = 0;
        int totalSueldos = 10;

        System.out.println("--- REGISTRO DE SUELDOS ---");

        for (int i = 1; i <= totalSueldos; i++) {
            System.out.print("Introduce el sueldo " + i + " (€): ");
            double sueldo = lector.nextDouble();

            // Validar que el sueldo no sea negativo
            if (sueldo < 0) {
                System.out.println("El sueldo no puede ser negativo. Inténtalo de nuevo.");
                i--; // Decrementamos i para volver a pedir este sueldo
            } else {
                sumaTotal += sueldo; // Acumulamos la suma

                if (sueldo > 1000) {
                    mayores1000++; // Contamos si supera los 1000€
                }
            }
        }

        double media = sumaTotal / totalSueldos;

        System.out.println("\n--- RESUMEN ---");
        System.out.printf("Suma total de los sueldos: %.2f€\n", sumaTotal);
        System.out.printf("Sueldo medio: %.2f€\n", media);
        System.out.println("Cantidad de sueldos mayores de 1000€: " + mayores1000);

        lector.close();
    }
}