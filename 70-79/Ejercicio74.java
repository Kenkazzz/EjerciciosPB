import java.util.*;

public class Ejercicio74 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un primer numero");
        double num1 = entrada.nextDouble();

        System.out.println("Digite un segundo numero");
        double num2 = entrada.nextDouble();

        System.out.println("Digite un tercer numero");
        double num3 = entrada.nextDouble();

        if (num1>num2 && num2>num3) {
            System.out.println(+num1+" "+num2+" "+num3);
        }else if (num1>num3 && num3>num2) {
            System.out.println(+num1+" "+num3+" "+num2);
        }else if (num2>num3 && num3>num1) {
            System.out.println(+num2+" "+num3+" "+num1);
        }else if (num2>num1 && num1>num3) {
            System.out.println(num2+" "+num1+" "+num3);
        }else if (num3>num2 && num2>num1) {
            System.out.println(+num3+" "+num2+" "+num1);
        }else if (num3>num1 && num1>num2) {
            System.out.println(+num3+" "+num1+" "+num2);
        }

    }
    
}