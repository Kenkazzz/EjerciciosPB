import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejercicio188 {
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$";
    public static void main(String[] abc) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un Email:");
        String email = entrada.nextLine();

        if (emailValido(email)) {
            System.out.println(email + " es un Email valido :)");
        } else {
            System.out.println(email + " no es un Email valido :(");
        }
        entrada.close();
    }
    private static boolean emailValido(String email) {
        Pattern patron = Pattern.compile(EMAIL_REGEX);
        Matcher comparador = patron.matcher(email);
        return comparador.matches();
    }
}
    