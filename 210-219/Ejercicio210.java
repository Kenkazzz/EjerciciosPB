import java.util.Scanner;

public class Ejercicio210 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    
        System.out.println("Ingrese el número de reprobados:");
        int reprobados = entrada.nextInt();

        System.out.println("Ingrese el número de aprobados:");
        int aprobados = entrada.nextInt();

        System.out.println("Ingrese el número de sobresalientes:");
        int sobresalientes = entrada.nextInt();

    
        int totalEstudiantes = reprobados + aprobados + sobresalientes;

    
        double porcentajeSuperados = ((double)(aprobados + sobresalientes) / totalEstudiantes) * 100;

        
        double porcentajeReprobados = ((double)reprobados / totalEstudiantes) * 100;
        double porcentajeAprobados = ((double)aprobados / totalEstudiantes) * 100;
        double porcentajeNotables = ((double)(sobresalientes - 1) / totalEstudiantes) * 100;
        double porcentajeSobresalientes = ((double)sobresalientes / totalEstudiantes) * 100;

    
        System.out.println("Datos estadísticos de la asignatura:");
        System.out.println("Porcentaje de alumnos que han superado la asignatura: " + porcentajeSuperados + "%");
        System.out.println("Porcentaje de reprobados: " + porcentajeReprobados + "%");
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Porcentaje de notables: " + porcentajeNotables + "%");
        System.out.println("Porcentaje de sobresalientes: " + porcentajeSobresalientes + "%");

        entrada.close();
    }
}