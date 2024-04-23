import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio197 {

    public static void main(String[] args) {
        
        String nombreArchivo = "estado_cuenta.txt";
        File archivo = new File(nombreArchivo);

        try {
            Scanner scanner = new Scanner(archivo);

            
            String encabezado = scanner.nextLine();

            
            String[] columnas = encabezado.split(",");

            
            System.out.println("Estado de Cuenta");
            System.out.println("-------------------------------------------------");
            for (String columna : columnas) {
                System.out.printf("%-20s", columna);
            }
            System.out.println();

            
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();

                
                String[] datos = linea.split(",");

                
                for (String dato : datos) {
                    System.out.printf("%-20s", dato);
                }
                System.out.println();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + nombreArchivo);
        }
    }
}