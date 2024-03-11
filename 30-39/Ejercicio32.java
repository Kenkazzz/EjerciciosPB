import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la base del rectángulo (m):");
        float base = scanner.nextFloat();

        System.out.println("Ingrese la altura del rectángulo (m):");
        float altura = scanner.nextFloat();

        
        float areaM = base * altura;

        
        float areaCm = areaM * 100;
        float areaMm = areaM * 1000000;

        
        System.out.println("El área del rectángulo es:");
        System.out.println("• " + areaM + " m²");
        System.out.println("• " + areaCm + " cm²");
        System.out.println("• " + areaMm + " mm²");
    }
}
