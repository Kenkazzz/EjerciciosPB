import java.util.Scanner;

public class Ejercicio165 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de horas ");
    int horas = entrada.nextInt();

    System.out.println("Ingrese la cantidad de minutos ");
    int minutos = entrada.nextInt();

    System.out.println("Ingrese la cantidad de segundos ");
    int segundos = entrada.nextInt();

    int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

    System.out.println("El total de segundos es " + totalSegundos);
    }

}