import java.util.Scanner;

public class Ejercicio178 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la duración de la llamada en minutos");
        int duracion = input.nextInt();
        
        double costo = 0;
        
        if (duracion >=1 && duracion<= 3) {
            costo = 3.00;
        } else if (duracion >3 && duracion <= 7) {
            costo = 3.00 + (duracion - 3) * (1.5);
        } else if (duracion>7) {
            costo = 3.00 + 4 * 1.5 + (duracion - 7) * 3.00;
        }
        
        System.out.println("El costo de la llamada es $"+costo );
    }
}