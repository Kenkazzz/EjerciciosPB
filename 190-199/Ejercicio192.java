import java.io.*;
import java.util.*;
public class Ejercicio192 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce un texto (máximo 255 caracteres): ");
        String texto = entrada.nextLine();
        if (texto.length() > 255) {
            System.out.println("El texto excede el límite de 255 caracteres. Por favor, inténtalo de nuevo.");
        } else {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("archivo.txt"));
                writer.write(texto);
                writer.close();
                System.out.println("El texto ha sido escrito en el archivo correctamente.");
            } catch (IOException e) {
                System.out.println("Ocurrió un error al escribir en el archivo.");
                e.printStackTrace();
            }
        } 
        entrada.close(); 
    }
}