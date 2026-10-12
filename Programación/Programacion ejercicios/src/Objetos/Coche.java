package Objetos;

public class Coche {
    String marca;
    String modelo;
    int anio;

    public Coche(){
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        this.anio = 2000;
    }
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = 2026;
    }
    public Coche(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public void datos(){
        System.out.printf("Marca es %s, su modelo es %s y el año es %d\n",this.marca, this.modelo,this.anio);
    }
}
