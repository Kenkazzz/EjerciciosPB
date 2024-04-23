import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio172{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese una fecha en formato dd/MM/yyyy:");
        String fechaIngresada = entrada.next();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formato.parse(fechaIngresada);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            for (int i = 0; i < 12; i++) {
                calendar.add(Calendar.MONTH, -1);
                Date anterior = calendar.getTime();
                System.out.println("Fecha anterior: " + new SimpleDateFormat("MM/yyyy").format(anterior));
            }

        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Por favor ingrese una fecha válida.");
        }
    }
}