import java.util.Scanner;

public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int cantidad = 0;
        
        do {
            System.out.println("Ingrese un numero positivo (ingrese 0 para terminar)");
            numero = entrada.nextInt();
            if (numero > 0) {
                suma += numero;
                cantidad++;
            } else if (numero < 0) {
                System.out.println("Por favor ingrese un numero positivo");
            }
        } while (numero != 0);
        
        if (cantidad > 0) {
            double promedio = (double) suma / cantidad;
            System.out.println("El promedio de los numeros ingresados es " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos");
        }
    }
}