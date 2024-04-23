import java.util.Scanner;

public class Ejercicio82 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero cualquiera");
        double numero = entrada.nextDouble();

        if (numero>0) {
            System.out.println("El numero es positivo");
        }else if(numero<0) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }
    }
}