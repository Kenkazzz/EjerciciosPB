import java.util.Scanner;

public class Ejercicio201 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Ingrese las tres calificaciones parciales:");
        double calificacion1 = entrada.nextDouble();
        double calificacion2 = entrada.nextDouble();
        double calificacion3 = entrada.nextDouble();
        
        System.out.println("Ingrese la calificación del examen final:");
        double examenFinal = entrada.nextDouble();
        
        System.out.println("Ingrese la calificación del trabajo final:");
        double trabajoFinal = entrada.nextDouble();
        
    
        double promedioParciales = (calificacion1 + calificacion2 + calificacion3) / 3.0;
        

        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
        
    
        System.out.println("La calificación final es: " + calificacionFinal);
        
        entrada.close();
    }

}