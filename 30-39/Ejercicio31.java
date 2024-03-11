import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese la base del triángulo (mm):");
        float base = scanner.nextFloat();

        System.out.println("Ingrese la altura del triángulo (mm):");
        float altura = scanner.nextFloat();

        
        float areaMm = (base * altura) / 2;

        
        float areaCm = areaMm / 10;
        float areaM = areaMm / 1000000;

        
        System.out.println("El área del triángulo es:");
        System.out.println("• " + areaMm + " mm²");
        System.out.println("• " + areaCm + " cm²");
        System.out.println("• " + areaM + " m²");
    }
}
