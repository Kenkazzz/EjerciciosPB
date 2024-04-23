import java.util.Scanner;

public class Ejercicio211 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    
        double[] precios = {15.0, 10.0, 5.0, 3.0, 4.0};
        String[] alimentos = {"Bocadillo de jamón", "Bocadillo de queso", "Patatas fritas", "Refresco", "Cerveza"};

    
        int[] unidadesConsumidas = new int[precios.length];
        double cuentaTotal = 0;

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingrese el número de unidades consumidas de " + alimentos[i] + ":");
            unidadesConsumidas[i] = entrada.nextInt();
            cuentaTotal += precios[i] * unidadesConsumidas[i];
        }

    
        System.out.println("La cuenta total es: " + cuentaTotal + " Bs.");

        entrada.close();
    }
}