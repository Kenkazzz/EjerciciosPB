import java.util.*;
public class Ejercicio52 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero que deseas conocer la tabla ");
        int num = entrada.nextInt();
        for(int i = 0; i<11;i++){
            int tabla = i*num;
            System.out.println(num+" X "+i+" = "+tabla);
        }
    }
}
