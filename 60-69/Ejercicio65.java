import java.util.*;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita un numero");
        int numero = entrada.nextInt();

        int suma=0;

        for(int i=1;i<=numero;i++){
            suma =suma+i;

        }
        System.out.println("La suma de todos los numeros que lleva "+numero+" es igual a "+suma);

    }
}
