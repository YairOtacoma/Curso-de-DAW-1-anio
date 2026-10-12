package Objetos.model;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Iniciando programa de juego");

        Jugador jugador1 = new Jugador("Yair", "clan1",1,3);
        //nombre=null, clan=null, estrella=false, vidas=0, habilidad=0
        Jugador jugador2 = new Jugador("Manuel","clan2",5,100);
        //nombre=null, clan=null, estrella=false, vidas=0, habilidad=0
        Jugador jugador3 = new Jugador("Daniel","clan1",10,90);
        //nombre=null, clan=null, estrella=false, vidas=0, habilidad=0
        Jugador jugador4 = new Jugador("Paula","clan2",9,75);
        //nombre=null, clan=null, estrella=false, vidas=0, habilidad=0
        Jugador jugador5 = new Jugador("Mario", "clan6",9);
        jugador2.saludar();

        jugador2.clan = "nuevo clan";
        System.out.println("El clan del jugador 2 es "+jugador2.clan);

        jugador2.saludar();



    }
}
