public class Vehiculo {
    private String modelo;
    private int cantidadRuedas;
    private String marca;
    
    public Vehiculo(){
    }

    public Vehiculo(String Modelo, int CantidadRuedas, String Marca){
        SetModelo(Modelo); 
        SetCantidadRuedas(CantidadRuedas);
        SetMarca(Marca);
    }

    public void SetModelo(String Modelo){
        modelo = Modelo;
    } 

    public String GetModelo(){
        return modelo;
    }

   public void SetCantidadRuedas(int CantidadRuedas){
        cantidadRuedas = CantidadRuedas;
    }
    
    public int GetCantidadRuedas(){
        return cantidadRuedas;
    }

    public void SetMarca(String Marca){
        marca = Marca;
    } 

    public String GetMarca(){
        return marca;
    }
}