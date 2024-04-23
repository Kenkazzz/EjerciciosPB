public class Ejercicio195 {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39};
        int elementoBuscado = 17;
        
        int comparaciones = busquedaBinaria(arreglo, elementoBuscado);
        
        if (comparaciones != -1) {
            System.out.println("Elemento encontrado en la posición " + comparaciones);
            System.out.println("Cantidad de comparaciones realizadas: " + comparaciones);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }
    
    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            if (arreglo[medio] == elemento) {
                return medio;
            } else if (arreglo[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        
        return -1;
    }
}