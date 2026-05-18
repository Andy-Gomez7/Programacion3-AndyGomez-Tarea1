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
        nombre = "";
        tipoCuenta = "";
        saldo = 0.0;
        SetNumerodeCuenta(numerodeCuenta);
    }

    public CuentaBancaria(String Nombre, String TipoCuenta, Double Saldo, int NumerodeCuenta, Banco Banco){
        banco = Banco;
        SetNombre(Nombre);
        SetTipoCuenta(TipoCuenta);
        SetSaldo(Saldo);
        scan = new Scanner(System.in);
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
        if(cantidad <= 0)
            return;
        this.saldo += cantidad;
    }

    public Boolean Retiro(Double retiro){
        if(retiro <= 0){
            System.out.println("Monto no valido");
            return false;
        }
        if(saldo <= retiro){
            System.out.println("No posee el monto solicitado en su cuenta");
            return false;
        }
        else{
            this.saldo -= retiro;   
        }
        System.out.print("\n");
        return true;
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
        Boolean cantidad = this.Retiro(retiro);

        if(cantidad == false){
            return;
        }

        receptor.Deposito(retiro);
    }    
}