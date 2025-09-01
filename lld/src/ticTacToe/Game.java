package ticTacToe;

import ticTacToe.models.Board;
import ticTacToe.models.Pair;
import ticTacToe.models.PieceType;
import ticTacToe.models.Player;

import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board board;

    public Game(Deque<Player> players, Board b){
        this.players = players;
        this.board = b;
    }

    public String start(){

        boolean gameFinished = false;

        while (!gameFinished){

            Player currentPlayer = players.poll();


            board.printBoard();
            List<Pair> emptyCells = board.emptyCell();

            if(emptyCells.isEmpty()){
                System.out.println("Game Drwan");
                return "Draw";
            }

            System.out.println("Player: " + currentPlayer.getName() + " enter row and col: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String inputs[]  = input.split(",");
            int row = Integer.parseInt(inputs[0]);
            int col = Integer.parseInt(inputs[1]);

            boolean isAdded = board.addPiece(row, col, currentPlayer.getPlayingPiece());
            if(!isAdded){
                System.out.println("Invalid Move, try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.offer(currentPlayer);

            // check if current player has won
            boolean isWinner = isThereWinner(row, col, currentPlayer.getPlayingPiece().getPieceType());

            if(isWinner){
                System.out.println("Player: " + currentPlayer.getName() + " has won the game");
                board.printBoard();
                return currentPlayer.getName();
            }
        }

        return "Draw";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType) {
        int n=board.getSize();

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<n;i++) {

            if(board.board[row][i] == null || board.board[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<n;i++) {

            if(board.board[i][col] == null || board.board[i][col].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<n;i++,j++) {
            if (board.board[i][j] == null || board.board[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=n-1; i<n;i++,j--) {
            if (board.board[i][j] == null || board.board[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }

}
