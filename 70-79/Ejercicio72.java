import java.util.*;

public class Ejercicio72 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas trabajadas ");
        int horasTrabajadas = entrada.nextInt();
        
        System.out.print("Ingrese la tarifa por hora de trabajo ");
        double tarifa = entrada.nextDouble();
        
        double salario = calcularSalario(horasTrabajadas, tarifa);
        
        System.out.println("El salario del trabajador es: $" + salario);
    }
    
    public static double calcularSalario(int horasTrabajadas, double tarifa) {
        double salario;
        
        if(horasTrabajadas > 40) {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            
            double salarioHorasNormales = horasNormales * tarifa;
            double salarioHorasExtras = horasExtras * (tarifa * 1.5);
            
            salario = salarioHorasNormales + salarioHorasExtras;
        } else {
            salario = horasTrabajadas * tarifa;
        }
        
        return salario;
    }
}