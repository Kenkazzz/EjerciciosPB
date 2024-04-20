import java.util.*;
public class Ejercicio54 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite los centimetros");
        double centi = entrada.nextDouble();
        double pulgadas = centi/2.54;
        System.out.println("En "+centi+" centimetros hay "+pulgadas+" pulgadas");
    }
}
