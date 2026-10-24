package If;

import java.util.Scanner;

public class ContenidoPorEdad {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Edad del usuario: ");
        int edad = lector.nextInt();

        if (edad<0){
            System.out.println("Edad no válida");
        }else if (16>edad){
            System.out.println("Acceso denegado. Debes tener al menos 16 años");
        }else{
            System.out.println("Acceso permitido");
        }
    }
}
