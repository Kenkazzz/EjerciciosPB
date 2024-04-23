import java.util.Scanner;

public class Ejercicio212 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double gananciaVendedor = 0.12;
        double impuesto = 0.06;

        System.out.println("Ingrese el coste total del automóvil:");
        double costoTotal = entrada.nextDouble();
    
        double ganancia = costoTotal * gananciaVendedor;
    
        double impuestos = costoTotal * impuesto;
    
        double costeParaConsumidor = costoTotal + ganancia + impuestos;
    
        System.out.println("El coste para el consumidor es: " + costeParaConsumidor + " Bs.");

        entrada.close();
    }
}