import java.util.*;

public class Ejercicio62 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int sumaTempe = 0;
        int temperaturaM = 0;
        int temperaturaMini = 0;
        int tempe = 4;

        for(int i = 1; i <= 6; i++) {
            System.out.println("Ingrese la temperatura exterior de las "+tempe+" horas: ");
            int temperatura = entrada.nextInt();
            
            sumaTempe += temperatura;

            tempe += 4;
            
            if(temperatura > temperaturaM) {
                temperaturaM = temperatura;
            }
            
            if(temperatura < temperaturaMini) {
                temperaturaMini = temperatura;
            }
        }
        
        int temperaturaMedia = sumaTempe / 6;
        
        System.out.println("La temperatura media del día es: " + temperaturaMedia);
        System.out.println("La temperatura más alta es: " + temperaturaM);
        System.out.println("La temperatura más baja es: " + temperaturaMini);
        
    }
}
