import java.util.Scanner;

public class Ejercicio77 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el capital del préstamo: ");
        double capital = entrada.nextDouble();
        
        System.out.println("Ingrese el interés anual: ");
        double interesAnual = entrada.nextDouble();
        
        System.out.println("Ingrese el número de años: ");
        int años = entrada.nextInt();
        
        double interesMensual = interesAnual / 12 / 100;
        int numeroPagos = años * 12;
        
        double cuota = (capital * interesMensual) / (1 - Math.pow(1 + interesMensual, -numeroPagos));
        
        System.out.printf("La cuota mensual a pagar es "+ cuota);
    
        double totalAPagar = cuota * numeroPagos;
        
        System.out.printf("El total a pagar será "+totalAPagar);
        
    }

}