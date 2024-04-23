import java.util.Scanner;
public class Ejercicio186 {
    public static void main(String[] abc) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena = entrada.nextLine();

        String cadenaAlRevez = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaAlRevez += cadena.charAt(i);
        }
        System.out.println("La cadena al revez es: " + cadenaAlRevez);
        entrada.close();
    }

}