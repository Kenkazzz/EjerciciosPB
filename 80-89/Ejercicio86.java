import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double [] Voltaje = new double[5];

        double suma = 0;
        
        for(int i=0; i<Voltaje.length; i++){
            System.out.println("Digite el voltaje "+(i+1));
            Voltaje[i] = entrada.nextDouble();

            suma += Voltaje[i];
        }

        double promedio = suma/5;

        if (promedio>220) {
            System.out.println("ALTO VOLTAJE");
        }else{
            System.out.println("VOLTAJE CORRECTO");
        }
    }
}