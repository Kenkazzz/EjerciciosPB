import java.util.Scanner;

public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese una palabra ");
            String palabra = entrada.nextLine();
    
            if(esPalindrome(palabra)){
                System.out.println("La palabra es palíndroma.");
            } else {
                System.out.println("La palabra no es palíndroma.");
            }
        }
    
        public static boolean esPalindrome(String palabra){
            int i = 0;
            int j = palabra.length() - 1;
    
            while (i < j) {
                if (palabra.charAt(i) != palabra.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
    
            return true;
        }
    }
