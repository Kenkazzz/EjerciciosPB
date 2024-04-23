import java.util.Scanner;

public class Ejercicio91 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite su nombre");
        String Nombre = entrada.next();

        System.out.println("Digite su apellido");
        String Apellido = entrada.next();

        System.out.println("Digite la edad");
        String edad = entrada.next();

        System.out.println("Digite su numero de celular");
        String celular = entrada.next();

        System.out.println("Nombre  Apellido  Edad   Celular ");
        System.out.println(Nombre+"  "+Apellido+"   "+edad+"    "+celular);
    }
}