import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Conoce el area de un rectangulo ");
        System.out.println("");
        System.out.println("Introduce la base del rectangulo");
        float base = entrada.nextFloat();
        System.out.println("Introcuce la altura del rectangulo");
        float altura = entrada.nextFloat();

        float area = (altura*base);
        System.out.println("El area de el rectangulo es "+area);
    }
}
