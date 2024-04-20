import java.util.*;
public class Ejercicio53 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un lado del cuadrado");
        double lado = entrada.nextDouble();
        double area = (lado*lado)/2;
        System.out.println("El area del cuadrado es "+area);

    }
}
