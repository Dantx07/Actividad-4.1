public class Cuenta_Ahorros extends Cuenta {

    private boolean activo;

    public Cuenta_Ahorros (float Saldo, float Tasa_anual) {
        super(Saldo, Tasa_anual);
        if (Saldo > 10000) {
            activo = true;
        }   else {
            activo = false;
        }
    }

    public void Consignar (float Dinero) {
        if (activo) {
            super.Consignar(Dinero);
        }
    }

    public void Retirar (float Dinero)  {
        if (activo) {
            super.Retirar(Dinero);
        }
    }

    public void Extracto_Mensual () {
        if (Numero_de_retiros > 4)  {
            Comision_mensual += (Numero_de_retiros - 4) * 1000;
        }

        super.Extracto_mensual();

        if (Saldo < 10000)  {
            activo = false;
        }
    }

    public void Imprimir () {
        System.out.println ("El saldo de su cuenta es de: $" + Saldo);
        System.out.println ("La comision mensual de su cuenta es de: $" + Comision_mensual);
        System.out.println ("Numero de transacciones realizadas: " + (Numero_de_retiros + Numero_de_consignaciones));

    }
}