package Estructuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstructurasException {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Programa de excepciones");
        String nombre = "borja";
        int resultado = 0;
        int op1=0,op2=0;
        try{
            System.out.println(nombre.toUpperCase());
            System.out.println("La variable ha salido sin problema");
            System.out.println("Indica un numero 1");
            op1 = lector.nextInt();
            System.out.println("Indica un numero 2");
            op2 = lector.nextInt();
            resultado = op1/op2;
            System.out.println("El resultado de la división es "+resultado);
            //hay posibles fallos
        }catch(NullPointerException exception){ // como poner int dinero = NullPointerException exception.
            System.out.println("El acceso a la variable es nulo, no se puede");
        }catch(ArithmeticException exception){
            System.out.println("Error de op2 con valor 0");
            System.out.println("Indica un valor para op2 diferente");
            op2 = lector.nextInt();
            resultado = op1/op2;
        }catch (Exception e) {
            System.out.println("Fallo general");
        }finally { //Strings o flujo de datos se utliza mucho, es muy útil para cerrar recursos.
            System.out.println("Ejecuto esta parte final tanto si falla como si no");
            System.out.println("El resultado de la operación es "+resultado);
        }




        boolean fallo = false;

        /*do {
            lector = new Scanner(System.in);
            try {
                System.out.println("Indica un numero 1");
                op1 = lector.nextInt();
                fallo = false;
                do {
                    try {

                        System.out.println("Indica un numero 2");
                        op2 = lector.nextInt();
                        resultado = op1 / op2;
                        System.out.println("El resultado de la división es " + resultado);
                    } catch (ArithmeticException exception) {
                        System.out.println("Op2 invalido");
                        fallo = true;
                    }
                } while (fallo);
            } catch (InputMismatchException exception) {
                fallo = true;
            }
        }while (fallo);
        System.out.println("Terminando al programa");

        /*final String nombre = "Borja";
        System.out.println(nombre);
        String apellido = null;
        //System.out.println(apellido.toUpperCase());
        int op1 = 10, op2 = 0;
        System.out.println("Indica tu dni");
        int dni = lector.nextInt();
        //int resultado = op1/op2;
        //System.out.println("el resultado de la operación es "+resultado);

         */

    }
}
