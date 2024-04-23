public class Ejercicio116 {
    public static void main(String[] args) {
        int suma = 0;
        for(int i=2; i<=1000; i+=2){
            suma += i;
        }
        System.out.println("La suma de los numeros pares comprendidos entre 1 y 1000 es "+suma);

        int multiplicarImpares = 1;

        for(int i=1; i<=50; i+=2){
            
                multiplicarImpares *=i;
            
        }
        System.out.println("La multiplicacion de los numeros pares del 1 al 50 es "+multiplicarImpares);
    }
}