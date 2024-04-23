import java.util.Scanner;

public class Ejercicio89 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la distancia en metros");
        double metros = entrada.nextDouble();

        double kilometros = metros/1000;

        System.out.println("Lacantidad de kilometros es "+kilometros+" km");
    }
}