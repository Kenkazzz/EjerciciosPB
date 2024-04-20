import java.util.*;
public class Ejercicio46 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita la cantidad de millas marinas");

        int millas = entrada.nextInt();
        int metros = 1852*millas;
        
        System.out.println("La cantidad de metros de "+millas+" millas marinas es de "+metros);
    }
}
