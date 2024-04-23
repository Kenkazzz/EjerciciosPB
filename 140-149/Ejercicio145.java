import java.util.Scanner;

public class Ejercicio145 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingrese el primer lado del triángulo:");
    double lado1 = entrada.nextDouble();

    System.out.println("Ingrese el segundo lado del triángulo:");
    double lado2 = entrada.nextDouble();

    System.out.println("Ingrese el tercer lado del triángulo:");
    double lado3 = entrada.nextDouble();
    
    if (esTriangulo(lado1, lado2, lado3)) {
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triángulo es equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
    } else {
        System.out.println("Los lados ingresados no forman un triángulo");
    }
}

public static boolean esTriangulo(double a, double b, double c) {
    if(a + b > c && a + c > b && b + c > a){
        return true;
    }else{
        return false;
    }
}
}