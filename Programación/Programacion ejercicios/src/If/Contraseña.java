package If;

import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String password = lector.next();
        System.out.println("Procedemos a validar la password");
        boolean longitudValid = password.length()>=8;
        //boolean tieneNumero = contieneNumero(contrasena);
        boolean contenidoValida = !password.equals("12345678") && !password.equals("password");
        boolean numeroValida = true;
        int contador = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                contador++; //cuantos numeros tengo
            }
        }
        boolean numeroValid = contador>=1;
        boolean valida = numeroValid && contenidoValida && longitudValid;
        if(valida){
            System.out.println("La password cumple todos los requisitos");
        }else{
            System.out.println("Es incorrecta");
        }

    }
}
