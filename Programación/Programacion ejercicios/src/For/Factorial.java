package For;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo para calcular el factorial: ");
        int N = lector.nextInt();
        int factorial = 1;
        System.out.println("Calculando el factorial de "+N);
        for (int i = N; i >= 1;i--){
            if(i==1){
                System.out.println(i);
            }else{
                System.out.print( i+ " X ");
            }
             // i 5 4 3 2 1
            // 120
            factorial = factorial*i;
        }
        System.out.println();
        System.out.printf("El factorial de %d! es %d",N,factorial);

    }
}
