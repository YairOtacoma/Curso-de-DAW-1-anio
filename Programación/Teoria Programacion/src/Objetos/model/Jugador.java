package Objetos.model;

public class Jugador {
    //representa el "molde" de lo que sera un jugador real
    //atributos que cuaifican -> nombre, nVidas, nHabilidad,..
    public String nombre, clan;
    public int vidas, habilidades;
    public boolean estrella;

    //constructor -> la manera en la que se inicia el jugador -> 1 (de momento el vacio) a n
        //mod_acc (public) (no hace falta escribir void porque tu quieres que retorne) Jugador(tipo p1, tipo p2) {}

    public Jugador(String nombreParametro, String clanParametro,
                   int vidasParametro, int habilidadesParametro){
        nombre = nombreParametro;
        clan = clanParametro;
        vidas = vidasParametro;
        habilidades = habilidadesParametro;
        //estrella = false;



    }

    public Jugador() {

    }
    //métodos -> las funcionalidades del elemento cuando sea real
        //mod_acc (private/public/protected) retorno (void/int/double) nombre( param ) {}





}
