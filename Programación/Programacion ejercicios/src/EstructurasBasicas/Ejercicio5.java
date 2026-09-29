package EstructurasBasicas;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Declaración y uso de constantes

        final String NOMBRE_DE_LA_APP = "Bubble";
        final double VERSION_DE_LA_APP = 1.0;
        final float NUMERO_PI = 3.14159f;
        String usuario = "Laura";
        int nivel = 1;
        int puntuacion = 0;
        System.out.println("Nombre de la App: "+NOMBRE_DE_LA_APP);
        System.out.println("Versión de la App: "+VERSION_DE_LA_APP);
        System.out.println("Valor de PI: "+NUMERO_PI);
        System.out.println("Usuario actual: "+usuario);
        System.out.println("Nivel actual: "+nivel);
        System.out.println("Puntuación actual: "+puntuacion);

        usuario = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("Usuario actualizado: "+usuario);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuación actualizado: "+puntuacion);



    }
}