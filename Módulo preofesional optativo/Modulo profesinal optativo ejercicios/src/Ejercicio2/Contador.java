package Ejercicio2;

public class Contador {
    /*
    1. Atributos (Propiedades o variables de Estado)
    2. Métodos constructores (y destructores)
    3. Getters y Setters (Métodos de Acceso/Modificación)
    4. Métodos de negocio / comportamiento (Lógica principal)
    5. Métodos Privados / Auxiliares
     */
    private int cont;

    //Constructor por defecto
    public Contador(){

    }

    //Constructor por parámetros
    public Contador(int cont){
        if(cont < 0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }
    //Contructor copia
    public Contador(Contador c){
        this.cont = c.cont;
    }

    //getters y setters

    public int getCont() {
        return cont;
    }

    public void setCont(int cont){
        if (cont<0){
            this.cont = 0;
        }else {
            this.cont = cont;
        }
    }


    //metodos de negocio / comportamiento

    public void incrementar(){
        this.cont++; //this.cont = this.cont + 1
    }

    public void decrementar(){
        this.cont--; //this.cont = this.cont - 1
        if(this.cont <0){
            this.cont = 0;
        }

    }

    //privados
}
