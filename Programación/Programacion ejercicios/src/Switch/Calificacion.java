package Switch;

import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Inserte calificación de examen: ");
        //Leemos el primer carácter y lo convertimos en mayúscula
        char letra = lector.next().toUpperCase().charAt(0); // A B C D F

        String calificacion;
        switch (letra){
            case 'A'-> calificacion="Excelente";
            case 'B'-> calificacion="Muy bien";
            case 'C'-> calificacion="Bien";
            case 'D'-> calificacion="Suficiente";
            case 'F'-> calificacion="Insuficiente";
            default -> calificacion="Calificación no válida";
        }
        System.out.println("Calificación "+letra+" : "+calificacion);
    }
}
