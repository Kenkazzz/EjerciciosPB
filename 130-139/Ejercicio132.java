import java.util.Scanner;

public class Ejercicio132 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        double saldo = 1000;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar");
                    double deposito = entrada.nextDouble();
                    saldo +=deposito;
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad a retirar");
                    double retiro = entrada.nextDouble();
                    if (retiro>saldo) {
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo -=retiro;
                    }
                    break;
                default:
                System.out.println("Tramite exitoso");
                    break;
            }
        } while (opcion !=3);

        System.out.println("Su saldo es de "+saldo+" pesos");
    }
    public static void menu(){
        System.out.println("******MENU******");
        System.out.println("1.Deposito");
        System.out.println("2.Retiro");
        System.out.println("3.Salir");
    }
}