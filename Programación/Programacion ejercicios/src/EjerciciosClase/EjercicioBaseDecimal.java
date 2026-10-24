package EjerciciosClase;

import java.util.Scanner;

public class EjercicioBaseDecimal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce la base (2, 8 o 16): ");
        int base = lector.nextInt();

        // Validamos la base introducida
        if (base != 2 && base != 8 && base != 16) {
            System.out.println("Error: La base debe ser 2, 8 o 16.");
        } else {
            System.out.print("Introduce el número en base " + base + ": ");
            String numero = lector.next().toUpperCase(); // Convertimos a mayúsculas para hexadecimal (A-F)

            int decimal = 0;
            int potencia = 1; // Representa base^0 al principio (1)
            boolean numeroValido = true;

            // Recorremos la cadena de DERECHA a IZQUIERDA
            for (int i = numero.length() - 1; i >= 0; i--) {
                char caracter = numero.charAt(i);
                int valorDigito = -1;

                // 1. Convertimos el carácter actual a su valor numérico
                switch (caracter) {
                    case '0' -> valorDigito = 0;
                    case '1' -> valorDigito = 1;
                    case '2' -> valorDigito = 2;
                    case '3' -> valorDigito = 3;
                    case '4' -> valorDigito = 4;
                    case '5' -> valorDigito = 5;
                    case '6' -> valorDigito = 6;
                    case '7' -> valorDigito = 7;
                    case '8' -> valorDigito = 8;
                    case '9' -> valorDigito = 9;
                    case 'A' -> valorDigito = 10;
                    case 'B' -> valorDigito = 11;
                    case 'C' -> valorDigito = 12;
                    case 'D' -> valorDigito = 13;
                    case 'E' -> valorDigito = 14;
                    case 'F' -> valorDigito = 15;
                    default -> valorDigito = -1; // Carácter no reconocido
                }

                // 2. Comprobamos si el dígito es válido para la base seleccionada
                if (valorDigito < 0 || valorDigito >= base) {
                    numeroValido = false;
                    break; // Salimos del bucle si detectamos un dígito erróneo
                }

                // 3. Sumamos al total el valor del dígito multiplicado por la potencia actual
                decimal += valorDigito * potencia;

                // 4. Multiplicamos la potencia por la base para la siguiente posición (1, base, base^2, base^3...)
                potencia *= base;
            }

            // Muestra del resultado final
            if (numeroValido) {
                System.out.println("El número " + numero + " en base " + base + " equivale a " + decimal + " en decimal.");
            } else {
                System.out.println("Error: El número introducido contiene dígitos no válidos para la base " + base + ".");
            }
        }

        lector.close();
    }
}