package EstructurasDeControl;

import java.util.Scanner;

public class EntradaParque {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca altura: ");
        int altura = lector.nextInt();

        if (altura<=0){
            System.out.println("Altura inexistente, introduzca un valor válido");
        }else if (altura<120){
            System.out.println("No puedes subir a la atracción. Altura mínima 120cm.");
        }else if (altura>200){
            System.out.println("No puedes subir a la atracción. Altura máxima 200cm.");
        }else {
            System.out.println("Puedes subir a la atracción. Altura permitida.");
        }

    }
}
