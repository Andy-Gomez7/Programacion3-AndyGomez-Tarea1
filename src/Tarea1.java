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

                case 11:
                    break;
                
                case 2:
                    ParImpar();
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
            System.out.println("\n¿Que operacion desea realizar? \nSuma: +\nResta: -\nMultiplicacion: *\nDivision: /\nlimpiar operacion: 1\nFinalizar: 2\n");
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
} 