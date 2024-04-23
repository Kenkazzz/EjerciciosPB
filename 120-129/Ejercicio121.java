import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double numero [] = new double[5];
    double suma = 0;

    for(int i=0; i<numero.length; i++){
        System.out.println("Digite el numero "+(i+1));
        numero[i]= entrada.nextDouble();
        suma +=numero[i];

    }
        System.out.println("La suma de los numeros es igual a "+suma);
    }
}