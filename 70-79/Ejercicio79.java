public class Ejercicio79 {
    public static void main(String[] args) {
        int voltajeBombillo = 120; // Voltaje de cada bombillo en V
        int cantidadBombillos = 3; // Cantidad de bombillos

        int voltajeTotal = voltajeBombillo * cantidadBombillos; // Calcular el voltaje total

        double voltajeTotalKilovoltios = voltajeTotal / 1000.0; // Convertir el voltaje total a kilovoltios

        System.out.println("El voltaje total de los tres bombillos es de " + voltajeTotalKilovoltios + " kV");
    }
}