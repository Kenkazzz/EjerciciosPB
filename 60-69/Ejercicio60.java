import java.util.Scanner;
public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int contador = 0;
        
        System.out.println("Ingrese números (ingrese 0 para terminar):");
        
        do {
            numero = entrada.nextInt();
            if(numero > 0) {
                contador++;
            }
        } while(numero != 0);
        
        System.out.println("Cantidad de números mayores que cero leídos: " + contador);
        
        sc.close();
    }
}
