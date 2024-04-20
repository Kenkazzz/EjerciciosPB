import java.util.*;
public class Ejercicio45 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita un numero");
        
        double n1 = entrada.nextDouble();
        if (n1<0) {
            System.out.println("-1");
        }else if(n1>0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
