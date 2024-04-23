import java.util.Scanner;

public class Ejercicio187 {
    public static void main(String[] abc){
        Scanner entrada = new Scanner(System.in);
            char[][] tablero = new char[8][8];
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = '-';
                }
            }
            System.out.println("Ingrese la posición inicial de la reina (fila columna):");
            int filaReyna = entrada.nextInt() - 1;
            int columnaReyna = entrada.nextInt() - 1;
    
            if (posicionValidaReyna(filaReyna, columnaReyna)) {
                tablero[filaReyna][columnaReyna] = 'Q';
                imprimirTablero(tablero);
                while (true) {
                    System.out.println("Ingrese la posición destino (fila columna):");
                    int nuevaFila = entrada.nextInt() - 1;
                    int nuevaColumna = entrada.nextInt() - 1;
                    if (movimientoValidaReyna(filaReyna, columnaReyna, nuevaFila, nuevaColumna)) {
                        tablero[filaReyna][columnaReyna] = '-';
                        tablero[nuevaFila][nuevaColumna] = 'Q';
                        imprimirTablero(tablero);
                        filaReyna = nuevaFila;
                        columnaReyna = nuevaColumna;
                    } else {
                        System.out.println("Movimiento inválido :(");
                    }
                }
            } else {
                System.out.println("Posición inicial inválida :(");
            }
            entrada.close();
        }
        private static boolean posicionValidaReyna(int fila, int columna) {
            return fila >= 0 && fila < 8 && columna >= 0 && columna < 8;
        }
        private static boolean movimientoValidaReyna(int filaReyna, int columnaReyna, int nuevaFila, int nuevaColumna) {
            if (!posicionValidaReyna(nuevaFila, nuevaColumna)) {
                return false;
            }
            if (nuevaFila == filaReyna || nuevaColumna == columnaReyna) {
                return true;
            }
            int diferenciaFila = Math.abs(nuevaFila - filaReyna);
            int diferenciaColumna = Math.abs(nuevaColumna - columnaReyna);
            return diferenciaFila == diferenciaColumna;
        }
        private static void imprimirTablero(char[][] tablero) {
            for (char[] fila : tablero) {
                for (char celda : fila) {
                    System.out.print(celda + "  ");
                }
                System.out.println();
            }
        }
    
}