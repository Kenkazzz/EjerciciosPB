import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el monto de la compra
        System.out.println("Ingrese el monto de la compra: ");
        float monto = scanner.nextFloat();

        // Calcular el descuento
        float descuento = 0;
        if (monto > 1000) {
            descuento = monto * 0.1f;
        } else if (monto > 500 && monto <= 1000) {
            descuento = monto * 0.2f;
        }

        // Calcular el monto final
        float montoFinal = monto - descuento;

        // Mostrar los resultados
        System.out.println("Monto de la compra: $" + monto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Monto final: $" + montoFinal);
    }
}

