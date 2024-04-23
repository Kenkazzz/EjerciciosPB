import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio191 {

    public static void main(String[] args) {

        String rutaArchivo = "archivo.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}