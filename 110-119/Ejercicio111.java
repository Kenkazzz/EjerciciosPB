import java.util.Scanner;

public class Ejercicio111 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero del 1 al 7");
        int numero = entrada.nextInt();

        if (numero<=7) {
            switch (numero) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                case 3:
                    System.out.println("Martes");
                    break;
                case 4:
                    System.out.println("Miercoles");
                    break;
                case 5:
                    System.out.println("Jueves");
                    break;
                case 6:
                    System.out.println("Viernes");
                    break;
                case 7:
                    System.out.println("Sabado");
                    break;
            
                default:
                    break;
            }
        }else{
            System.out.println("Digite un numero valido");
        }
    }
}