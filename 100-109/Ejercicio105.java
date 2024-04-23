import java.util.Scanner;

public class Ejercicio105 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double [] notas = new double[4];

    double suma = 0;

    for(int i=0; i<notas.length; i++){
        System.out.println("Digite la "+(i+1)+" nota ");
        notas[i] = entrada.nextDouble();

        suma += notas[i];
    }
    double promedio = suma/4;

    if (promedio>14.5) {
        System.out.println("APROBADO");
    }else if(promedio<14.5 && promedio>10){
        System.out.println("SUPLETORIO");
    }else if (promedio<10) {
        System.out.println("PERDIO EL AÑO");
    }

}
}