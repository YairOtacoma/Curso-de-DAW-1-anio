package EstructurasDeControl;

import java.util.Scanner;

public class NumeroPosNeg {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        int numero = lector.nextInt();

        if (numero<0){
            System.out.println("El número es negativo");
        }else if (numero>0) {
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es 0");
        }

    }
}
