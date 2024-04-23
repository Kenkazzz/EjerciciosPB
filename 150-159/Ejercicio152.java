import java.util.Scanner;
public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite una cadena de caracteres");
        String cadena = entrada.nextLine();

        char [] cadenaCaracteres = new char[cadena.length()];

        for(int i=0; i<cadena.length(); i++){
            cadenaCaracteres[i] = cadena.charAt(i);
        }

        char [] cadenaCopia = new char[cadenaCaracteres.length];

        for (int i=0; i < cadenaCaracteres.length; i++) {
            cadenaCopia[i] = cadenaCaracteres[i];
        }

        for (char c : cadenaCopia) {
            System.out.println(c);
        }
    }
}