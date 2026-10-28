package Exception.model;

public class Banco {

    // lista de cuentas

    private cuentaCorriente cuentaCorriente;

    public Banco (){} // nombre -> null cuenta -> null

    public void darAltaCuenta (cuentaCorriente cuentaCorriente){
        //cambias la cuenta existente
        this.cuentaCorriente = cuentaCorriente;
    }

    public void cancelarCuenta(String titular,int pin) throws NullPointerException{
        // para hacer esto cuenta = null
        // que tiene que pasar? ->
        /*if (cuentaCorriente !=null && cuentaCorriente.getTitular().equals(titular) && cuentaCorriente.getPin() == pin){
            System.out.println("Cuenta cancelada");
            cuentaCorriente = null;
        }

         */

        /*try {


            if (cuentaCorriente.getTitular().equals(titular) && cuentaCorriente.getPin() == pin) {
                System.out.println("Cuenta cancelada");
                cuentaCorriente = null;
            }
        }catch(NullPointerException e){
            System.out.println("La cuenta no esta asociada a nadie, no se puede cancelar.");
        }

         */

        if (cuentaCorriente.getTitular().equals(titular) && cuentaCorriente.getPin() == pin){
            System.out.println("Cuenta cancelada");
            cuentaCorriente = null;
        }

    }


}
