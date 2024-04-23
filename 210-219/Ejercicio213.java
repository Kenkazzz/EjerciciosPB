import java.util.Scanner;

public class Ejercicio213 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Ingrese el tiempo de carrera del lunes (en minutos):");
        double tiempoLunes = entrada.nextDouble();

        System.out.println("Ingrese el tiempo de carrera del miércoles (en minutos):");
        double tiempoMiercoles = entrada.nextDouble();

        System.out.println("Ingrese el tiempo de carrera del viernes (en minutos):");
        double tiempoViernes = entrada.nextDouble();

        
        double tiempoPromedio = (tiempoLunes + tiempoMiercoles + tiempoViernes) / 3.0;

    
        System.out.println("El tiempo promedio de carrera en la semana es: " + tiempoPromedio + " minutos");

        entrada.close();
    }
}