package EjerciciosClase;

import java.util.Scanner;

public class EjercicioBaseNumerica {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un número entero en base decimal (>= 0): ");
        int decimal = lector.nextInt();

        if (decimal < 0) {
            System.out.println("Error: El número debe ser mayor o igual a 0.");
        } else if (decimal == 0) {
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Base 2  (Binario):     0");
            System.out.println("Base 8  (Octal):       0");
            System.out.println("Base 16 (Hexadecimal): 0");
        } else {
            // 1. Conversión a Base 2 (Binario)
            String binario = "";
            int auxBinario = decimal;
            while (auxBinario > 0) {
                int resto = auxBinario % 2;
                binario = resto + binario; // Concatenamos al inicio para mantener el orden correcto
                auxBinario /= 2;
            }

            // 2. Conversión a Base 8 (Octal)
            String octal = "";
            int auxOctal = decimal;
            while (auxOctal > 0) {
                int resto = auxOctal % 8;
                octal = resto + octal;
                auxOctal /= 8;
            }

            // 3. Conversión a Base 16 (Hexadecimal)
            String hexadecimal = "";
            int auxHexa = decimal;
            while (auxHexa > 0) {
                int resto = auxHexa % 16;
                String digitoHexa = "";

                // Convertimos los restos mayores a 9 en sus letras correspondientes
                switch (resto) {
                    case 10 -> digitoHexa = "A";
                    case 11 -> digitoHexa = "B";
                    case 12 -> digitoHexa = "C";
                    case 13 -> digitoHexa = "D";
                    case 14 -> digitoHexa = "E";
                    case 15 -> digitoHexa = "F";
                    default -> digitoHexa = String.valueOf(resto);
                }

                hexadecimal = digitoHexa + hexadecimal;
                auxHexa /= 16;
            }

            // Impresión de resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Número decimal: " + decimal);
            System.out.println("Base 2  (Binario):     " + binario);
            System.out.println("Base 8  (Octal):       " + octal);
            System.out.println("Base 16 (Hexadecimal): " + hexadecimal);
        }

        lector.close();
    }
}