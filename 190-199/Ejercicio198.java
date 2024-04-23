import java.util.Scanner;

public class Ejercicio198 {
    public static void main(String[] args) {
        int[][] sudoku = generateSudoku();
        
        mostrarSudoku(sudoku);
        
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese la fila, columna y número separados por espacios (o -1 para salir):");
            int row = entrada.nextInt();
            
            if (row == -1) {
                break;
            }
            
            int col = entrada.nextInt();
            int num = entrada.nextInt();
            
            if (movimientoValido(sudoku, row, col, num)) {
                sudoku[row][col] = num;
                mostrarSudoku(sudoku);
            } else {
                System.out.println("Movimiento inválido. Por favor, inténtelo de nuevo.");
            }
        }
        entrada.close();
        System.out.println("¡Juego terminado!");
    }
    
    public static int[][] generateSudoku() {
        int[][] sudoku = new int[9][9];
        
        return sudoku;
    }
    
    public static void mostrarSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static boolean movimientoValido(int[][] sudoku, int row, int col, int num) {
        
        return true;
    }
}