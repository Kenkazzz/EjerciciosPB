import java.util.Scanner;

public class Ejercicio151 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite una frase");
        String frase = entrada.nextLine();

        if (frase.length()>10) {
            System.out.println("La frase es : "+frase);
        }
    }
}