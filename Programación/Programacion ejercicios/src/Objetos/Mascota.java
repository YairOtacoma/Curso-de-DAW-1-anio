package Objetos;

public class Mascota {

    String nombre;
    String especie;
    int edad;

    public Mascota(){}
    public Mascota(String nombre, String especie, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;
    }

    public void datos (){
        System.out.printf("Mi mascota de nombre %s, es un %s y tiene la edad de %d años\n",this.nombre,this.especie,this.edad);
    }
}

