import java.util.*;
public class Ejercicio56 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de segundos");
        double segundo = entrada.nextDouble();
        double minutos = segundo/60;
        double horas = segundo/3600;
        System.out.println("la cantidad de segundos es "+segundo+" segundos");
        System.out.println("La cantidad de minutos es "+minutos+" minutos");
        System.out.println("La cantidad de horas es "+horas+" horas");
    }
}
