package Objetos;

public class Estudiante {
    String nombre;
    String curso;
    boolean matriculado;

    public Estudiante(){}
    public Estudiante(String nombre, String curso){
        this.nombre = nombre;
        this.curso = curso;
        this.matriculado = false;
    }
    public Estudiante(String nombre, String curso, boolean matriculado){
        this.nombre = nombre;
        this.curso = curso;
        this.matriculado = matriculado;
    }
    public void datos(){
        System.out.printf("Nombre:%s  Curso:%s Matriculado:%b\n",this.nombre, this.curso,this.matriculado);
    }
}
