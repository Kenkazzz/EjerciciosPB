public class Ejercicio144 {
    public static void main(String[] args) {

        double suma = 0;
        double multiplicacion = 1;

        for(int i=0; i<=100; i++){
            if (i % 2 ==0) {
                suma +=i;
            }else{
                multiplicacion *=i;
            }
        }

        System.out.println("La suma de los numeros pares comprendidos entre el 1 y el 100 es igual a "+suma);
        System.out.println("La multiplicacion de los numeros impares comprendidos entre el 1 y el 100 es igual a "+multiplicacion);
    }
}