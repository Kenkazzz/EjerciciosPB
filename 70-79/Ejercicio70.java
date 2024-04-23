import java.util.*;

public class Ejercicio70 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();
        
        int resultado = 0;
        int signo = 1;

        for(int i=1; i<=numero; i++) {
            resultado = resultado+ (signo * i);
            signo = signo * -1;
        }

        System.out.println("El resultado de esta expresion es " + resultado);
    }
}