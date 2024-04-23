import java.util.Scanner;

public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el monto de la venta: ");
        double montoVenta = entrada.nextDouble();

        if (montoVenta > 1000) {
        double descuento = montoVenta * 0.10;
        double montoNeto = montoVenta - descuento;
        System.out.println("El monto neto de la venta es: " + montoNeto);
        } else {
        System.out.println("No aplica descuento. El monto neto de la venta es: " + montoVenta);
    }


    }
}