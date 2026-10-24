package For;

import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int N = lector.nextInt();
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i=1;i<=N;i++){
            if(i%2 == 0){
                contadorPares++;
            }else{
                contadorImpares++;
            }
        }

        System.out.printf("Cantidad de números pares entre 1 y %d: %d\n", N, contadorPares);
        System.out.printf("Cantidad de números impares entre 1 y %d: %d\n", N, contadorImpares);
    }
}
