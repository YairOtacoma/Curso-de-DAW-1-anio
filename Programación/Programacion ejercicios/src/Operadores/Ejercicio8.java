package Operadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        /*Conversión temperaturas: Hágase una aplicación que permita realizar conversiones de temperaturas entre grados
        centígrados, farenheit y kelvin
         */

        Scanner lector = new Scanner(System.in);

        System.out.println("Grados centígrados: ");
        double c = lector.nextDouble();

        System.out.println("Grados farenheit: ");
        double f = lector.nextDouble();

        System.out.println("Grados kelvin: ");
        double k = lector.nextDouble();

        double fAc = (5*(f-32))/9;
        double kAc = (k-273.15);
        double kAf = ((9*(k-273.15))/5)+32;
        double cAf = ((9*c)/5)+32;
        double cAk = c+273.15;
        double fAk = ((5*(f-32))/9)+273.15;

        System.out.println("Si tengo "+c+" grados centígrados, en farenheint tendré "+(float)cAf);
        System.out.println("Si tengo "+c+" grados centígrados, en kelvin tendré "+(float)cAk);
        System.out.println("Si tengo "+f+" grados farenheint, en centígrados tendré "+(float)fAc);
        System.out.println("Si tengo "+f+" grados farenheint, en kelvin tendré "+(float)fAk);
        System.out.println("Si tengo "+k+" grados kelvin, en centigrados tendré "+(float)kAc);
        System.out.println("Si tengo "+k+" grados kelvin, en farenheint tendré "+(float)kAf);






    }
}
