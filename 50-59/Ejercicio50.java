import java.util.*;
public class Ejercicio50 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        double num1 = entrada.nextDouble();

        System.out.println("Digite el segundo numero");
        double num2 = entrada.nextDouble();

        System.out.println("Digite el tercer numero");
        double num3 = entrada.nextDouble();

        double multiplicacion = (num1*num2*num3);
        double suma = (num1+num2+num3);

        System.out.println("La suma de "+num1+" + "+num2+" + "+num3+" es igual a "+suma);
        System.out.println("La multiplicacion es igual a "+multiplicacion);
    }
}
