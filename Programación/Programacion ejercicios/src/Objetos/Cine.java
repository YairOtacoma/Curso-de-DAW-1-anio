package Objetos;

public class Cine {
    String pelicula;
    int sala;
    double precio;

    public Cine(){}
    public Cine(String pelicula){
        this.pelicula = pelicula;
        this.sala = 1;
        this.precio = 7.5;
    }
    public Cine(String pelicula, int sala, double precio){
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }
    public void entrada(){
        System.out.printf("Película: %s Sala:%d Precio: %.2f\n",this.pelicula,this.sala,this.precio);
    }
}
