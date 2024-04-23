import java.util.Scanner;

public class Ejercicio83 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double [] Notas = new double[3];

        double suma = 0;

        for(int i=0; i<3; i++){
            System.out.println("Digite la "+(i+1)+" nota");
            Notas[i] = entrada.nextDouble();

            suma +=Notas[i];
        }
        double promedio = suma/3;

        if (promedio>7) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Mejore la nota");
        }


    }
}