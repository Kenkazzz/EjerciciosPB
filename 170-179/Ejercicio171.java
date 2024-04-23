import java.util.Scanner;

public class Ejercicio171 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            menuOpciones();
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.print("Ingrese el peso en libras");
                    double libras = entrada.nextDouble();
                    double kilogramos = libras * 0.453592;
                    System.out.println(libras + " libras son " + kilogramos + " kilogramos");
                    break;
                    
                case 2:
                    System.out.print("Ingrese la distancia en millas");
                    double millas = entrada.nextDouble();
                    double kilometros = millas * 1.60934;
                    System.out.println(millas + " millas son " + kilometros + " kilometros");
                    break;
                    
                case 3:
                    System.out.print("Ingrese la cantidad de galones");
                    double galones = entrada.nextDouble();
                    double litros = galones * 3.78541;
                    System.out.println(galones + " galones son " + litros + " litros");
                    break;
                    
                case 4:
                    System.out.print("Ingrese la temperatura en grados Fahrenheit");
                    double fahrenheit = entrada.nextDouble();
                    double celsius = (fahrenheit - 32) / 1.8;
                    System.out.println(fahrenheit + " grados Fahrenheit son " + celsius + " grados Celsius");
                    break;
                default:
                System.out.println("Saliendo...");
                break;
                
            }
        } while(opcion != 5);
        
        
    }
    public static void menuOpciones(){
        System.out.println("Menú de conversión de unidades:");
            System.out.println("1 - Libras a kilogramos");
            System.out.println("2 - Millas a kilometros");
            System.out.println("3 - Galones a litros");
            System.out.println("4 - Fahrenheit a Celsius");
            System.out.println("5 - Salir");
            System.out.print("Ingrese la opcion deseada: ");
    }
    }
