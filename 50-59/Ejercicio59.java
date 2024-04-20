import java.util.*;
public class Ejercicio59 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero del 1 al 10");
        int num = entrada.nextInt();
        if (num<0 || num>10) {
            System.out.println("Solo permite numeros del 1 al 10");
        }else{
            for(int i=0; i<11; i++){
                int multi = i*num;
                System.out.println(num+" X "+i+" = "+multi);
            }
        }
    }
}
