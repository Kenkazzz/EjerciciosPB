import java.util.Scanner;

public class Ejercicio93 {
     public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

       System.out.println("Digite un tiempo en minutos ");
       int minutos = entrada.nextInt();

       int horas = minutos/60;

       int segundos = minutos*60;

       System.out.println("El tiempo en horas de "+horas+" horas");
       System.out.println("El tiempo en minutos es de "+minutos+" minutos");
       System.out.println("El tiempo en segundos es "+segundos+" segundos");
    }
}