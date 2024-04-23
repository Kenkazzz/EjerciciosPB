import java.util.Scanner;

public class Ejercicio173 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        double precio;
        double total = 0;
        int cantidadTotal = 0;

        System.out.println("Introduzca la cantidad vendida ");
        cantidad = entrada.nextInt();
    do{
        System.out.println("Introduzca el precio ");
        precio = entrada.nextDouble();
        
        total += (cantidad * precio);
        cantidadTotal += cantidad;
        System.out.println("Introduzca la cantidad vendida ");
        cantidad = entrada.nextInt();
    }while(cantidad != 0);
    
    System.out.println("Total a pagar $" + total);
    System.out.println("Cantidad total de productos " + cantidadTotal);
    }
}