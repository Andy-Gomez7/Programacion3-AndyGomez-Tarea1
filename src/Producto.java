public class Producto {
    private String nombre;    
    private String codigo;
    private int stock;

    public Producto(){
    }

    public Producto(String Nombre, String Codigo, int Stock){
        SetNombre(Nombre);
        SetCodigo(Codigo);
        SetStock(Stock);
    }

    public void SetNombre(String Nombre){
        nombre = Nombre;
    } 

    public String GetNombre(){
        return nombre;
    }

    public void SetCodigo(String Codigo){
        codigo = Codigo;
    } 

    public String GetCodigo(){
        return codigo;
    }

    public void SetStock(int Stock){
        stock = Stock;
    } 

    public int GetStock(){
        return stock;
    }
}
