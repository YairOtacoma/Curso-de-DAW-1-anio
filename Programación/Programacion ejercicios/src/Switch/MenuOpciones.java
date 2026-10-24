package Switch;

import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("---MENÚ---");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");

        System.out.println("Elige una opción: ");
        int opcion = lector.nextInt();

        String opciones;
        switch (opcion){
            case 1-> opciones = "Ver perfil";
            case 2-> opciones = "Configuración";
            case 3-> opciones = "Ayuda";
            case 4-> opciones = "Salir";
            default -> opciones = "Error";
        }
        System.out.println("Has seleccionado: "+opciones);
    }
}
