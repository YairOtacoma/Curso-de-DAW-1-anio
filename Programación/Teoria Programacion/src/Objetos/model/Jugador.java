package Objetos.model;

import jdk.swing.interop.SwingInterOpUtils;

public class Jugador {
    //representa el "molde" de lo que será un jugador real
    //atributos que cuaifican -> nombre, nVidas, nHabilidad,..
    public String nombre, clan;
    public int vidas, habilidades;
    public boolean estrella;

    //constructor -> la manera en la que se inicia el jugador -> 1 (de momento el vacio) a n
    //si creas más de 1 constructor -> SOBRECARGA
    //si no hay constructor vacío lo tienes disponible
    //si escribes un constructor diferente al vacío se enmascara
    //mod_acc (public) (no hace falta escribir void porque tu quieres que retorne) Jugador(tipo p1, tipo p2) {}
    public Jugador() {
    }

    public Jugador(String nombre, String clan,
                   int vidas, int habilidades) {
        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        this.habilidades = (int) (Math.random() * 101); // (0) ->
        //this.habilidades = habilidades;
        estrella = false;
    }

    public Jugador(String nombre, String clan, int vidas) {
        this.nombre = nombre;
        this.clan = clan;
        this.vidas = vidas;
        //this.habilidades = habilidades;
        estrella = false;

    }


    //métodos -> las funcionalidades del elemento cuando sea real
    public void saludar()
    {
        System.out.println("Hola, mi nombre es "+this.nombre);
        System.out.println("Tengo una cantidad de habilidades de "+this.habilidades);
        System.out.printf("Tengo %d vidas\n",this.vidas);

    }
    // mod_acc (private/public/protected) retorno (void/int/double) nombre( param ) {}

    public void lanzarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void recibirImpacto(){
        vidas--;
        System.out.printf("Mierda, me han dado, me quedan %d vidas\n");
    }
}






