package If;

import java.util.Scanner;

public class CalificacionLetra {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Nota final del curso: ");
        int nota = lector.nextInt();

        if (nota<0 || nota>10){
            System.out.println("Nota no válida");
        }else if (nota<5){
            System.out.println("Examen suspenso");
        }else if (nota<7){
            System.out.println("Examen aprobado");
        }else if (nota<=8){
            System.out.println("Examen notable");
        }else{
            System.out.println("Examen sobresaliente");
        }
    }
}
