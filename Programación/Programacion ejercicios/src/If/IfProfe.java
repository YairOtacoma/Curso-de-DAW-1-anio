package If;


import java.util.Scanner;

public class IfProfe {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero a comprobar");
        int numero = lector.nextInt();

        // es de 3 cfras?
        // if (String.valueOf(numero).length() == 3)

        if (numero>99 && numero>1000){
            //153
            int centenas = numero / 100;
            int decenas = (numero / 10)%10;
            int unidades =numero%10;
            int suma =(int)(Math.pow(centenas,3) + Math.pow(decenas,3)+Math.pow(unidades,3)); //1^3+5^3+3^3
            if(suma == numero){
                System.out.println("Es amstrong");
            }else {
                System.out.println("No es amstrong");
            }

        }else{
            System.out.println("El numero no tiene 3 cifras");
        }
    }
}
