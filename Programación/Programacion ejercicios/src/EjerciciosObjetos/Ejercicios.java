package EjerciciosObjetos;

import java.util.Scanner;

public class Ejercicios {
    public void ejercicioBanco(){
        Cajero cajero = new Cajero();
        Scanner lector = new Scanner(System.in);

        int opcion;
        System.out.println("El saldo del cajero actual es "+cajero.getSaldo());

        do{

        System.out.println("1. Consultar");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Salir");
        System.out.println("Que quieres hacer");
        opcion = lector.nextInt();
        switch (opcion){
            case 1 -> System.out.println("Que cantidad quieres sacar");
            case 2 ->{
                System.out.println("Que cantidad quieres sacar");
                int sacar = lector.nextInt();
                if (sacar<1 || cajero.getSaldo()<sacar){
                    System.out.println("Fallo en el proceso");
                }else{
                    cajero.retirarDinero(sacar);
                }
            }
            case 3 -> {
                System.out.println("Cuanto quieres depositar");
                int ingreso = lector.nextInt();
                if(ingreso<1){
                    System.out.println("Error al introducir el dinero");
                } else {
                    cajero.ingresarDinero(ingreso);
                }
            }
            case 4 -> System.out.println("Saliendo...");

        }
        }while(opcion !=4);


    }

    public void ejercicioAdivinacion(){
        Scanner lector = new Scanner(System.in);
        String respuesta;
        int record = Integer.MAX_VALUE;
        do {
            int aleatorio = (int) (Math.random()*21); //0-21
            System.out.println(aleatorio);
            int numeroUsuario;
            int intentos = 0;

            do {
                System.out.println("Adivina el número, di cual es tu opción");
                numeroUsuario = lector.nextInt();
                intentos++;
            } while (aleatorio != numeroUsuario);
            System.out.println("Enhorabuena, número acertado en " + intentos);
            if(intentos<record){
                System.out.println("Has superado el record, dejandolo en "+record);
                record = intentos;
            }
            System.out.println("Quiers volver a jugar (S/N)");
            respuesta = lector.next();

        }while(respuesta.equalsIgnoreCase("S"));

        System.out.println("Terminamos el juego");

    }

    public void ejercicioDecimal(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Indica el numero que quieres sacar");
        String numeroBase = lector.next();
        System.out.println("Indica la base en la que esta el numero");
        int base = lector.nextInt();
        System.out.printf("Procedemos a pasar el numero %s en una base %d a decimal\n",numeroBase,base);
        int sumatorio = 0;
        for (int i = 0; i < numeroBase.length(); i++){
            int posicion = numeroBase.length()-i-1;
            char letra = numeroBase.charAt(i); // '1'
            int numero = Integer.parseInt(String.valueOf(letra)); // 1
            sumatorio +=(int)(numero*Math.pow(base,posicion));
        }
        System.out.println("El numero en base 10 es "+sumatorio);
    }
}
