package EstructurasDeControl;

import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int n1 = lector.nextInt();

        System.out.println("Introduzca el segundo número:");
        int n2 = lector.nextInt();

        if (n1>n2){
            System.out.printf("El número %d es mayor que el número %d\n",n1,n2);
        }else if (n1<n2){
            System.out.printf("El número %d es menor que el número %d\n",n1,n2);
        }else {
            System.out.printf("El número %d es igual que el número %d\n",n1,n2);
        }
    }
}
