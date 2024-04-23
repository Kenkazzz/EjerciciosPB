import java.util.Scanner;

public class Ejercicio135 {
    public static void main(String[] args) { 
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de números a comparar ");
    int cnum = entrada.nextInt();
    
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int numero;
    
    for (int i = 0; i < cnum; i++) {
        System.out.println("Ingrese un número ");
        numero = entrada.nextInt();
        
        if (numero > mayor) {
            mayor = numero;
        }
        
        if (numero < menor) {
            menor = numero;
        }
    }
    
    System.out.println("El número mayor es " + mayor);
    System.out.println("El número menor es " + menor);
}
}