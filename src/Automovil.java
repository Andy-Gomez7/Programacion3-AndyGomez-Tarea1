public class Automovil extends Vehiculo{
    private int cantidadPuertas;
    private String pesoMaximo;

    public Automovil(String Modelo, int CantidadRuedas, String Marca, int CantidadPuertas, String PesoMaximo){
        super(Modelo, CantidadRuedas, Marca);
        SetCantidadPuertas(CantidadPuertas);
        SetPesoMaximo(PesoMaximo);
    }

    public void SetCantidadPuertas(int CantidadPuertas){
        cantidadPuertas = CantidadPuertas;
    }

    public int GetCantidadPuertas(){
        return cantidadPuertas;
    }

    public void SetPesoMaximo(String PesoMaximo){
        pesoMaximo = PesoMaximo;
    }

    public String GetPesoMaximo(){
        return pesoMaximo;
    }

    public void print(){
        System.out.println("Marca: "+GetMarca());
        System.out.println("Modelo: "+GetModelo());
        System.out.println("Cantidad de ruedas: "+GetCantidadRuedas());
        System.out.println("Peso maximo: "+GetPesoMaximo());
        System.out.println("Cantidad Puertas: "+GetCantidadPuertas());
        System.out.print("\n\n");
    }
}
