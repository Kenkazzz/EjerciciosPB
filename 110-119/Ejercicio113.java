import java.util.Scanner;

public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la distancia a recorrer en km hasta Monterrey: ");
        int distancia = entrada.nextInt();

        int GasolinaMoto = calcularGasolina(distancia, 20);
        int GasolinaAuto = calcularGasolina(distancia, 10);
        int GasolinaPickup = calcularGasolina(distancia, 5);

        Menu();
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Gasto estimado de gasolina para viajar en motocicleta  " + GasolinaMoto+" litros");
                break;

            case 2:
            System.out.println("Gasto estimado de gasolina para viajar en automóvil  " + GasolinaAuto+" litros");
            break;

            case 3:
            System.out.println("Gasto estimado de gasolina para viajar en pickup  " + GasolinaPickup+" litros");
            break;
        
            default:
            System.out.println("Digite una opcion valida");
                break;
        }
    }

    public static int calcularGasolina(int distancia, int rendimiento) {
        int litrosGasolina = distancia / rendimiento;
        return litrosGasolina;
    }

    public static void Menu(){
        System.out.println("Eliga el sistema de transporte");
        System.out.println("1) Motocicleta");
        System.out.println("2) Automovil");
        System.out.println("3)Pickup");
    }
}