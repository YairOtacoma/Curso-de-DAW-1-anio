package Estructuras;

public class MainSwitch {
    public static void main(String[] args) {
        //al utilizar un switch se evalúa un valor no un boolean
        int numero = 1;
        String nombre = "Borja";
        String mensaje = null;
        /*switch (numero) {
            //no escribas NADA dentro del switch, solo fuera
            //las variables no se pueden llamar igual de la misma llave.
            //puedes cambiar el valor.
            case 1:
                //HAZ LO QUE QUIERAS
                System.out.println("La variable vale 1");
                mensaje = "Variable 1";
                break;
            case 3:
                System.out.println("La variable vale 3");
                mensaje = "Variable 3";
                break;
            case 4:
                System.out.println("La variable vale 4");
                mensaje = "Variable 4";
                break;
            case 5:
                System.out.println("La variable vale 5");
                mensaje = "Variable 5";
                break;
            case 2,7,8,9:
                System.out.println("Caso en conjunto");
                break;
            default:
                System.out.println("La variable no está contemplada");
                break;

         */
        switch (nombre) {
            case "Borja" -> {
                System.out.println("El nombre es analizado");
                System.out.println("El nombre es Borja");
            }
            case "Ana" -> {
                System.out.println("El nombre es Ana");
            }
            case "Juan" -> {
                System.out.println("El nombre es Ana");
            }
            case "Marta" -> {
                System.out.println("El nombre es Ana");
            }

        }
    }
}
