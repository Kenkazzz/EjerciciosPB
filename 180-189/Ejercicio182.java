import java.util.Scanner;
public class Ejercicio182 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero menor o igual a 1000:");
        int numero = entrada.nextInt();

        if(numero > 1000 || numero <= 0){
            System.out.println("El numero ingresado no cumple las condiciones!");
        }else{
            System.out.println("El numero " + numero + " es equivalente a " + numRomano(numero) + " en numeros Romanos" );
        }
        entrada.close();
    }

    public static String numRomano(int num){
        String romano = "";
        int [] numerosRomanos = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < numerosRomanos.length; i++) {
            int division = num / numerosRomanos[i];
            for (int j = 0; j < division; j++) {
                romano += simbolos[i];
                num -= numerosRomanos[i];
            }
        }
        return romano;
    }

}