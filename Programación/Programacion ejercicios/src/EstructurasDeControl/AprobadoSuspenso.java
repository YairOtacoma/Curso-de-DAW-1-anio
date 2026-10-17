package EstructurasDeControl;

import java.util.Scanner;

public class AprobadoSuspenso {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Nota del examen: ");

        int nota = lector.nextInt();
        if(nota<0 || 10< nota){
            System.out.println("Nota no válida");
        }else if (nota < 5){
            System.out.println("El examen está suspenso");
        }else{ // no hace falta poner (nota >=5) porque es un dato redundante, con poner else basta
            System.out.println("El examen esta aprobado");
        }
    }
}
