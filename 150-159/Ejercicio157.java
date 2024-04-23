import java.util.Scanner;

public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre en MAYÚSCULA");
        String nombre = entrada.nextLine();

        if (nombre.charAt(0) == 'A') {
            nombre = nombre.toLowerCase();
        }

        System.out.println("Su nombre es " + nombre);
    }
}