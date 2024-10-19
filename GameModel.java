import java.util.Arrays;

public class GameModel {
    private String[] board;
    private int currentPlayer; // 0 for Player 1 (O), 1 for Player 2 (X)

    public GameModel() {
        board = new String[9];
        Arrays.fill(board, ""); // Initialize the board with empty strings
        currentPlayer = 0; // Start with Player 1
    }

    public boolean makeMove(int position) {
        if (position < 0 || position >= board.length || !board[position].isEmpty()) {
            return false; // Invalid move
        }
        board[position] = (currentPlayer == 0) ? "O" : "X";
        currentPlayer = (currentPlayer + 1) % 2; // Switch player
        return true; // Move made successfully
    }

    public String getWinner() {
        // Winning conditions (rows, columns, diagonals)
        int[][] winningCombinations = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, // Rows
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, // Columns
                { 0, 4, 8 }, { 2, 4, 6 } // Diagonals
        };

        for (int[] combination : winningCombinations) {
            if (!board[combination[0]].isEmpty() &&
                    board[combination[0]].equals(board[combination[1]]) &&
                    board[combination[1]].equals(board[combination[2]])) {
                String winner = board[combination[0]]; // Store the winner
                resetGame(); // Clear the board after someone wins
                return winner; // Return winner (O or X)
            }
        }
        return ""; // No winner
    }

    public void resetGame() {
        Arrays.fill(board, "");
        currentPlayer = 0;
    }

    public String[] getBoard() {
        return board;
    }
}
