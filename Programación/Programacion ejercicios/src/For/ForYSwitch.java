package For;

import java.util.Scanner;

public class ForYSwitch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("---EJERCICIOS---");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");

        System.out.println("Elige un ejercicio (1-3): ");
        int opcion = lector.nextInt();

        String opciones = "";
        if(opcion<=0 || opcion>3){
            System.out.println("Datos no válidos");
        }else{
            switch (opcion){
                case 1-> opciones = "Flexiones";
                case 2-> opciones = "Abdominales";
                case 3-> opciones = "Sentadillas";
            }
            System.out.println("Has seleccionado: "+opciones);

            System.out.println("¿Cuantas repeticiones quieres hacer?");
            int repeticiones = lector.nextInt();
            for(int i=1; i <= repeticiones;i++){
                System.out.printf("Repetición %d completada\n",i);
            }


            System.out.printf("Felicidades has hecho %d %s\n",repeticiones,opciones);
        }

    }
}
