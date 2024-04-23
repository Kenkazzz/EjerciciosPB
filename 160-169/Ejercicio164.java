import java.util.Scanner;

public class Ejercicio164 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int boletosAdultos = 0;
        int boletosNiños = 0;
        int boletosPromociones = 0;

        int precioAdultos = 60;
        int precioNiños = 30;
        int precioPromociones= 20;

        int cantidadBoletos = 0;
        int ventaBruta = 0;

        int pago =0;
        int tipoVoleto = 0;

        
        do { 
        Menu();
        System.out.println("Digite la opcion deseada");
        tipoVoleto = entrada.nextInt();
        switch (tipoVoleto) {
            case 1:
                System.out.println("Cuantos boletos para adulto desea");
                int boleto1 = entrada.nextInt();
                pago = boleto1 * precioAdultos;
                cantidadBoletos +=boleto1;
                boletosAdultos+=boleto1;
                ventaBruta += pago;
                System.out.println("Valor a pagar por "+boleto1+" boletos de adultos es "+pago);
                break;
            case 2:
                System.out.println("Cuantos boletos para niño desea");
                int boleto2 = entrada.nextInt();
                pago = boleto2 * precioNiños;
                cantidadBoletos +=boleto2;
                boletosNiños+=boleto2;
                ventaBruta += pago;
                System.out.println("Valor a pagar por "+boleto2+" boletos de niños es "+pago);
                break;
            case 3:
                System.out.println("Cuantos boletos de promocion desea");
                int boleto3 = entrada.nextInt();
                pago = boleto3 * precioPromociones;
                cantidadBoletos +=boleto3;
                boletosPromociones+=boleto3;
                ventaBruta += pago;
                System.out.println("Valor a pagar por "+boleto3+" boletos de promocion es "+pago);
                break;
        
            default:
            System.out.println("Saliendo......");
                break;
        }
    } while (tipoVoleto !=4);

    System.out.println("Se vendieron "+cantidadBoletos+" boletos");
    System.out.println("De adultos : "+boletosAdultos);
    System.out.println("De niños : "+boletosNiños);
    System.out.println("De promociones : "+boletosPromociones);
    System.out.println("El valor de ventas es de "+ventaBruta+" pesos");

    }
    public static void Menu(){
        System.out.println("");
        System.out.println("Cine Voletos");
        System.out.println("1) Adulto $60");
        System.out.println("2) Niño $30");
        System.out.println("3) Promociones $20");
        System.out.println("4) Salir");
        System.out.println("");
    }
}