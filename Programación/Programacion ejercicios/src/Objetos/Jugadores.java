package Objetos;

public class Jugadores {
    String nombre;
    int nivel;
    int puntuacion;

    public Jugadores(){}
    public Jugadores(String nombre){
        this.nombre=nombre;
        this.nivel=1;
        this.puntuacion=0;
    }
    public Jugadores(String nombre, int nivel){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntuacion=0;
    }
    public Jugadores(String nombre, int nivel, int puntuacion){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntuacion=puntuacion;
    }

    public void datos(){
        System.out.printf("Nombre:%s  Nivel:%d  Puntación:%d\n",this.nombre,this.nivel,this.puntuacion);
    }
}
