import java.util.Scanner;
public class Ejercicio177 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digita el numero que deseas descomponer ");
        int numero = entrada.nextInt();

        System.out.println("Los factores primos de "+numero+" son ");
        factoresPrimos(numero);

    }
    public static void factoresPrimos(int num){
        for(int i=2; i<=num; i++){
            while (num % i == 0) {
                System.out.println(i);
                num = num/i;
            }
            if (num==1) {
                break;
            }

        }
    }
}