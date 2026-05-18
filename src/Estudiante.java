public class Estudiante {
    private String nombre;
    private String matricula;
    private String ciudad;
    private String direccion;
    private String cedula;
    
    public Estudiante(){
    }

    public Estudiante(String Nombre, String Matricula, String Ciudad, String Direcion, String Cedula){
    
        SetNombre(Nombre);
        SetMatricula(Matricula);
        SetCiudad(Ciudad);
        SetDireccion(Direcion);
        SetCedula(Cedula);
    }

    public void SetNombre(String Nombre){
        nombre = Nombre;
    } 

    public String GetNombre(){
        return nombre;
    }

    public void SetMatricula(String Matricula){
        matricula = Matricula;
    }
    
    public String GetMatricula(){
        return matricula;
    }

    public void SetCiudad(String Ciudad){
        ciudad = Ciudad;
    } 

    public String GetCiudad(){
        return ciudad;
    }

    public void SetDireccion(String Direccion){
        direccion = Direccion;
    }

    public String GetDireccion(){
        return direccion;
    } 

    public void SetCedula(String Cedula){
        cedula = Cedula;
    }
    
    public String GetCedula(){
        return cedula;
    }

    public void print(){
        System.out.println("Nombre: "+GetNombre());
        System.out.println("Matricula: "+GetMatricula());
        System.out.println("Ciudad: "+GetCiudad());
        System.out.println("Direccion: "+GetMatricula());
        System.out.println("Cedula: "+GetCedula());
        System.out.print("\n\n");
    }
}