import java.util.Scanner;

public class Ejercicio209 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número de reprobados:");
        int reprobados = entrada.nextInt();

        System.out.println("Ingrese el número de aprobados:");
        int aprobados = entrada.nextInt();

        System.out.println("Ingrese el número de sobresalientes:");
        int sobresalientes = entrada.nextInt();

        int totalEstudiantes = reprobados + aprobados + sobresalientes;

        double porcentajeReprobados = (reprobados * 100.0) / totalEstudiantes;
        double porcentajeAprobados = (aprobados * 100.0) / totalEstudiantes;
        double porcentajeSobresalientes = (sobresalientes * 100.0) / totalEstudiantes;
    
        System.out.println("Datos estadísticos de la asignatura:");
        System.out.println("Número total de estudiantes: " + totalEstudiantes);
        System.out.println("Porcentaje de reprobados: " + porcentajeReprobados + "%");
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Porcentaje de sobresalientes: " + porcentajeSobresalientes + "%");

        entrada.close();
    }
}