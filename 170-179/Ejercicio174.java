import java.util.Scanner;

public class Ejercicio174 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite el nombre completo del usuario");
       String nombre = entrada.nextLine();

       System.out.println("Digite el area del empleado");
       String area = entrada.nextLine();

       nombre = nombre.toLowerCase();
       area = area.toLowerCase();

       String [] nombreSeparado = nombre.split(" ");
       char [] areaPorLetra = area.toCharArray();

       char letra1 = areaPorLetra[0];
       char letra2 = areaPorLetra[1];
       char letra3 = nombreSeparado[1].charAt(0);
       char letra4 = nombreSeparado[1].charAt(nombreSeparado[1].length()-1);
       String letra5 = nombreSeparado[0];
       char letra6 = nombreSeparado[2].charAt(0);
       char letra7 = nombreSeparado[2].charAt(nombreSeparado[2].length()-1);
       
       System.out.println("El usuario es "+letra1+letra2+letra3+letra4+letra5+letra6+letra7);


    }
}