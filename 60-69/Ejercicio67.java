package EjerciciosPB;


import java.util.*;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita un numero que desee conocer su factorial");
        int numero = entrada.nextInt();

        int factorial=1;

        for(int i=1;i<=numero;i++){
            factorial = factorial*i;

        }
        System.out.println("El factorial de  "+numero+" es igual a "+factorial);

    }
}