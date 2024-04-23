import java.util.Scanner;

public class Ejercicio137 {
    public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese el valor de A ");
    int A = entrada.nextInt();

    while (A==0) {
        System.out.println("El valor de A no puede ser cero, Digite otro valor");
        A = entrada.nextInt();
    }

    System.out.println("Ingrese el valor B");
    int B = entrada.nextInt();
    
    System.out.println("Ingresa el valor de C");
    int C = entrada.nextInt();

    double x1= (-B + Math.sqrt(Math.pow(B, 2) - (4*A*C)))/ (2*A);
    double x2= (-B - Math.sqrt(Math.pow(B, 2) - (4*A*C)))/ (2*A);

    System.out.println("Los valores de x pueden ser "+x1+" o "+x2);

}
}