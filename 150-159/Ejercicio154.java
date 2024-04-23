import java.util.Scanner;

public class Ejercicio154 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase = "Hola que tan ";

        System.out.println("Escribe tu nombre ");
        String nombre = entrada.next();

        System.out.println(frase+nombre);
    }
}