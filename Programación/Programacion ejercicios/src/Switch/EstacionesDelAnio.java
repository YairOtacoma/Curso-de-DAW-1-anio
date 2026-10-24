package Switch;

import java.util.Scanner;

public class EstacionesDelAnio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el número del mes (1-12): ");
        int mes = lector.nextInt();

        String estacion;

        switch (mes){
            case 12,1,2 -> estacion = "Invierno";
            case 3,4,5 -> estacion = "Primavera";
            case 6,7,8 -> estacion = "Verano";
            case 9,10,11 -> estacion = "Otoño";
            default -> estacion = "Valor no válido";
        }
        System.out.println("El mes "+mes+" corresponde a: "+estacion);
    }
}
