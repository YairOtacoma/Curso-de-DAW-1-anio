package Operadores;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Operaciones variables

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce primer variable");
        int entero1 = lector.nextInt();
        System.out.println("Introduce segundo operando");
        int entero2 = lector.nextInt();

        int suma = entero1 + entero2;
        int resta = entero1 - entero2;
        int multiplicacion = entero1 * entero2;
        int division = entero1 / entero2;
        int resto = entero1 % entero2;
        lector.close();
        System.out.printf("Suma de %d y %d es %d\n",entero1,entero2,suma);
        System.out.printf("Resta de %d y %d es %d\n",entero1,entero2,resta);
        System.out.printf("Multiplicación de %d y %d es %d\n",entero1,entero2,multiplicacion);
        System.out.printf("División es %d y %d es %d\n",entero1,entero2,division);
        System.out.printf("El resto de la división es %d y %d es %d\n",entero1,entero2,resto);

        double divisionReal = (double)entero1 / entero2;
        double restoReal = (double)entero1 % entero2;

        System.out.printf("La división real es %d y %d es %.2f\n",entero1,entero2,divisionReal);
        System.out.printf("El resto real es %d y %d es %.2f",entero1,entero2,restoReal);

        //BANDERAS: para un numero entero (int)->%d, para un numero con decimal (double)->%f

    }
}
