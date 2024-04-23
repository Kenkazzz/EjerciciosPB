import java.util.Scanner;

public class Ejercicio179 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la calificación de Matemáticas:");
        double matematicas = entrada.nextDouble();
    
        System.out.println("Ingresa la calificación de Inglés:");
        double ingles = entrada.nextDouble();
    
        System.out.println("Ingresa la calificación de Español:");
        double espanol = entrada.nextDouble();
    
        double promedio = (matematicas + ingles + espanol) / 3;
    
        int materiasAprobadas = 0;
        int materiasReprobadas = 0;
    
        if (matematicas >= 6) {
        materiasAprobadas++;
        } else {
        materiasReprobadas++;
        }
    
        if (ingles >= 6) {
        materiasAprobadas++;
    } else {
        materiasReprobadas++;
    }
    
    if (espanol >= 6) {
        materiasAprobadas++;
    } else {
        materiasReprobadas++;
    }
    
    String materiaMenorCalificacion = "";
    if (matematicas <= ingles && matematicas <= espanol) {
        materiaMenorCalificacion = "Matemáticas";
    } else if (ingles <= matematicas && ingles <= espanol) {
        materiaMenorCalificacion = "Inglés";
    } else {
        materiaMenorCalificacion = "Español";
    }
    
    System.out.println("Promedio: " + promedio);
    System.out.println("Materias aprobadas: " + materiasAprobadas);
    System.out.println("Materias reprobadas: " + materiasReprobadas);
    System.out.println("Materia con menor calificación: " + materiaMenorCalificacion);
}
    }
