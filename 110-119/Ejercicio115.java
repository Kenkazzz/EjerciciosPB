public class Ejercicio115 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i=2; i<=1000; i+=2){
            suma += i;
        }
        System.out.println("La suma de los numeros pares comprendidos entre 1 y 1000 es "+suma);
    }
}