import java.util.Scanner;

public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite su consumo");
        double consumo = entrada.nextDouble();
        double eficiencia = (consumo / 10000) * 100;

        if (eficiencia >= 80 && eficiencia <= 100) {
            System.out.println("CONSUMO MEDIO");
        } else {
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        }
    }

}