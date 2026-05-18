public class Camion extends Automovil{
    private String tipoChasisDistribuidor;

    public Camion(String Modelo, int CantidadRuedas, String Marca, int CantidadPuertas, String PesoMaximo, String TipoChasisDistribuidor){
        super(Modelo, CantidadRuedas, Marca, CantidadPuertas, PesoMaximo);
        SetTipoChasisDistribuidor(TipoChasisDistribuidor);
    }

    public void SetTipoChasisDistribuidor(String TipoChasisDistribuidor){
        tipoChasisDistribuidor = TipoChasisDistribuidor;
    }

    public String GetTipoChasisDistribuidor(){
        return tipoChasisDistribuidor;
    }

    public void print(){
        System.out.println("Marca: "+GetMarca());
        System.out.println("Modelo: "+GetModelo());
        System.out.println("Cantidad de ruedas: "+GetCantidadRuedas());
        System.out.println("Peso maximo: "+GetPesoMaximo());
        System.out.println("Cantidad Puertas: "+GetCantidadPuertas());
        System.out.println("Tipo de Chasis Distribuidor: "+GetTipoChasisDistribuidor());
        System.out.print("\n\n");
    }
}
