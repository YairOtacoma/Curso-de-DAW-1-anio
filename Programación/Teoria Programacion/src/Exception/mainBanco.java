package Exception;

import Exception.model.Banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainBanco {
    public static void main(String[] args){
        Banco BBVA = new Banco();
        //BBVA.cancelarCuenta("Juan",9090);
        /*try {
            BBVA.cancelarCuenta("Juan", 2210);
        }catch (NullPointerException e){
            System.out.println("La cancelación de la cuenta no se ha podido dar.");
            System.out.println("Dime otro pin");
        }

         */

        try(Scanner lector = new Scanner(System.in)){
            String nombreTitular = lector.next();
            int saldo = lector.nextInt();
            System.out.println("El titular de la cuenta es "+nombreTitular);
            System.out.println("El saldo es: "+saldo);
            //cierra el recurso utilizando en la definición del bloque
            //lector.close(); -> es redundante
        }catch (InputMismatchException e){
            System.out.println("Tipo de dato introducido de forma incorrecta");
        }catch (Exception e) {
            System.out.println("Error en la cancelación de la cuenta");
        }
    }
}
