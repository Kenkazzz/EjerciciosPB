import java.util.Scanner;

public class Ejercicio160 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        System.out.println("Introduce un tiempo en segundos ");
        int segundos = entrada.nextInt();

        int dias = segundos / 86400;
        segundos = segundos % 86400;
            
        int horas = segundos / 3600;
        segundos = segundos % 3600;
            
        int minutos = segundos / 60;
        segundos = segundos % 60;
            
        System.out.println("Días : " + dias);
        System.out.println("Horas : " + horas);
        System.out.println("Minutos : " + minutos);
        System.out.println("Segundos : " + segundos);
            
    }
}
