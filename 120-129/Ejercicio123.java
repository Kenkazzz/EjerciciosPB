import java.util.Scanner;

public class Ejercicio123 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el capital inicial ");
        double capital = entrada.nextDouble();
        
        System.out.println("Ingrese la tasa de interés diaria (%) ");
        double tasaInteres = entrada.nextDouble();
        
        System.out.println("Ingrese el número de días ");
        int dias = entrada.nextInt();
        
        double interesSimple = (capital * tasaInteres / 100) * dias;
        double capitalFinal = capital + interesSimple;
        
        System.out.println("El capital final es de " + capitalFinal+" pesos");
        
    }
}