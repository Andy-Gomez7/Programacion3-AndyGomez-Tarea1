import java.util.Scanner;

public class CuentaBancaria {

    private String nombre;
    private String tipoCuenta;
    private Double saldo;
    private int numerodeCuenta;
    private Banco banco;
    Scanner scan;

    public CuentaBancaria(Banco Banco){
        scan = new Scanner(System.in);
        banco = Banco;
    }

    public CuentaBancaria(String Nombre, String TipoCuenta, Double Saldo, int NumerodeCuenta, Banco Banco){
        SetNombre(Nombre);
        SetTipoCuenta(TipoCuenta);
        SetSaldo(Saldo);
        scan = new Scanner(System.in);
        banco = Banco;
        SetNumerodeCuenta(NumerodeCuenta);
    }

    public String GetNombre(){
        return nombre;
    }

    public String GetTipoCuenta(){
        return tipoCuenta;
    }

    public Double GetSaldo(){
        return saldo;
    }

    public int GetNumerodeCuenta(){
        return numerodeCuenta;
    }

    public void SetNombre(String Nombre){
        nombre = Nombre;
    }

    public void SetTipoCuenta(String TipoCuenta){
        tipoCuenta = TipoCuenta;
    }

    public void SetSaldo(Double Saldo){
        saldo = Saldo;
    }

    public void SetNumerodeCuenta(int NumerodeCuenta){
        numerodeCuenta = NumerodeCuenta;
        while(banco.Buscar(numerodeCuenta) != null){
            System.out.print("Numero de cuenta existente digite un nuevo numero de cuenta: ");
            NumerodeCuenta = scan.nextInt();
            numerodeCuenta = NumerodeCuenta;
        }
        System.out.print("\n");
        
    }
    
    public void Deposito(Double cantidad){
        this.saldo += cantidad;
    }

    public double Retiro(Double retiro){
        if(saldo < retiro){
            System.out.println("No posee el monto solicitado en su cuenta");
        }
        else{
            this.saldo -= retiro;   
        }
        System.out.print("\n");
        return retiro;
    }

    public void Transferencia(){
        CuentaBancaria receptor;

        System.out.print("Digite el numero de cuenta al que quiere transferir: ");
        int numeroCuenta = scan.nextInt();
        receptor = banco.Buscar(numeroCuenta);
        System.out.print("\n");

        if(receptor == null){
            System.out.println("Numero de cuenta no encontrado");
            return;
        }

        if(this.GetNumerodeCuenta() == numeroCuenta){
            System.out.println("No puede digitar su propio numero de cuenta");
            return;
        }

        System.out.print("Digite la cantidad que quiere transferir: ");
        double retiro = scan.nextDouble();
        System.out.print("\n");
        this.Retiro(retiro);
        receptor.Deposito(retiro);
    }    
}