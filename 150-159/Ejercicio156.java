import java.util.Scanner;

public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite una frase");
        String cadena1 = entrada.next();

        System.out.println("Digite otra frase /puede ser la misma");
        String cadena2 = entrada.next();
    
        String cadenaMayusculas1 = cadena1.toUpperCase();
        String cadenaMayusculas2 = cadena2.toUpperCase();
    
        if(cadenaMayusculas1.equals(cadenaMayusculas2)){
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
            }
        }
}