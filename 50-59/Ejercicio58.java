import java.util.*;
public class Ejercicio58 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las horas trabajadas");
        int horas = entrada.nextInt();

        System.out.println("Digite el pago por hora");
        double pago = entrada.nextDouble();

        double salario = pago*horas;

        System.out.println("El salario es de "+salario+" pesos");
    }
}
