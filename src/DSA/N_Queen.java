package DSA;
import java.util.*;

public class N_Queen {

    private static List<List<String>> result = new ArrayList<>();
    private static HashSet<Integer> columns = new HashSet<>();
    private static HashSet<Integer> diag1 = new HashSet<>();
    private static HashSet<Integer> diag2 = new HashSet<>();

    public static void main(String[] args) {

        int n = 4;  // You can change this value

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0, n);

        // Print all solutions
        for (List<String> solution : result) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    private static void backtrack(char[][] board, int row, int n) {

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (columns.contains(col) ||
                diag1.contains(row - col) ||
                diag2.contains(row + col)) {
                continue;
            }

            board[row][col] = 'Q';
            columns.add(col);
            diag1.add(row - col);
            diag2.add(row + col);

            backtrack(board, row + 1, n);

            board[row][col] = '.';
            columns.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }

    private static List<String> construct(char[][] board) {

        List<String> solution = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            solution.add(new String(board[i]));
        }

        return solution;
    }
}
