package EstructurasDeControl;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Importe de la compra: ");

        int precio = lector.nextInt();

        if (precio<=0){
            System.out.println("Importe no válido");
        }else if (precio<100){
            System.out.println("No aplica el descuento del 10%");
            System.out.println("Descuento aplicado: 0");
            System.out.println("El precio final: "+precio);
        }else{
            System.out.println("Sí aplica el descuento del 10%");

            double descuento = (double)precio/10;
            /*Aunque la variable donde guardas el resultado sea double, si divides dos variables de tipo int, Java hará
            una división entera y perderás los decimales. Para evitarlo, hay que usar el casteo (double) en al menos
            uno de los valores.
             */
            System.out.println("Descuento aplicado: "+descuento);
            double importeFinal = precio - descuento;
            System.out.println("El precio final: "+importeFinal);

        }



    }
}
