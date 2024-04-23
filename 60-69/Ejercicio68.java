package EjerciciosPB;

import java.util.*;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita un numero");
        int numero = entrada.nextInt();

        int suma = 0;

        for(int i=1;i<=numero;i++){
            suma = suma+factorial(i);
        }
        System.out.println("La suma de los factoriales es de "+suma);

    }
    public static int factorial(int numero){
        int factor=1;
        for(int i=1;i<=numero;i++){
            factor = factor*i;
        }
        return factor;
    }
}