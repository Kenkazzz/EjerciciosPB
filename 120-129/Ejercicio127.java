import java.util.Scanner;

public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el día:");
        int dia = entrada.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = entrada.nextInt();
        System.out.println("Ingrese el año:");
        int año = entrada.nextInt();
        
        String estacion = determinarEstacion(dia, mes);
        
        System.out.println("La estación del año es: " + estacion);
    }
    
    public static String determinarEstacion(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4) || (mes == 5) || (mes == 6 && dia < 21)) {
            return "Primavera";
        } else if ((mes == 6 && dia >= 21) || (mes == 7) || (mes == 8) || (mes == 9 && dia < 21)) {
            return "Verano";
        } else if ((mes == 9 && dia >= 21) || (mes == 10) || (mes == 11) || (mes == 12 && dia < 21)) {
            return "Otoño";
        } else if((mes == 12 && dia >=21) || (mes == 1) || (mes == 2) || (mes ==3 && dia <21)){
            return "Invierno";
        }else{
            return "";
        }
    }

}