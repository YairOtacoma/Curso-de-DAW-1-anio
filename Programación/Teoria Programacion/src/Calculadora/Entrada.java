package Calculadora;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //View-> lo  que interacciona con el usuario
        Calculadora calculadora = new Calculadora();
        //op1=0 , op2=0 , resultado=0
        Scanner lector = new Scanner(System.in);
        System.out.println("Operando 1");
        int operando1 = lector.nextInt();
        System.out.println("Operando 2");
        int operando2 = lector.nextInt();
        calculadora.sumar(operando1,operando2);

        System.out.println("El resultado de la suma es: "+calculadora.getResultado());
        calculadora.sumar(20,10);
        System.out.println("El resultado de la suma es: "+calculadora.getResultado());

        calculadora.restar(operando1,operando2);
        System.out.println("El resultado de la resta es "+calculadora.getResultado());

        calculadora.multiplicar(operando1,operando2);
        System.out.println("El resultado de la multiplicación es: "+calculadora.getResultado());

        calculadora.division(operando1,operando2);
        System.out.println("El resultado de la división es: "+calculadora.getResultado());

        calculadora.modulo(operando1,operando2);
        System.out.println("El resultado del módulo es: "+calculadora.getResultado());
    }
}
