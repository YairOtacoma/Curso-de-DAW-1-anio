package Ejercicio1;

import javax.crypto.CipherInputStream;
import java.sql.SQLClientInfoException;

public class Main {
    public static void main(String[] args) {
        //1 Como crear un objeto
        //Nombre de la clase + nombre del objeto = new + nombre del constructor+();
        //nombre del constructor = nombre de la clase -> SOLO EL NOMBRE NO QUE SEAN LO MISMO
        /*Cuenta c1 = new Cuenta();
        c1.cliente = "Pepe";
        c1.numeroCuenta = "ES23891827398217398";
        c1.interes = 4.5;
        c1.saldo = 1000;

        System.out.println(c1.cliente);
        Esto es muy lento si tienes muchos clientes!!!!
         */

        Cuenta cliente1 = new Cuenta("Pepe", "ES1827382139213",4.5,1000);
        Cuenta cliente2 = new Cuenta("Marcos","ES1923719827398",7.8,2000);
        Cuenta cliente3 = new Cuenta("Patri","ES38472983478934",8.9);
        System.out.println(cliente3.getSaldo());

    }
}
