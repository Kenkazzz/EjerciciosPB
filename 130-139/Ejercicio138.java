import java.util.Scanner;

public class Ejercicio138 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opcion;

    do {
        menu();
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado ");
                double lado = entrada.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.println("El área del cuadrado es " + areaCuadrado);
                break;
            case 2:
                System.out.println("Ingrese la base del triángulo ");
                double base = entrada.nextDouble();
                System.out.println("Ingrese la altura del triángulo ");
                double altura = entrada.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("El área del triángulo es " + areaTriangulo);
                break;
            case 3:
                System.out.println("Ingrese el radio del círculo ");
                double radio = entrada.nextDouble();
                double areaCirculo = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es " + areaCirculo);
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
        }
    } while (opcion != 0);
}
    public static void menu(){
        System.out.println("");
        System.out.println("******CALCULADORA DE ÁREAS******");
        System.out.println("1. Calcular área de un cuadrado");
        System.out.println("2. Calcular área de un triángulo");
        System.out.println("3. Calcular área de un círculo");
        System.out.println("0. Salir");
        System.out.println("Elija una opción: ");
    }

}