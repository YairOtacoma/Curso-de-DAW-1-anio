package While;

public class Ejercicio3 {
    public static void main(String[] args) {
        //0-100

        int aleatorio, max =0;
        do{
            aleatorio = (int) (Math.random()*101);
            // max = aleatorio>max ? aleatorio: max;
            if (aleatorio>max){
                max=aleatorio;
            }
            System.out.println("Generado "+aleatorio);
        }while ( aleatorio>0);
    }
}
