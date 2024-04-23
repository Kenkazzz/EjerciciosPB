import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio126 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha en formato AAAA MM DD:");
        String fechaString = sc.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate fecha = LocalDate.parse(fechaString, formatter);
        
        String fechaTexto = fecha.format(DateTimeFormatter.ofPattern("dd MMMM 'de' yyyy"));
        
        System.out.println(fechaTexto);

    }
}