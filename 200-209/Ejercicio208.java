import java.util.Scanner;

public class Ejercicio208 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese las tres calificaciones parciales:");
        double calificacionParcial1 = entrada.nextDouble();
        double calificacionParcial2 = entrada.nextDouble();
        double calificacionParcial3 = entrada.nextDouble();

    
        System.out.println("Ingrese la calificación de prácticas:");
        double calificacionPracticas = entrada.nextDouble();

    
        System.out.println("Ingrese la calificación de asistencia:");
        double calificacionAsistencia = entrada.nextDouble();

    
        double promedioParciales = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3.0;

    
        double calificacionFinal = (0.60 * promedioParciales) + (0.30 * calificacionPracticas) + (0.10 * calificacionAsistencia);

    
        System.out.println("La calificación final en Introducción a la Programación es: " + calificacionFinal);

        entrada.close();
    }
}