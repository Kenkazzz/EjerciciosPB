import java.util.Scanner;

public class Ejercicio189 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la coordenada de inicio del caballo en formato (x,y): ");
        String inicio = entrada.nextLine();
        int xInicio = Character.getNumericValue(inicio.charAt(1));
        int yInicio = Character.getNumericValue(inicio.charAt(3));

        System.out.println("Ingrese la coordenada de destino en formato (x,y): ");
        String destino = entrada.nextLine();
        int xDestino = Character.getNumericValue(destino.charAt(1));
        int yDestino = Character.getNumericValue(destino.charAt(3));

        if ((Math.abs(xInicio - xDestino) == 1 && Math.abs(yInicio - yDestino) == 2)
                || (Math.abs(xInicio - xDestino) == 2 && Math.abs(yInicio - yDestino) == 1)) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo no es válido.");
        }

        entrada.close();
    }
}