import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    
    private ArrayList<CuentaBancaria> cuentas;
    Scanner scan;

    public Banco(){
        cuentas = new ArrayList<CuentaBancaria>();
        scan = new Scanner(System.in);
    }

    public CuentaBancaria Buscar(int CodBuscado){
        for(CuentaBancaria cuenta : cuentas){
            if(cuenta.GetNumerodeCuenta() == CodBuscado){
                return cuenta;
            }
        }
        return null;
    }

    private void NuevaCuenta(){
        CuentaBancaria nuevaCuenta = new CuentaBancaria(this);
        System.out.println("Registre sus datos para abrir una nueva cuenta: \n");

        System.out.print("Digite su nombre: ");
        String nombre = scan.next();
        nuevaCuenta.SetNombre(nombre);
        System.out.print("\n");

        System.out.print("Digite el tipo de cuenta: ");
        String TipoCuenta = scan.next();
        nuevaCuenta.SetTipoCuenta(TipoCuenta);
        System.out.print("\n");
        
        System.out.print("Digite su numero de cuenta: ");
        int NumeroCuenta = scan.nextInt();
        nuevaCuenta.SetNumerodeCuenta(NumeroCuenta);
        System.out.print("\n");

        cuentas.add(nuevaCuenta);
    }

    private void EstadodeCuenta(CuentaBancaria cuenta){
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre: " +cuenta.GetNombre());
        System.out.println("------------------------------------------------------------");
        System.out.println("\n");

        System.out.println("------------------------------------------------------------");
        System.out.println("Saldo: " +cuenta.GetSaldo());
        System.out.println("------------------------------------------------------------");
        System.out.println("\n");

        System.out.println("------------------------------------------------------------");
        System.out.println("Tipo de cuenta: " +cuenta.GetTipoCuenta());
        System.out.println("------------------------------------------------------------");
        System.out.println("\n");

        System.out.println("------------------------------------------------------------");
        System.out.println("Numero de cuenta: " +cuenta.GetNumerodeCuenta());
        System.out.println("------------------------------------------------------------");
        System.out.println("\n");
    }

    private void ListarCuentas(){
        int contador = 1;
        for(CuentaBancaria cuenta : cuentas){

            System.out.print("\n");
            System.out.println("-------------------------------------Cuenta"+contador+"--------------------------------------");
            System.out.print("\n");

            System.out.println("------------------------------------------------------------");
            System.out.println("Nombre: " +cuenta.GetNombre());
            System.out.println("------------------------------------------------------------");
            System.out.print("\n");

            System.out.println("------------------------------------------------------------");
            System.out.println("Saldo: " +cuenta.GetSaldo());
            System.out.println("------------------------------------------------------------");
            System.out.print("\n");

            System.out.println("------------------------------------------------------------");
            System.out.println("Tipo de cuenta: " +cuenta.GetTipoCuenta());
            System.out.println("------------------------------------------------------------");
            System.out.print("\n");

            System.out.println("------------------------------------------------------------");
            System.out.println("Numero de cuenta: " +cuenta.GetNumerodeCuenta());
            System.out.println("------------------------------------------------------------");
            System.out.print("\n");
            
            contador++;
        }
    }
    

    private void GestionarCuenta(CuentaBancaria cuenta){
        int op;

        do
        {
            System.out.println("\nDigite:\n1-Depositar\n2-Retirar\n3-Transferir\n4-Ver estado de cuenta\n5-Listar cuentas\n6-Salir\n");
            op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.print("\n\nDigite la cantidad a depositar en su cuenta: ");
                    Double cantidad = scan.nextDouble();
                    cuenta.Deposito(cantidad);
                    break;

                case 2:
                    System.out.print("\n\nDigite la cantidad a retirar de su cuenta: ");
                    double retiro = scan.nextDouble();
                    System.out.print("\n");
                    cuenta.Retiro(retiro);
                    break;

                case 3:
                    cuenta.Transferencia();
                    break;
                
                case 4:
                    EstadodeCuenta(cuenta);
                    break;

                case 5:
                    ListarCuentas();
                    break;

                case 6:
                    break;
                    
                default:
                    break;
            }

        }while(op != 6);
    }

    public void Menu(){
        int op, numerodeCuenta;


        do
        {
            System.out.println("\nDigite:\n1-Abrir nueva cuenta\n2-Acceder a mi cuenta\n3-Salir\n");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    NuevaCuenta();
                    break;

                case 2:
                    System.out.print("\nDigite el numero de cuenta para acceder: ");
                    numerodeCuenta = scan.nextInt();
                    CuentaBancaria cuenta = Buscar(numerodeCuenta);
                    
                    if(cuenta == null){
                        System.out.print("Numero de cuenta no existente");
                    }
                    else{
                        GestionarCuenta(cuenta);   
                    }
                    break;
                
                case 3:
                    break;
            
                default:
                    break;
            }

        }while(op != 3);
    }
}
