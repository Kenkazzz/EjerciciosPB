import java.util.Scanner;

public class Ejercicio166 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su peso en kg ");
        double peso = entrada.nextDouble();
        
        System.out.println("Ingrese su estatura en metros: ");
        double estatura = entrada.nextDouble();
        
        double imc = peso / (estatura * estatura);
        
        System.out.println("Su IMC es " + imc);
        
    }
}