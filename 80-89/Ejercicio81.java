import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el radio del circulo");
        double radio = entrada.nextDouble();

        double pi = Math.PI;

        double area = pi* Math.pow(radio, 2);

        if (area>5000) {
            System.out.println("DATOS ERRONEOS (El area es mayor a 5000)");
        }else{
            System.out.println(area);
        }
    }
}