import java.util.*;

public class Prueba_Cuentas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Tipo_De_Cuenta;

        System.out.println ("Ingrese el tipo de cuenta\n1.Cuenta de Ahorros\n2.Cuenta Corriente");
        do {
            System.out.println("Por favor, ingrese el número 1 o 2:");
            Tipo_De_Cuenta = scanner.nextInt();

            if (Tipo_De_Cuenta != 1 && Tipo_De_Cuenta != 2) {
                System.out.println("Error: Debes ingresar solo el número 1 o 2.");
            }
        } while (Tipo_De_Cuenta != 1 && Tipo_De_Cuenta != 2);
        System.out.println ("Ingrese su saldo inicial: ");
        float Saldo_inicial = scanner.nextFloat();
        System.out.println ("Ingrese la tasa de interes: ");
        float Tasa = scanner.nextFloat() / 100;

        if (Tipo_De_Cuenta == 1)    {
            Cuenta_Ahorros Nueva_Cuenta = new Cuenta_Ahorros(Saldo_inicial, Tasa);
            for (;;) {
                System.out.println("Hara un retiro o consignacion? (Ingrese el numero de opcion)\n1. Consignacion\n2. Retiro\n3. Salir");
                int Opcion = scanner.nextInt();
                if (Opcion == 1)  {
                    System.out.println("Ingrese la cantidad a consignar");
                    float Dinero = scanner.nextFloat();
                    Nueva_Cuenta.Consignar(Dinero);
                }   else if (Opcion == 2) {
                        System.out.println("Ingrese la cantidad a retirar");
                        float Dinero = scanner.nextFloat();
                        Nueva_Cuenta.Retirar(Dinero);
                    }   else if (Opcion == 3) {
                            break;
                        }   else {
                            System.out.println("Ingrese una opcion valida");
                        }
            }
            Nueva_Cuenta.Extracto_Mensual();
            Nueva_Cuenta.Imprimir();
        }   else {
                Cuenta_Corriente Nueva_Cuenta = new Cuenta_Corriente(Saldo_inicial, Tasa);
                for (;;) {
                    System.out.println("Hara un retiro o consignacion? (Ingrese el numero de opcion)\n1. Consignacion\n2. Retiro\n3. Salir");
                    int Opcion = scanner.nextInt();
                    if (Opcion == 1)  {
                        System.out.println("Ingrese la cantidad a consignar");
                        float Dinero = scanner.nextFloat();
                        Nueva_Cuenta.Consignar(Dinero);
                    }   else if (Opcion == 2) {
                        System.out.println("Ingrese la cantidad a retirar");
                        float Dinero = scanner.nextFloat();
                        Nueva_Cuenta.Retirar(Dinero);
                    }   else if (Opcion == 3) {
                        break;
                    }   else {
                        System.out.println("Ingrese una opcion valida");
                    }
                }
                Nueva_Cuenta.Extracto_Mensual();
                Nueva_Cuenta.Imprimir();
        }
    }
}