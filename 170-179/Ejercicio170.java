import java.util.Scanner;

public class Ejercicio170 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el numerador de la primera fraccion");
        int numerador1 = entrada.nextInt();

        System.out.println("Digite el numerador de la segunda fraccion");
        int numerador2 = entrada.nextInt();

        System.out.println("Digite el denominador comun de ambas fracciones");
        int denominador = entrada.nextInt();

        int suma = numerador1+numerador2;
        int resta = numerador1-numerador2;

        System.out.println("El resultado de la suma es "+suma+"/"+denominador);
        System.out.println("El resultado de la resta es "+resta+"/"+denominador);

    }
}