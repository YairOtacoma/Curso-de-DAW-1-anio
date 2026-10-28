package Ejercicio3;

public class Libro {
     /*
    1. Atributos (Propiedades o variables de Estado)
    2. Métodos constructores (y destructores)
    3. Getters y Setters (Métodos de Acceso/Modificación)
    4. Métodos de negocio / comportamiento (Lógica principal)
    5. Métodos Privados / Auxiliares
     */

    //Atributos

    private String titulo;
    private String autor;
    private int ejemplares; //los que tendré en tienda
    private int prestados; //los que presto


    //Constructores


    public Libro (){} //Constructor por defecto

    public Libro(String titulo, String autor, int ejemplares, int prestados ){ //Constructor con parámetros
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }


    //getters y setters


    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getejemplares(){
        return ejemplares;
    }
    public int getprestados(){
        return prestados;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados){
        this.prestados = prestados;
    }


    //metodo prestamo y devolucion


    public boolean prestamo(){
        boolean resultado = true;
        if(prestados < ejemplares){
            prestados++;
        }else {
            resultado = false;
        }
        return resultado;
    }

    public boolean devolucion (){
        boolean resultado = true;
        if(prestados !=0){
            prestados--;
        }else{
            resultado = false;
        }
        return resultado;
    }


    //metodo toString

    @Override //agregar un metodo que ya existe
    public String toString(){ //dar una representación en líneas de texto que es ese objeto en concreto
        return "Titulo : "+this.titulo+", autor: "+this.autor+", nºejemplares: "+this.ejemplares+", nºprestados: "+this.prestados;
    }

}
