public class Cuenta_Corriente extends Cuenta {

    private float Sobregiro;
    private int Numero_de_ret = 0;
    private int Numero_de_con = 0;

    public Cuenta_Corriente (float Saldo, float Tasa_Anual)  {
        super(Saldo, Tasa_Anual);
        Sobregiro = 0;
    }

    public void Retirar (float Dinero)  {
        if (Dinero <= Saldo) {
            super.Retirar(Dinero);
        }   else {
            Sobregiro = Dinero - Saldo;
            Saldo = 0;
            Numero_de_ret += 1;
        }
    }

    public void Consignar (float Dinero)  {
        if (Sobregiro == 0)                                               {
            super.Consignar(Dinero);
        }   else {
            Sobregiro -= Dinero;
            if (Sobregiro < 0)  {
                Sobregiro = Sobregiro * -1;
                Saldo += Sobregiro;
                Sobregiro = 0;
                Numero_de_con =+ 1;
            }
        }
    }

    public void Extracto_Mensual () {
        super.Extracto_mensual();
    }

    public void Imprimir()  {
        System.out.println ("Su saldo actual es de: $" + Saldo);
        System.out.println ("La comision mensual es de: " + Comision_mensual);
        System.out.println ("Numero de transacciones realizadas: " + (Numero_de_retiros + Numero_de_consignaciones + Numero_de_ret + Numero_de_con));
        System.out.println ("Valor de Sobregiro: " + Sobregiro);
    }
}