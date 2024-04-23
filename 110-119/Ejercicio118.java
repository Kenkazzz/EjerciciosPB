import java.util.Scanner;

public class Ejercicio118 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sumaDeMontos = 0;

        for(int i=1; i<=10; i++){
            System.out.println("Digite el costo del articulo "+(i));
            double monto = entrada.nextDouble();
            sumaDeMontos += monto;
        }
        System.out.println("El monto total a pagar es "+sumaDeMontos+" pesos");
    }
}