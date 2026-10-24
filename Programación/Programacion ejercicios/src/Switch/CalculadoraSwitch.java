package Switch;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce primer número: ");
        double numero1 = lector.nextDouble();

        System.out.println("Introduce una operación: ");
        char operacion = lector.next().charAt(0);

        System.out.println("Introduce segundo número: ");
        double numero2 = lector.nextDouble();

        double resultado;
        switch (operacion){
            case '+'->{
                resultado = (numero1+numero2);
            }
            case '-'->{
                resultado = (numero1-numero2);
            }
            case '*'->{
                resultado = (numero1*numero2);
            }
            case '/'->{
                resultado = (numero1/numero2);
            }
            default ->{
                resultado = 0;
            }
        }
        System.out.printf("Resultado: %.2f %c %.2f = %.2f\n",numero1,operacion,numero2,resultado);
    }
}
