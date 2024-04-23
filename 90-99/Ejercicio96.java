import java.util.Scanner;

public class Ejercicio96 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        System.out.println("Palabras de la frase:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        System.out.println("Número de letras de cada palabra:");
        for (String palabra : palabras) {
            System.out.println(palabra + " tiene " + palabra.length() + " letras");
        }

}

}