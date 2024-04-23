import java.util.Scanner;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = entrada.nextInt();
    
        System.out.print("Introduce el año: ");
        int año = entrada.nextInt();
    
        int dias = 0;
    
        switch (mes) {
            case 1: //Enero
            case 3: //Marzo
            case 5: //Mayo
            case 7: //Julio
            case 8: //Agosto
            case 10: //Octubre
            case 12: //Diciembre
                dias = 31;
                break;
            case 4: //Abril
            case 6: //Junio
            case 9: //Septiembre
            case 11: //Noviembre
                dias = 30;
                break;
            case 2: //Febrero
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    dias = 29; //bisiesto
                } else {
                    dias = 28; //no bisiesto
                }
                break;
            default:
                System.out.println("Número de mes inválido");
                System.exit(0);
        }
    
        System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
    }
    
    }
