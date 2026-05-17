import java.util.Scanner;

public class Tarea1 {
    public void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int op;

        do
        {
            System.out.println("Digite una opcion:\n1-Calculadora\n2-Numero par o impar\n3-Tabla de multiplicar\n4-Contador de vocales\n5-Promedio de notas\n6-Clase Estudiante\n7-Cuenta bancaria\n8-Herencia de vehículos\n9-Matriz 3x3\n10-Sistema básico de inventario\n11-Salir de la aplicación\n");

            op = scan.nextInt();

            switch (op){
                case 1:
                    Calculadora();
                    break;
                
                case 2:
                    ParImpar();
                    break;

                case 3:
                    TablaMultiplicar();
                    break;
                
                case 4:
                    ContadorVocales();
                    break;

                case 11:
                    break;

                default:
                    System.out.print("Opcion no valida");
                    break;
            }
        }while(op != 11);
        
    }

    public static void Calculadora(){
        String operacion = " ";
        String[] valores;
        Double resultado = 0.0;
        Scanner scan = new Scanner(System.in);
        char op;

        do{
            System.out.println("\n¿Que operacion desea realizar? \nSuma: +\nResta: -\nMultiplicacion: *\nDivision: /\nlimpiar operacion: 1\nSalir: 2\n");
            op = scan.next().charAt(0);
            
            if(op == '1'){
                resultado = 0.0;
                continue;
            }
            if(op == '2'){
                break;
            }

            System.out.print(resultado);
            operacion = scan.next();

            switch (op) {
                case '+':
                    valores = operacion.split("\\+");
                    
                    for(String valor : valores){

                        if(valor.isEmpty())
                            continue;
                        resultado += Integer.parseInt(valor);
                    }
                    break;
                
                case '-':
                    valores = operacion.split("\\-");
                    for(String valor : valores){

                        if(valor.isEmpty())
                            continue;
                        resultado -= Integer.parseInt(valor);
                    }
                    break;

                case '*':
                    if(resultado == 0.0)
                        resultado+=1;
                    
                    valores = operacion.split("\\*");
                    
                    for(String valor : valores){

                        if(valor.isEmpty())
                            continue;
                        resultado *= Integer.parseInt(valor);
                    }
                    break;

                case '/':
                    if(resultado == 0.0)
                        resultado+=1;

                    valores = operacion.split("\\/");
                    for(String valor : valores){

                        if(valor.isEmpty())
                            continue;
                        
                        resultado /= Double.parseDouble(valor);
                    }
                    break;

                default:
                    System.out.print("Opcion no valida");
                    break;
            }
        }while(op != '2');
    }

    public static void ParImpar(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite un numero: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("Su numero es par\n");
        }
        else{
            System.out.println("Su numero es impar\n");
        }
    }

    public static void TablaMultiplicar(){
        Scanner scan = new Scanner(System.in);
        int tamano;
        int numero;
        int contador = 0;
        int op;

        
        do
        {

            System.out.println("Digite:\n1-Crear otra tabla\n2-Salir");
            op = scan.nextInt();

            if(op == 2){
                break;
            }

            System.out.print("Digite el numero de la tabla: ");
            numero = scan.nextInt();
            System.out.print("Digite el tamaño de la tabla: ");
            tamano = scan.nextInt();

            System.out.println("\n"+"Tabla del "+numero+"\n");

            do
            {
                System.out.print(numero +"x"+contador+" = ");
                System.out.println(contador * numero);
            
                contador++;

            }while(contador <= tamano);

        }while(op != 2);
        System.out.println();
    }

    public static void ContadorVocales(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite una palabra: ");
        String palabra = scan.next();
        int contador = 0;

        for(int i = 0; i < palabra.length(); i++){
            if(Character.isLetter(palabra.charAt(i))){
                if(Character.toLowerCase(palabra.charAt(i)) == 'a' || Character.toLowerCase(palabra.charAt(i)) == 'e' || Character.toLowerCase(palabra.charAt(i)) == 'i' || Character.toLowerCase(palabra.charAt(i)) == 'o' || Character.toLowerCase(palabra.charAt(i)) == 'u'){
                    contador++;
                }
            }
        }   

        System.out.println("La cantidad de vocales de esta palabra es: "+contador+"\n");
    }
} 