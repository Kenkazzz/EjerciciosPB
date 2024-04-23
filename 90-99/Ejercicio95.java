import java.util.Scanner;

public class Ejercicio95 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el tamaño del vector");
        int n = entrada.nextInt();

        int [] vector = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite el "+(i+1)+" numero ");
            vector[i] = entrada.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if (vector[j]>vector[j+1]) {
                    int aux = vector[j];
                    vector[j]= vector[j+1];
                    vector[j+1]= aux;
                }
            }
        }
        System.out.println("Los numeros del vector de mayor a menor ");
        for(int i=n-1;i>=0;i--){
            System.out.print(+vector[i]+" ");
        }
    }
}