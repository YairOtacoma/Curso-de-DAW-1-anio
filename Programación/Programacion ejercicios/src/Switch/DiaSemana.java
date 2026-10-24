package Switch;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número de 1-7:");
        int numero = lector.nextInt();
        String dia;

        switch (numero){
            case 1 -> dia="Lunes";
            case 2 -> dia="Martes";
            case 3 -> dia="Miércoles";
            case 4 -> dia="Jueves";
            case 5 -> dia="Viernes";
            case 6 -> dia="Sábado";
            case 7 -> dia="Domingo";
            default -> dia="Número inválido";
        }
        System.out.println("El día "+numero+" es: "+dia);
    }
}
