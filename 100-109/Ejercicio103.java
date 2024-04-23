import java.util.Scanner;

public class Ejercicio103 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero");
        double num1 = entrada.nextDouble();

        System.out.println("Digite el segundo numero");
        double num2 = entrada.nextDouble();

        System.out.println("Digite el tercer numero");
        double num3 = entrada.nextDouble();

        double numMenor = calcularMenor(num1, num2, num3);

        System.out.println("El numero menor de los tres es "+numMenor);


    }
    public static double calcularMenor(double n1, double n2, double n3){
        double menor = 0;
        if (n1<n2 && n1<n3) {
            menor = n1;
        }else if(n2<n1 && n2<n3){
            menor = n2;
        }else if(n3<n1 && n3<n2){
            menor = n3;
        }
        return menor;
    }
}