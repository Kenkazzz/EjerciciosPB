import java.util.Scanner;

public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre (Primera letra en mayúscula):");
        String nombre = entrada.nextLine().toUpperCase();

        System.out.println("Ingrese su primer apellido (Primera letra en mayúscula):");
        String apellidoPaterno = entrada.nextLine().toUpperCase();

        System.out.println("Ingrese su segundo apellido (Primera letra en mayúscula):");
        String apellidoMaterno = entrada.nextLine().toUpperCase();

        System.out.println("Ingrese su fecha de nacimiento (AAAAMMDD):");
        String fechaNacimiento = entrada.nextLine();

        String inicialesNombre = obtenerIniciales(nombre);
        String dosPrimerosDigitosAño = fechaNacimiento.substring(0, 2);
        String mesNacimiento = fechaNacimiento.substring(3, 5);
        String diaNacimiento = fechaNacimiento.substring(6, 8);
        String rfcPreliminar = inicialesNombre + apellidoPaterno.substring(0, 1) +
                apellidoMaterno.substring(0, 1) +
                dosPrimerosDigitosAño + mesNacimiento + diaNacimiento;

        System.out.println("\nRFC (Sin las homoclaves): " + rfcPreliminar);
        System.out.println("¡¡¡Este programa no puede generar los tres deigitos faltantes (Homoclaves) por motivos de seguridad!!!");
        entrada.close();
    }
    private static String obtenerIniciales(String nombre) {
        String iniciales = "";
        for (String palabra : nombre.split(" ")) {
            if (!palabra.isEmpty()) {
                iniciales += palabra.charAt(0);
            }
        }
        return iniciales;
    }

}