import java.util.*;

public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita un numero");
        int numero = entrada.nextInt();

        System.out.println("Digite el numero al que desea potenciarlo");
        int potencia = entrada.nextInt();

        int potenciado=1;

        for(int i=1;i<=potencia;i++){
            potenciado = potenciado*numero;

        }
        System.out.println("El numero "+numero+" potenciado al "+potencia+" es igual a "+potenciado);

    }
}
