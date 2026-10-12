package Objetos;

public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(){}
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo(double base){
        this.base = base;
        this.altura = base;
        //Cuadrado
    }
    public void medidas(){
        System.out.printf("Base: %.1f Altura: %.1f\n",this.base,this.altura);
    }
}
