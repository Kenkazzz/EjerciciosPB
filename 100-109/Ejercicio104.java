import java.util.Scanner;

public class Ejercicio104 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingrese el número para encontrar la raíz: ");
    double numero = entrada.nextDouble();

    System.out.println("Ingrese el índice de la raíz: ");
    double indice = entrada.nextDouble();
    
    double raiz = Math.pow(numero, 1/indice);
    
    System.out.println("La raíz de " + numero + " al " + indice + " es: " + raiz);
}
}