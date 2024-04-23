import java.util.Scanner;

public class Ejercicio184 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Ingrese el nombre completo de la persona o empresa:");
        String nombre = entrada.nextLine();
    
        System.out.println("Ingrese la fecha de nacimiento en formato AAAA-MM-DD o la fecha de creación en formato AAAA-MM-DD:");
        String fechaNacimiento = entrada.nextLine();
    
        String rfc = generarRFC(nombre, fechaNacimiento);
        System.out.println("El RFC generado es: " + rfc);

        entrada.close();
    }

    
    public static String generarRFC(String nombre, String fechaNacimiento) {
        String[] palabras = nombre.split(" ");
        String iniciales = "";
        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                iniciales += palabra.charAt(0);
            }
        }
    
        String[] fecha = fechaNacimiento.split("-");
        String fechaRFC = fecha[0].substring(2) + fecha[1] + fecha[2];
    
        String homoclave = generarHomoclave();
        return iniciales.toUpperCase() + fechaRFC + homoclave;
    }
    
    public static String generarHomoclave() {
        String caracteres = "0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        StringBuilder homoclave = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int index = (int) (Math.random() * caracteres.length());
            homoclave.append(caracteres.charAt(index));
        }
        return homoclave.toString();
    }
}