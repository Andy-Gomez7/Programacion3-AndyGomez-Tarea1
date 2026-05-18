public class Motocicleta extends Vehiculo {
    private String tipoManillar;
    private String tipoCaballete;

    public Motocicleta(String Modelo, int CantidadRuedas, String Marca, String TipoManillar, String TipoCaballete){
        super(Modelo, CantidadRuedas, Marca);
        SetTipoCaballete(TipoCaballete);
        SetTipoManillar(TipoManillar);
    }

   public void SetTipoCaballete(String TipoCabellete){
        tipoCaballete = TipoCabellete;
    } 

    public String GetTipoCaballete(){
        return tipoCaballete;
    } 

   public void SetTipoManillar(String TipoManillar){
        tipoManillar = TipoManillar;
    } 

    public String GetTipoManillar(){
        return tipoManillar;
    }

    public void print(){
        System.out.println("Marca: "+GetMarca());
        System.out.println("Modelo: "+GetModelo());
        System.out.println("Cantidad de ruedas: "+GetCantidadRuedas());
        System.out.println("Tipo caballete: "+GetTipoCaballete());
        System.out.println("Tipo manillar: "+GetTipoManillar());
        System.out.print("\n\n");
    }
}
