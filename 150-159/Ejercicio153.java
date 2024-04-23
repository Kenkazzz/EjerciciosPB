import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite una frase");
        String frase = entrada.nextLine();

        System.out.println("Digite una segunda frase");
        String frase2 = entrada.nextLine();

        if (frase.equals(frase2)) {
            System.out.println("Las frases son iguales");
        }else{
            if (frase.compareTo(frase2) > 0) {
                System.out.println("La cadena '" + frase + "' es mayor alfabéticamente que '" + frase2 + "'.");
            } else {
                System.out.println("La cadena '" + frase2 + "' es mayor alfabéticamente que '" + frase + "'.");
            }
        }
    }
}