package For;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = lector.nextInt();
        System.out.println("Tabla del "+numero);
        for(int i=1;i<=10;i++){
            System.out.printf("La multiplicación de %d * %d = %d\n",numero,i,numero*i);
        }


    }
}
