package Objetos;

public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre){
        this.nombre = nombre;
    }
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;

    }
    public void datos(){
        System.out.printf("Nombre del producto %s y el precio es %.2f\n",this.nombre,this.precio);
        //%d->int      %f->double     %.2f->para tener solo dos decimales
    }
}

