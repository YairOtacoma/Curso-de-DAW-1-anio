package Estructuras;

import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        // 5 repeticiones
        /*
         for (inicio(valor de una variable); final; incremento)
         [0
         for (int i=0; i<5; i++){
            puedes utilizar la variable i
        }
         */
        //[0 1 2 3 4]->el corchete hace que el 0 este incluido
        //[0 10]orden creciente
        for(int i = 0; i<5; i ++ ){
            // solo quiero sacar los mensajes cuando la i es par
            if (i%2==0){
                System.out.println("Inicio del for");
                System.out.printf("Ejecución  %d del bucle for\n",i);
                System.out.println("Final del for");
            }else {
                System.out.println("Estado impar");
            }


        }

        //10.....0
        for (int i=9;i>=0;i--){
            System.out.println("Inicio del for");
            System.out.printf("Ejecución  %d del bucle for\n",i);
            System.out.println("Final del for");
        }

        Scanner lector = new Scanner(System.in);
        System.out.println("De que numero quieres calcular la tabla de multiplicar");
        int numero = lector.nextInt(); // 8
        // sacar todas las tablas de multiplicar de todos los numeros de entre 0-10
        for (int i=0; i<=10; i++) {
            System.out.println("Tabla del "+i);
            for (int j=0; j<=10;j++){
                System.out.printf("La multiplicación del %d * %d = %d\n ",i,j,j*i);
            }
        }

        // facto4
        /*
        4! ->   4*3*2*1= 24
        5! -> 5*4*3*2*1= ...
         */
        System.out.println("Fin del programa");

    }
}
