import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio176 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        
        LocalDate fechaDeMañana = fechaActual.plusDays(1);
        
        System.out.println("La fecha del día siguiente es: " + fechaDeMañana);
    }
}