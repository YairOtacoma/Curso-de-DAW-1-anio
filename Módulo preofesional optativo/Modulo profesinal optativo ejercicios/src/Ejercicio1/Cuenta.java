package Ejercicio1;

public class Cuenta {
    //Crear un atributo
    //modificadr de acceso (public/private/protected) + tipo + nombre;
    //public: es accesible fuera y dentro de su clase.
    //private: es accesible SOLO DENTRO DE SU CLASE.
    //Encapsulacion: atributos privados + metodos publios get y set
    //Un parametro es una variable pero no todas las variables son paramteros
    private String cliente;
    private String numeroCuenta;
    private double interes;
    private double saldo;



    /*CONSTRUCTORES -> POR DEFEECTO, POR PARAMTROS, COPIA*/
    //public + nombre de la clase (parametros)

    public Cuenta(){}

    public Cuenta (String cliente, String numeroCuenta, double interes, double saldo){
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    public Cuenta (String cliente, String numeroCuenta, double interes){
        this.saldo = 750;
    }

    //CONSTRUCTOR COPIA

    public Cuenta(Cuenta c){
        this.cliente = c.cliente;
        this.numeroCuenta = c.numeroCuenta;
        this.interes = c.interes;
        this.saldo = c.saldo;
    }

    //GET -> public + tipo de valor+ nombre (){
    //return valor;
    //}

    public String getCliente(){

        return cliente;
    }

    public String getnumeroCuenta() {

        return numeroCuenta;
    }

    public double interes(){

        return interes;
    }

    public double getSaldo(){

        return saldo;
    }

    //Setter -> public + void + nombre(ATRIBUTO OBLIGATORIO)
    //  this.atributo = parametro;
    //}

    public void setCliente(String cliente){
        this.cliente = cliente;
        //x = 5
        //5 = x no es igual porque se lee de derecha a izquierda en java.
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setInteres(double interes){
        this.interes = interes;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean ingreso(double cantidad){
        boolean resultado = true;
        if(cantidad < 0){
            resultado = false;
        }else{
            this.saldo += cantidad; //this.saldo 0 this.saldo + cantidad
        }

        return  resultado;
    }

    public boolean reintegro(double cantidad){
        boolean resultado = true;
        if(cantidad < 0 || cantidad > this.saldo){
            resultado = false;
        }else{
            this.saldo -= cantidad;
        }
        return resultado;
    }

    public boolean transferencia(Cuenta cuentaDestino, double dinero){
        boolean resultado = true;
        if(dinero < 0 || dinero > this.saldo){
            resultado = false;
        }else{
            reintegro(dinero);
            cuentaDestino.ingreso(dinero);
        }

        return resultado;
    }

}

