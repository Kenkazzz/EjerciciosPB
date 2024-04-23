import java.util.Scanner;

public class Ejercicio88 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double [] Voltaje = new double[3];

        double suma = 0;
        
        for(int i=0; i<Voltaje.length; i++){
            System.out.println("Digite el voltaje "+(i+1));
            Voltaje[i] = entrada.nextDouble();

            suma += Voltaje[i];
        }

        double promedio = suma/Voltaje.length;

        if (promedio<115) {
            System.out.println("VOLTAJE CORRECTO");
        }else if (115>promedio && promedio<220) {
            System.out.println("ALTO VOLTAJE");
        }else if (promedio>220) {
            System.out.println("PELIGRO");
        }
    }
}