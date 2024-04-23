import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digita el numero a elevar");
        int numero = entrada.nextInt();

        System.out.println("Digite la potencia");
        int potencia = entrada.nextInt();


        double elevar = Math.pow(numero, potencia);

        System.out.println(+numero+" elevado a "+potencia+" es igual a "+elevar);


    }
}