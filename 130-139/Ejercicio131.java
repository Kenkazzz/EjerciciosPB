import java.util.Scanner;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de horas trabajadas ");
        int horasTrabajadas = entrada.nextInt();
        
        System.out.println("Ingrese la tarifa de pago por horas ");
        double tarifa = entrada.nextDouble();

        double salario = 0;
        
        if(horasTrabajadas <= 40){
            salario = horasTrabajadas * tarifa;
        } else {
            salario = 40 * tarifa + ((horasTrabajadas - 40) * (tarifa*2));
        }
        
        System.out.println("El salario del trabajador es: " + salario);
    }
}