import java.util.Scanner;

public class Ejercicio199 {

    static int puntosJugador1 = 0;
    static int puntosJugador2 = 0;
    static String[][] tablero = new String[8][8];

    public static void inicializarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "-";
            }
        }
        for (int i = 1; i < 8; i += 2) {
            tablero[1][i] = "P1";
            tablero[6][i] = "P2";
        }
    }

    public static void mostrarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean esMovimientoValido(String jugador, int filaActual, int columnaActual, int filaNueva, int columnaNueva) {
        if (jugador.equals("P1")) {
            if (filaNueva == filaActual - 1 && (columnaNueva == columnaActual - 1 || columnaNueva == columnaActual + 1)) {
                if (tablero[filaNueva][columnaNueva].equals("P2")) {
                    puntosJugador1++;
                    return true;
                }
            }
        } else if (jugador.equals("P2")) {
            if (filaNueva == filaActual + 1 && (columnaNueva == columnaActual - 1 || columnaNueva == columnaActual + 1)) {
                if (tablero[filaNueva][columnaNueva].equals("P1")) {
                    puntosJugador2++;
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        inicializarTablero();

        while (true) {
            mostrarTablero();
            System.out.println("Puntos Jugador 1: " + puntosJugador1 + " - Puntos Jugador 2: " + puntosJugador2);
            System.out.println("Turno del Jugador 1 (P1)");
            System.out.print("Ingrese coordenadas de la pieza a mover (fila columna): ");
            int filaActual = entrada.nextInt();
            int columnaActual = entrada.nextInt();
            System.out.print("Ingrese coordenadas a donde mover la pieza (fila columna): ");
            int filaNueva = entrada.nextInt();
            int columnaNueva = entrada.nextInt();

            if (esMovimientoValido("P1", filaActual, columnaActual, filaNueva, columnaNueva)) {
                tablero[filaNueva][columnaNueva] = "P1";
                tablero[filaActual][columnaActual] = "-";
            } else {
                System.out.println("Movimiento inválido, intente de nuevo.");
            }

            mostrarTablero();
            System.out.println("Puntos Jugador 1: " + puntosJugador1 + " - Puntos Jugador 2: " + puntosJugador2);
            System.out.println("Turno del Jugador 2 (P2)");
            System.out.print("Ingrese coordenadas de la pieza a mover (fila columna): ");
            filaActual = entrada.nextInt();
            columnaActual = entrada.nextInt();
            System.out.print("Ingrese coordenadas a donde mover la pieza (fila columna): ");
            filaNueva = entrada.nextInt();
            columnaNueva = entrada.nextInt();

            entrada.close();

            if (esMovimientoValido("P2", filaActual, columnaActual, filaNueva, columnaNueva)) {
                tablero[filaNueva][columnaNueva] = "P2";
                tablero[filaActual][columnaActual] = "-";
            } else {
                System.out.println("Movimiento inválido, intente de nuevo.");
            }
        }
    }
}