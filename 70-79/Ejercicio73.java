import java.util.*;

public class Ejercicio73 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite el sueldo ");
        double sueldo = entrada.nextDouble();
        double descuento = 0;
        
        if (sueldo <= 1000) {
            descuento = sueldo * 0.1;
        } else if (sueldo > 1000 && sueldo <= 2000) {
            descuento = sueldo * 0.05;
        } else {
            descuento = sueldo * 0.03;
        }
        
        double sueldoNeto = sueldo - descuento;
        
        System.out.println("El descuento es: " + descuento);
        System.out.println("El sueldo neto es: " + sueldoNeto);
    }
}