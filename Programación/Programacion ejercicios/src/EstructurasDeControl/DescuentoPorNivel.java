package EstructurasDeControl;

import java.util.Scanner;

public class DescuentoPorNivel {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Importe de la compra: ");
        int precio = lector.nextInt();

        System.out.println("¿Eres socio?: ");
        boolean socio = lector.nextBoolean();

        if (socio && precio>=200){
            System.out.println("Eres socio.");
            System.out.println("Precio de la compra: "+precio+"€");
            double descuento = precio*0.2;
            System.out.println("Recibes un descuento del 20%: "+descuento+"€");
            double multi = precio-descuento;
            System.out.println("Precio final: "+multi+"€");
        } else if (socio && precio<200){
            System.out.println("Eres socio.");
            System.out.println("Precio de la compre: "+precio+"€");
            double descuento = precio*0.1;
            System.out.println("Recibe un descuento del 10%: "+descuento+"€");
            double multi = precio-descuento;
            System.out.println("Precio final: "+multi+"€");

        } else if (precio>=300){
            System.out.println("No eres socio.");
            System.out.println("Precio de la compra: "+precio+"€");
            double descuento = precio*0.05;
            System.out.println("Recibes un descuento del 5%: "+descuento+"€");
            double multi = precio-descuento;
            System.out.println("Precio final: "+multi+"€");
        }else{
            System.out.println("No eres socio.");
            System.out.println("Precio de la compra: "+precio+"€");
            System.out.println("No recibes descuento.");
            System.out.println("Precio final: "+precio+"€");
        }


    }
}
