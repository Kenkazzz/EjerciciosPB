import java.util.Scanner;

public class Ejercicio85 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero cualquiera");
        int numero = entrada.nextInt();

        if (numero % 2 ==0) {
            System.out.println("El numero es par");
        }else if(numero % 2 !=0) {
            System.out.println("El numero es impar");
        }else{
            System.out.println("El numero es 0");
        }
    }
}