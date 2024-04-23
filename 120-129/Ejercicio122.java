import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double numero = 0;
    double suma = 0;

        do {
            System.out.println("Digite un numero (Para finalizar ingrese 0 )");
            numero = entrada.nextDouble();
            if (numero !=0) {
                suma +=numero;
            }

        } while (numero !=0);

        System.out.println("La suma de los numeros fue de "+suma);
    }
}