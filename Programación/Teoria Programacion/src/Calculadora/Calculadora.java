package Calculadora;

public class Calculadora {

    private int operando1,operando2;
    private double resultado;

    //constructores -> el vacío esta por defecto, siempre y cuando no tenga ningun construtor escrito
    //realizar el resto de funcionalidades del sistema -> resta, multiplicacion, division, modulo
    public Calculadora(){}
    public void sumar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2;
        System.out.println("Suma completada");
    }

    public void restar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 - this.operando2;
        System.out.println("Resta completada");

    }

    public void multiplicar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 * this.operando2;
        System.out.println("Multiplicación completada");
    }

    public void division(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 / this.operando2;
        System.out.println("División completada");
    }

    public void modulo(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = operando1%operando2;
        System.out.println("Módulo completado");
    }
    //Hay que hacer los getter y los setter

    public int getOperaendo2() {
        return operando2;
    }

    public void setOperaendo2(int operaendo2) {
        this.operando2 = operaendo2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {this.operando1 = operando1;}


}

