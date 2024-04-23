import java.util.Scanner;

public class Ejercicio110 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa la temperatura del día ");
        int temperatura = entrada.nextInt();
        
        if (temperatura >= 0 && temperatura <= 10) {
            System.out.println("Hace mucho frío hoy.");
        } else if (temperatura >= 11 && temperatura <= 18) {
            System.out.println("Hace frío");
        } else if (temperatura >= 19 && temperatura <= 25) {
            System.out.println("El clima es templado");
        } else if (temperatura >= 26 && temperatura <= 40) {
            System.out.println("Hace calor");
        } else {
            System.out.println("La temperatura ingresada no está dentro de los rangos esperados");
        }
    }
}