import java.util.Scanner;

public class Ejercicio169 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su año de nacimiento ");
        int añoNacimiento =entrada.nextInt();
        
        int edad = 2024 - añoNacimiento;
        
        if (edad >= 1 && edad <= 12) {
            System.out.println("Usted esta en la etapa de niñez (1-12 años)");
        } else if (edad >= 13 && edad <= 18) {
            System.out.println("Usted esta en la etapa de adolescencia (13-18 años)");
        } else if (edad >= 19 && edad <= 30) {
            System.out.println("Usted esta en la etapa de juventud (19-30 años)");
        } else if (edad >= 31 && edad <= 60) {
            System.out.println("Usted esta en la etapa de adultez (31-60 años)");
        } else if (edad > 60 && edad <= 100) {
            System.out.println("Usted esta en la etapa de vejez (60-100 años)");
        } else {
            System.out.println("Edad no valida (debe estar entre 1 y 100 años)");
        }
    }

}