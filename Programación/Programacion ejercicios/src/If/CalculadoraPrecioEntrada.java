package If;

import java.util.Scanner;

public class CalculadoraPrecioEntrada {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica tu edad: ");
        int edad = lector.nextInt();

        System.out.println("Escribe un día de la semana (1-7): ");
        int dia = lector.nextInt();

        System.out.println("Edad: "+edad);

        if (edad < 0 || dia < 1 || dia > 7) {
            System.out.println("Datos no válidos.");
        }
        if (dia==1){
            System.out.println("Dia de la semana: Lunes");
        }else if (dia==2){
            System.out.println("Dia de la semana: Martes");
        }else if (dia==3){
            System.out.println("Dia de la semana: Miércoles");
        }else if (dia==4) {
            System.out.println("Dia de la semana: Jueves");
        }else if (dia==5){
            System.out.println("Dia de la semana: Viernes");
        }else if (dia==6){
            System.out.println("Dia de la semana: Sábado");
        }else if (dia==7){
            System.out.println("Dia de la semana: Domingo");
        }

        boolean menorDe12 = edad<12;
        boolean joven = edad>12 && edad<17;
        boolean esMartes = dia==2;
        boolean esJueves = dia==4;

        System.out.println("¿Eres menor de 12?: " + menorDe12);
        System.out.println("¿Tienes entre 12 y 17?: " + joven);
        System.out.println("¿Es martes?: " + esMartes);
        System.out.println("¿Es jueves?: " + esJueves);





        if (edad < 12 || (edad <= 17 && dia == 2)) {
            System.out.println("Precio final: Gratis");
        } else if (edad <= 17) {
            System.out.println("Precio final: 5€");
        } else if (edad <= 64 && dia == 4) {
            System.out.println("Precio final: 7€");
        } else if (edad <= 64) {
            System.out.println("Precio final: 10€");
        } else {
            System.out.println("Precio final: 6€");
        }
    }
}
