package EjerciciosClase;

import java.util.Random;
import java.util.Scanner;

public class EjercicioAdivinacion{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        // Guardamos el récord fuera de los bucles.
        // Lo inicializamos con un valor muy alto para que la primera partida siempre sea récord.
        int mejorRecord = Integer.MAX_VALUE;
        char respuesta;

        do {
            int numeroSecreto = random.nextInt(21); // 0 a 20
            int numeroUsuario;
            int intentos = 0;

            System.out.println("\n--- ¡NUEVA PARTIDA! ---");
            System.out.println("He pensado un número entre 0 y 20.");

            // Bucle interno: Adivinar el número de la partida actual
            do {
                System.out.print("Introduce un número: ");
                numeroUsuario = lector.nextInt();
                intentos++;

                if (numeroUsuario != numeroSecreto) {
                    System.out.println("Lo siento, inténtalo de nuevo.");
                }
            } while (numeroUsuario != numeroSecreto);

            // Mensaje al acertar
            System.out.printf("¡Enhorabuena! Has acertado el número en %d intentos.\n", intentos);

            // Comprobamos si ha batido el récord previo
            if (intentos < mejorRecord) {
                if (mejorRecord != Integer.MAX_VALUE) {
                    System.out.printf("¡NUEVO RÉCORD! Has superado tu marca anterior de %d intentos.\n", mejorRecord);
                } else {
                    System.out.println("¡Es tu primer récord registrado!");
                }
                mejorRecord = intentos; // Actualizamos el mejor récord
            } else {
                System.out.printf("Tu récord actual sigue siendo de %d intentos.\n", mejorRecord);
            }

            // Preguntamos si quiere seguir jugando
            System.out.print("\n¿Quieres volver a jugar? (S/N): ");
            respuesta = lector.next().toUpperCase().charAt(0);

        } while (respuesta == 'S');

        System.out.println("Gracias por jugar. ¡Hasta pronto!");
        lector.close();
    }
}