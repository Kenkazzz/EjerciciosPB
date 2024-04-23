import java.util.*;

public class Ejercicio168 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa las 5 vocales en desorden");
        String vocales = entrada.nextLine();
        
        char[] vocalesArreglo = vocales.toCharArray();
        
        Arrays.sort(vocalesArreglo);
        
        System.out.println("Vocales ordenadas:");
        for (char vocal : vocalesArreglo) {
            System.out.print(vocal + " ");
        }
    }
}