package Objetos;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(){}
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void saludar(){
        System.out.printf("Hola, mi nombre es %s y tengo %d años\n", this.nombre, this.edad);
    }

}