import java.util.*;
public class Ejercicio55 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = entrada.nextInt();

         int suma=0;

         for(int i=1;i<=numero;i++){
            int calculo = numero%i;
            if (calculo==0) {
                suma++;
            }
         }
         if (suma<=2) {
            System.out.println("Su numero es primo");
         }else{
            System.out.println("Su numero no es primo");
         }
    }
}
