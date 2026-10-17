package EstructurasDeControl;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Número entero: ");

        int entero = lector.nextInt();

        if(entero%2==0){
            System.out.println("El número es par");
        }else{
            System.out.println("El numero es impar");
        }

    }
}
