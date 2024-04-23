import java.util.Scanner;

public class Ejercicio183 {
    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo:");
        String nombreCompleto = entrada.nextLine().toUpperCase();

        int totalVocales = 0;
        int[] contVocales = new int[5];

        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            switch (letra) {
                case 'A':
                    totalVocales++;
                    contVocales[0]++;
                    break;
                case 'E':
                    totalVocales++;
                    contVocales[1]++;
                    break;
                case 'I':
                    totalVocales++;
                    contVocales[2]++;
                    break;
                case 'O':
                    totalVocales++;
                    contVocales[3]++;
                    break;
                case 'U':
                    totalVocales++;
                    contVocales[4]++;
                    break;
            }
        }
        System.out.println("Total de vocales: " + totalVocales);

        for (int i = 0; i < contVocales.length; i++) {
            char vocal = (char) (i + 'A');
            System.out.println("Vocal " + vocal + ": " + contVocales[i] + " repeticiones");
        }
        entrada.close();
        }
}

