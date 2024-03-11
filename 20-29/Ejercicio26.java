import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del cateto adyacente:");
        double catetoAdyacente = scanner.nextDouble();

        System.out.println("Ingrese el valor del cateto opuesto:");
        double catetoOpuesto = scanner.nextDouble();

        double cuadradoHipotenusa = (catetoAdyacente * catetoAdyacente) + (catetoOpuesto * catetoOpuesto);

        System.out.println("El cuadrado de la hipotenusa es: " + cuadradoHipotenusa);
    }
}
