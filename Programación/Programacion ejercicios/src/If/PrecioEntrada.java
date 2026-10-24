package If;

import java.util.Scanner;

public class PrecioEntrada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = lector.nextInt();

        System.out.println("Introduzca día de la semana: ");
        int dia = lector.nextInt();

        if (edad<0|| dia < 1 || dia > 7){
            System.out.println("Edad o dia no válidos");
        }else if(dia==1){
            System.out.println("Día de la semana: Lunes");
        }else if (dia == 2){
            System.out.println("Día de la semana: Martes");
        }else if (dia == 3){
            System.out.println("Día de la semana: Miércoles");
        }else if (dia == 4){
            System.out.println("Día de la semana: Jueves");
        }else if (dia == 5){
            System.out.println("Día de la semana: Viernes");
        }else if (dia == 6){
            System.out.println("Día de la semana: Sábado");
        }else{
            System.out.println("Día de la semana: Domingo");
        }

        boolean menor12 = edad<12;
        boolean entre12y17 = edad>=12 && edad<17;
        boolean esMartes = dia == 2;

        System.out.println("¿Eres menor de 12? "+menor12);
        System.out.println("¿Tienes entre 12 y 17 años? "+entre12y17);
        System.out.println("¿Es martes? "+esMartes);

        if (edad<12 || ( edad<17 && dia == 2)){
            System.out.println("Entrada gratuita");
        }else if (edad <= 17){
            System.out.println("Coste de la entrada: 5 euros");
        }else if (edad<=64 && dia == 4){
            System.out.println("Coste de la entrada: 7 euros");
        }else if (edad<=64){
            System.out.println("Coste de la entrada: 10 euros");
        }else {
            System.out.println("Coste de la entrada: 6 euros");
        }

        lector.close();
    }
}
