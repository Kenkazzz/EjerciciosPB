public class Ejercicio21 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
    }
}
