package Exception.model;

public class cuentaCorriente {

    //atributos

    private String titular;

    private int pin;

    private double saldo;

    //constructores -> 1 por defecto
    //titular = null pin = 0 saldo = 0.0
    //Sobrecaraga -> muchos constructores

    public cuentaCorriente(){}
    public cuentaCorriente(String titular, int pin, double saldo){
        this.saldo = saldo;
        this.titular = titular;
        this.pin = pin;
    }

    public cuentaCorriente(String titular, int pin){
        this.pin = pin;
        this.titular = titular;
    }
    public cuentaCorriente(String titular){
        this.pin = 2210;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
