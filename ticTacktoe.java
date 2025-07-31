import java.util.Scanner;

public class ticTacktoe {

    static char[][] board = {
            { '_', '_', '_' },
            { '_', '_', '_' },
            { '_', '_', '_' }
    };

    static final char PLAYER = 'X'; // Human player
    static final char AI = 'O'; // AI player

    // Function to check if there's a winner
    public static boolean isWinner(char[][] board, char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    // Function to check if the board is full (draw)
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_')
                    return false;
            }
        }
        return true;
    }

    // Minimax algorithm to evaluate all possible moves
    public static int minimax(char[][] board, boolean isMaximizing) {
        if (isWinner(board, AI))
            return 1; // AI wins
        if (isWinner(board, PLAYER))
            return -1; // Player wins
        if (isBoardFull(board))
            return 0; // Draw

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        board[i][j] = AI;
                        int score = minimax(board, false);
                        board[i][j] = '_';
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '_') {
                        board[i][j] = PLAYER;
                        int score = minimax(board, true);
                        board[i][j] = '_';
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
            return bestScore;
        }
    }

    // Function to find the best move for the AI
    public static int[] bestMove() {
        int bestScore = Integer.MIN_VALUE;
        int[] move = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '_') {
                    board[i][j] = AI;
                    int score = minimax(board, false);
                    board[i][j] = '_';
                    if (score > bestScore) {
                        bestScore = score;
                        move[0] = i;
                        move[1] = j;
                    }
                }
            }
        }
        return move;
    }

    // Function to print the Tic-Tac-Toe board
    public static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isGameOver = false;

        // Game loop
        while (!isGameOver) {
            // Player's turn
            System.out.println("Enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (board[row][col] == '_') {
                board[row][col] = PLAYER;
            } else {
                System.out.println("Invalid move, try again.");
                continue;
            }

            // Check if player wins
            if (isWinner(board, PLAYER)) {
                printBoard();
                System.out.println("You win!");
                isGameOver = true;
                break;
            }

            // AI's turn
            int[] aiMove = bestMove();
            board[aiMove[0]][aiMove[1]] = AI;

            // Check if AI wins
            if (isWinner(board, AI)) {
                printBoard();
                System.out.println("AI wins!");
                isGameOver = true;
                break;
            }

            // Check for a draw
            if (isBoardFull(board)) {
                printBoard();
                System.out.println("It's a draw!");
                isGameOver = true;
                break;
            }

            printBoard();
        }

        scanner.close();
    }
}
