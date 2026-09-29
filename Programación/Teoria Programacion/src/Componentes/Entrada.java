package Componentes;


/**
 * Clase dedicada a la ejecucion del programa
 */
public class Entrada {
    // TODO. Definir alguna variable
    // definiciojn de metodo
    // este es el principal
    /*
        el metodo main es la puerta
        de entrada del programa
     */
    // TODO. Realizar el metodo main

    // mod_acceso retorno nombre(argumentos){
    // Ejecuciones del metodo
    // }

    public String global = "Hola";
    public static void main(String[] args) {
        String nombre = "null";
        System.out.println(nombre.length());
        /*Se ha roto el programa, ha compilado, pero cuando esta ejecutando
        han pasado cosas. Por intentar ejecutar un metodo sobre algo que es
        nulo, el metodo son los () que estan dentro de (nombre.length())
         */
        //String nombre = "null";
        //System.out.println(nombre.length());
        /*Si lo ponemos en String no nos da error y el resultado es 4

         */
        System.out.println("hola Mundo");
        System.out.println("ashaush");
        System.out.println("sahashsa");
        //Para ordenar el código vas a code y das a reformat code
        /*Tres tipos de salida por consola:
        System.out.println-> me imprime una linea de codigo con salto de linea
         */
        System.out.println("ejemplo de print");
        System.out.println("ejemplo 2 del print");
        //System.out.print-> no hace salto de linea
        System.out.println(90+" este numero es el mio");
        System.out.printf("Me llamo %s con apellidos %s %s y tengo %d años","Borja","martin", "herrera",41);
        //%s -> palabra
        //%d -> numero sin decimales
        //%f -> numero con decimales
        //%-> banderas
        /*Sirve para formateos como
        INSERT INTO alumnos (name, surname, email, phone, adress, nia, work_phone) VALUES ("Borja", "Martin", 41)
         */
        //Se usara printf para formateos ya que println no te deja

        //Variable-> guardar un dato y utilizarlo -> tipos nombre valor
        //segun el tipo de dato que tengo guardado: palabras-letras / numeros / boolean
        //segun el origen del dato que tengo guardado: primitivos / complejos
        //segun su posibilidad de cambiar el valor: mutables/ no mutables(no puede alterar su valor, es una constante)
        //segun su scope(donde esta definida la variable) - de clase o metodo

        final String DNI = "1234";
        //se puede cambiar ya que para que sea no mutable tienes que añadir "final" delante
        //se puede aplicar a cualquier variable, metodo o clase
        System.out.println(DNI);
        //Primero definimos la variable y luego la utilizamos, dentro del metodo

        String nombrePropio = "Yair";
        String apellido1 = "Otacoma";
        String apuellido2 = "Espinoza";
        //Esta en blanco y en mayusculas, es el dato con su funcionalidad asociada porque es una variable compleja.
        nombrePropio = "Yair M";
        //Asi reasignamos un valor nuevo

        char letra = 'A';
        Character letraCompleta = letra;
        letra = 'B';
        // Byte, short, long
        int edad = 41;
        Integer edadCompleta = edad;
        double altura = 1.80;
        float alturaFloat = 1.80f; //aqui hay queponer la detras del numero decimal para que no te de error
        boolean acierto = false;
        Object cosa = 1;
        /*Clase Object-> se puede guardar cualquier variable de las anteriores mencionadas,
         engloba al reto de clases, es como la clase madre de Java.
         */



    }

    public void metodoMio(){
        System.out.println(global);
        //No me deja porque no esta en el mismo ambito, esta en el de arriba

    }
    public void metodoMio2(){
        System.out.println(global);
        //me deja en varios metodos porque ambos estan dentro del alcance de la variable "global",
        //porque su vida util esta dentro de las llaves
    }
}