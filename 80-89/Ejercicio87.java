import java.util.Scanner;

public class Ejercicio87 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uno de los lados del triangulo equilatero");
        double lado = entrada.nextInt();

        double area = Math.sqrt(3)/4 * Math.pow(lado, 2);

        if (area>1000) {
            System.out.println("Datos no validos");
        }else{
            System.out.println("El area de este triangulo equilatero es "+area+" m2");
        }

    }
}