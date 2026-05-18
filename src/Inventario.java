import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    private ArrayList<Producto> inv;
    Scanner scan;
    
    public Inventario(){
        inv = new ArrayList<Producto>();
        scan = new Scanner(System.in);
    }


    private void Agregar(){
        String nombre, codigo;
        int op, stock;
        

        do
        {
            System.out.print("Digite el nombre del producto: ");
            nombre = scan.next();
            System.out.print("\n\n");

            System.out.print("Digite el codigo del producto: ");
            codigo = scan.next();
            System.out.print("\n\n");

            System.out.print("Digite el stock del producto: ");
            stock = scan.nextInt();
            System.out.print("\n\n");

            Producto producto = new Producto(nombre, codigo, stock);
            inv.add(producto);

            System.out.print("\n1-Agregar otro producto\n2-Salir\n");
            op = scan.nextInt();

            if(op == 2){
                break;
            }

            System.out.println("\n");

        }while(true);
    }

    private Producto Retirar(){
        System.out.print("Digite el nombre del producto desea retirar: ");
        String nombreProducto = scan.next();
        System.out.println("\n");

        for(Producto prod : inv){
            if(prod.GetNombre().equals(nombreProducto)){
                inv.remove(prod);
                return prod;
            }
        }
        return null;
    }

    private void ListarProductos(){
        int cantidad = 1;
        for(Producto prod : inv){

            System.out.println("----------------------Producto"+cantidad+"-----------------------------");

            System.out.println("------------------------------------------------------------");
            System.out.print("Nombre: "+prod.GetNombre()+"\n");
            System.out.println("------------------------------------------------------------");
            System.out.println("\n");

            System.out.println("------------------------------------------------------------");
            System.out.print("Codigo: "+prod.GetCodigo()+"\n");
            System.out.println("------------------------------------------------------------");
            System.out.println("\n");

            System.out.println("------------------------------------------------------------");
            System.out.print("Stock: "+prod.GetStock()+"\n");
            System.out.println("------------------------------------------------------------");
            System.out.println("\n");
            
            cantidad++;
        }
    }

    public void Menu(){
        int op;

        do 
        {
            System.out.print("Digite:\n1-Agregar producto\n2-Retirar producto\n3-Listar producto\n");
            op = scan.nextInt();
            System.out.println("\n");

            switch (op) {
                case 1:
                    Agregar();
                    break;

                case 2:
                    Retirar();
                    break;

                case 3:
                    ListarProductos();;
                    break;
                    
                default:
                    break;
            }   
        } while (op != 4);
    }
}