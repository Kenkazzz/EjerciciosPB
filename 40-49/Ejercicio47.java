import java.util.*;
public class Ejercicio47 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad comprada");
        int cantidad = entrada.nextInt();

        System.out.println("Digite el valor del producto");
        double precio = entrada.nextDouble();

        double preciototal = cantidad*precio;

        System.out.println("Digite el descuento");
        int descuento = entrada.nextInt();

        double porcentaje = descuento/100;

        double preciodescuento= (preciototal-(preciototal*porcentaje));

        System.out.println("El precio con descuento es "+preciodescuento);

        System.out.println("Digite el pago");

        double pago = entrada.nextDouble();
        double resto = pago-preciodescuento;

        System.out.println("El devuelto es de "+resto+" pesos");


    }
}
