import java.util.Scanner;

public class Ejercicio119 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intentos = 0;
        String password = "passwd";

        while (intentos < 3) {
            System.out.println("Ingrese la contraseña:");
            String contraseña = entrada.nextLine();
    
            if (contraseña.equals(password)) {
                System.out.println("Contraseña aceptada");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                intentos++;
            }
        }
        if (intentos == 3) {
            System.out.println("Intentos excedidos");
        }
    }
}