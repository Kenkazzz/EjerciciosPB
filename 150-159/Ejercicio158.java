import java.util.Scanner;
public class Ejercicio158 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        System.out.println("Ingresa un texto: ");
        String texto = entrada.nextLine().toLowerCase();
            
        int a = 0, e = 0, i = 0, o = 0, u = 0;
            
        for (int j = 0; j < texto.length(); j++) {
        char letra = texto.charAt(j);
            if (letra == 'a') {
                a++;
            } else if (letra == 'e') {
                e++;
            } else if (letra == 'i') {
                i++;
            } else if (letra == 'o') {
                o++;
            } else if (letra == 'u') {
                u++;
            }
        }
            
        System.out.println("Cantidad de vocales 'a': " + a);
        System.out.println("Cantidad de vocales 'e': " + e);
        System.out.println("Cantidad de vocales 'i': " + i);
        System.out.println("Cantidad de vocales 'o': " + o);
        System.out.println("Cantidad de vocales 'u': " + u);
        }
    }
