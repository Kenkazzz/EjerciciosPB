import java.util.Scanner;

public class Ejercicio78 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el monto: ");
        double monto = entrada.nextDouble();
        
        double descuento;
        
        if(monto > 10000) {
            descuento = monto * 0.20;
        } else {
            descuento = monto * 0.10;
        }
        
        System.out.println("El descuento es: " + descuento);
    }
}