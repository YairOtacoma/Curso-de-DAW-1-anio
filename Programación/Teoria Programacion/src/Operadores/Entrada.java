package Operadores;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Programa para explicar los operadores");
        //Dentro del main al usar Scanner trae la funcionalidad para poder usar Scanner
        // permite realizar lecturas por teclado, es una variable compleja y hay que usar un constructor
        //Diferencia entre String y Scanner, se da por hecho que al poner doble comillas creas un string.
        Scanner lector = new Scanner(System.in);
        System.out.println("Indicame tu nombre");
        //Dependiendo del tipo de dato que quisieras leer la variable lectora tiene métodos para ello
        String nombre = lector.nextLine();
        //Para leer por teclado
        System.out.println("En que ciclo te has matriculado");
        String ciclo = lector.nextLine();
        System.out.println("Que nota quieres sacar de media en "+ciclo);
        //El dato al ser un número con int, double o float
        double media = lector.nextDouble();
        //Si es double-> lector.nextDouble y asi con loss, los decimales si van con comas.
        //Next. Line-> le nombres
        //next. Doouble-> numeros con decimales grandes

        System.out.println("Nombre: "+nombre.toUpperCase());
        //A traves del operador punto a la funcionalidad de ponero en mayusuclas
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Media: "+media);
        //Primer operador visto-> "." el punto
        //Existen 4 grandes tipos de operadores:
        //Aritméticos -> opera iones + - * / % (cuidado con la suma de dos String)
        int operador1 = 4;
        int operador2 = 8;
        int suma = operador1 + operador2;
        int resta = operador1 - operador2;
        int multiplicacion = operador1 * operador2;
        double division = (double)operador1 / operador2;
        // % el resto de la división de dos números
        int resto = 5%2; //sirve para saber cuantos segundos entran en unos minutos
        String numero = "5";
        String numero2 = "7";
        System.out.println("Concatenación string "+(operador1+operador2));
        System.out.println("El resto de la division es: "+resto);
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La muñiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
        //Asignación -> da un valor = += -=

        operador1 = 10;
        operador2 = 11;
        operador1++; // 11 -> operador1 = operador1 + 1
        operador1++; // 12
        //sumar 14 al operador 1
        //operador1 = operador1+14;
        operador1 += 14; //operdor1 = operador1+14 ->28
        operador2 -= 10; //-2
        operador1 +=2; //56
        operador1 %=2; //0 (es el resto de la división)
        System.out.println("El valor despues de haber operador es Operador1: "+operador1);
        System.out.println("El valor despues de haber operador es Operador2: "+operador2);

        //Relacionales - Comparación -> comparan dos o más variables entre sí < <= > >= ==!=

        operador1 = 10;
        operador2 = 10;
        boolean comparacion = operador1>operador2; //false
        System.out.println("La comparación > es "+comparacion);
        comparacion = operador1>=operador2; //true
        System.out.println("La comparación >= es "+comparacion);
        comparacion = operador1<operador2;
        System.out.println("La comparación < es "+comparacion);
        comparacion = operador1<=operador2;
        System.out.println("La comparación <= es "+comparacion);
        comparacion = operador1==operador2;
        System.out.println("La comparación == es "+comparacion);
        comparacion = operador1!=operador2;
        System.out.println("La comparación != es "+comparacion);

        String palabra1 = "programacion";
        String palabra2 = "Programacion";
        boolean compararPalabras =palabra1.equals(palabra2); //false
        boolean compararPalabrasDiferentes = !palabra1.equalsIgnoreCase(palabra2); // false -> true
        compararPalabras = palabra1.equalsIgnoreCase(palabra2);
        System.out.println("La comparación de palabra es "+compararPalabras);

        //Lógicos -> preguntar por sentencias && -> shift+6 || -> alt1
        // && -> AND || -> OR
        operador1 = 10;
        operador2 = 20;
        boolean comparacionAND = operador2 > 0 && operador1 < 10; // false
        boolean comparacionOR = operador1 < 10 || operador2<20 || operador1*2 <=operador2; //true











    }
}
