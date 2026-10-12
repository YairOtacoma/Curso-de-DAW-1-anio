package Objetos;

public class Main {
    public static void main(String[] args) {


        Persona ana = new Persona("Ana", 20);
        ana.saludar();


        Mascota Agatha = new Mascota("Agatha","gato",3);
        Mascota Mika = new Mascota("Mika", "perro",12);
        Agatha.datos();
        Mika.datos();


        Libros SinTitulo = new Libros();
        Libros After = new Libros("After","Anna Todd",300);
        SinTitulo.datos();
        After.datos();

        Producto botella = new Producto("Solán de Cabras");
        Producto teclado = new Producto("Logitech",70.5);
        System.out.print("Producto 1: ");
        botella.datos();
        System.out.print("Producto 2: ");
        teclado.datos();

        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Toyota","Corolla");
        Coche coche3 = new Coche("Seat","Ibiza",2020);
        System.out.print("Coche 1: ");
        coche1.datos();
        System.out.print("Coche 2:");
        coche2.datos();
        System.out.print("Coche 3: ");
        coche3.datos();

        Estudiante estudiante1 = new Estudiante("Estrella","Ilustración");
        Estudiante estudiante2 = new Estudiante("Miguel","Edición de video",true);
        System.out.print("Estudiante 1: ");
        estudiante1.datos();
        System.out.print("Estudiante 2: ");
        estudiante2.datos();

        Rectangulo rectangulo = new Rectangulo(5,3);
        Rectangulo cuadrado = new Rectangulo(4);
        System.out.print("Medidas del rectángulo: ");
        rectangulo.medidas();
        System.out.println("Área del rectángulo: "+rectangulo.base*rectangulo.altura);
        System.out.print("Medidas del cuadrado ");
        cuadrado.medidas();
        System.out.println("Área del cuadrado: "+cuadrado.base*cuadrado.altura);

        Cine entrada1 = new Cine ("Toy Story");
        Cine entrada2 = new Cine("Encanto",3,8.5);
        System.out.print("Entrada 1: ");
        entrada1.entrada();
        System.out.print("Entrada 2: ");
        entrada2.entrada();
        System.out.println("Total de las entradas: "+(entrada1.precio+entrada2.precio));
        //Hay que poner el paréntesis para que se hagan los cálculos de la suma

        Jugadores j1 = new Jugadores("Marcos");
        Jugadores j2 = new Jugadores("Patrcia",3);
        Jugadores j3 = new Jugadores("Luna",5,200);
        System.out.print("Jugador 1: ");
        j1.datos();
        System.out.print("Jugador 2: ");
        j2.datos();
        System.out.print("Jugador 3: ");
        j3.datos();

        j1.puntuacion+=50;
        //para aumentar su puntuacion
        System.out.println("Puntuaciones después del cambio:");
        System.out.print("Jugador 1: ");
        j1.datos();
        System.out.print("Jugador 2: ");
        j2.datos();
        System.out.print("Jugador 3: ");
        j3.datos();



        Movil m1 = new Movil("Iphone","Air");
        Movil m2 = new Movil("Samsung","Ultra",256);
        Movil m3 = new Movil("Pixel", "Pro",512, true);
        System.out.print("Móvil 1: ");
        m1.ficha();
        System.out.print("Móvil 2: ");
        m2.ficha();
        System.out.print("Móvil 3: ");
        m3.ficha();

    }


}

