import java.util.Scanner;

public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad =0;
        do{
            System.out.println("Ingresa tu edad ");
             edad = entrada.nextInt();
            if (edad>100) {
                System.out.println("Digite solo una edad dentre 0 y 100 años");
            }
            if (edad>=18 && edad<=100){
                System.out.println("Usted es mayor de edad");
            }else if (edad<18) {
                System.out.println("Usted es menor de edad");
            }

        }while(edad >100);

    }
}