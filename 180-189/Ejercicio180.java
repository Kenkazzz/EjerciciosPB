import java.util.Scanner;
public class Ejercicio180 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int totalPersonas = 0;
        int hombres = 0;
        int mujeres = 0;
        int edadTotalHombres = 0;
        int edadTotalMujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;
        
        System.out.println("Ingrese la cantidad de personas que asistieron a la fiesta:");
        totalPersonas = entrada.nextInt();
        
        for(int i = 0; i < totalPersonas; i++){
            System.out.println("Ingrese la edad de la persona " + (i+1) + ": ");
            int edad = entrada.nextInt();
            
            System.out.println("Ingrese el sexo de la persona " + (i+1) + " (Hombre = H, Mujer = M): ");
            char sexo = entrada.next().charAt(0);
            
            if (edad < 18){
                System.out.println("No se permiten menores de edad en la fiesta. Ingrese una edad válida.");
                i--;
                continue;
            }
            
            if(sexo == 'H'){
                hombres++;
                edadTotalHombres += edad;
            } else if(sexo == 'M'){
                mujeres++;
                edadTotalMujeres += edad;
            } else {
                System.out.println("Sexo inválido. Por favor, ingrese H para hombre o M para mujer.");
                i--;
                continue;
            }
            
            if(edad < edadMasJoven){
                edadMasJoven = edad;
            }
        }
        entrada.close();
        
        double promedioEdadHombres = hombres > 0 ? (double)edadTotalHombres / hombres : 0;
        double promedioEdadMujeres = mujeres > 0 ? (double)edadTotalMujeres / mujeres : 0;
        
        System.out.println("Total de personas que asistieron a la fiesta: " + totalPersonas);
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
        System.out.println("Promedio de edad de hombres: " + promedioEdadHombres);
        System.out.println("Promedio de edad de mujeres: " + promedioEdadMujeres);
        System.out.println("Edad de la persona más joven que asistió: " + edadMasJoven);
    }

}