package For;

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int N = lector.nextInt();
        int suma = 0;

        for (int i=1;i<=N; i++){
            suma = suma + i;

        }
        System.out.printf("La suma de los número 1 al %d es: %d\n",N,suma);
    }
}
