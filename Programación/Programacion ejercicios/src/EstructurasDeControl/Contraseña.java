package EstructurasDeControl;

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String contrasena = lector.next();
        System.out.println("Longitud de la contraseña: ");
        boolean longitud = contrasena.length()>=8;
        boolean tieneNumero = contieneNumero(contrasena);
        boolean noEsProhibida = !contrasena.equals("12345678") && !contrasena.equals("password");

    }
}
