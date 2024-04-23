import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double numero = 1;
    int contador = 0;

        do {
            System.out.println("Digite un numero (Para finalizar ingrese 0 )");
            numero = entrada.nextDouble();
            if (numero !=0) {
                contador++;
            }

        } while (numero !=0);

        System.out.println("La cantidad de numeros fue de "+contador);
    }
}