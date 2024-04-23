import java.util.Scanner;

public class Ejercicio190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] denominaciones = {100, 50, 20, 10, 5, 2, 1};
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el monto total a pagar: ");
            int totalPagar = sc.nextInt();
            System.out.println("Ingrese la cantidad a pagar: ");
            int pago = sc.nextInt();
            
            int cambio = pago - totalPagar;
            
            if (cambio < 0) {
                System.out.println("El monto ingresado es insuficiente, vuelva a intentarlo.");
                i--;
                continue;
            }
            
            System.out.println("El cambio a devolver es: " + cambio);
            
            for (int j = 0; j < denominaciones.length; j++) {
                int cantidadDenominacion = cambio / denominaciones[j];
                cambio %= denominaciones[j];
                if (cantidadDenominacion > 0) {
                    System.out.println("Denominación de " + denominaciones[j] + ": " + cantidadDenominacion);
                }
            }
        }
        
        sc.close();
    }

}