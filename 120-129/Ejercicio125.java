import java.util.Scanner;

public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero que desea conocer sus multiplos");
        int multiplos = entrada.nextInt();
        for(int i=1; i<=3000; i++){
            if (i % multiplos == 0) {
                System.out.println(i);
            }
        }
    }
}