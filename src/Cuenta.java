public class Cuenta {
    protected float Saldo;
    protected int Numero_de_consignaciones = 0;
    protected int Numero_de_retiros = 0;
    protected float Tasa_anual;
    protected float Comision_mensual = 0;

    public Cuenta (float Saldo, float Tasa_anual)   {
        this.Saldo = Saldo;
        this.Tasa_anual = Tasa_anual;
    }

    public void Consignar (float Dinero)  {
        Saldo = Saldo + Dinero;
        Numero_de_consignaciones += 1;
    }

    public void Retirar (float Dinero)  {
        if (Saldo-Dinero >= 0)   {
             Saldo -= Dinero;
             Numero_de_retiros += 1;
        }   else {
            System.out.println("No tiene suficiente saldo para retirar");
        }
    }

    public void Interes () {
        float Interes_mensual = Tasa_anual / 12;
        float Saldo_con_interes = Interes_mensual*Saldo;
        Saldo += Saldo_con_interes;
    }

    public void Extracto_mensual () {
        Saldo -= Comision_mensual;
        Interes();
    }
}