package For;

import java.util.Random;
import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas veces vas a tirar el dado");

        int veces = lector.nextInt();
        /*if(veces<=0){
            veces = 10;
        }
         */

        veces = veces<1 ? 100 : veces;

        for (int i=0;i<veces; i++){
            System.out.println("Tirada numero "+(i+1));
            // 1-6

            Random random = new Random();
            int aleatorio = random.nextInt(6)+1;
            System.out.println(aleatorio);

        }

    }
}
