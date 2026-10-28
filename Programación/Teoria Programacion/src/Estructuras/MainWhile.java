package Estructuras;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /*
        while(condicion){
             ejecutar
        }
         */
        int i = 10;
        while (i>0){
            System.out.println("Ejecución");
            System.out.println("Bloque del while");
            i--;
        }
        boolean bloqueado = true;
        int intentos = 3;
        while(intentos>0){
            System.out.println("Indica el pin del movil");
            int pin = lector.nextInt();

            if (pin!=0000){
                System.out.println("Pin incorrecto, intentalo de nuevo");
            }else{
                System.out.println("Pin correcto");
            }

            int numeroUsuario;
            do{
                intentos--;
                System.out.println("Indica el pin");
                numeroUsuario = lector.nextInt();
                if(numeroUsuario == 1111){
                    System.out.println("Movil desbloqueado");
                    bloqueado = false;
                    break;
                }
                else{
                    System.out.println("Numero incorrecto");
                }
                while (intentos>0){
                    if(bloqueado){
                        System.out.println("Movil Bbloquead");
                    }
                }
            }while (intentos>0);

            if(bloqueado){
                System.out.println("Movil bloqueado");
            } else {
                System.out.println("Movil desbloqueado");
            }
        }
    }
}
