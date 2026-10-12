package Objetos;

public class Libros {
    String titulo;
    String autor;
    int paginas;

    public Libros(){
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.paginas = 0;

    }
    public Libros(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void datos(){
        System.out.printf("Libro con título %s con autor %s y el número de páginas es %d\n",this.titulo,this.autor,this.paginas);
    }

}
