package ticTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece p){
        if(board[row][col]!=null)return false;
        board[row][col] = p;

        return true;
    }

    public void printBoard(){
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                if(board[i][j]!=null)
                System.out.print(board[i][j].getPieceType());
                else{
                    System.out.print("-");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public List<Pair> emptyCell(){
        ArrayList<Pair> cells= new ArrayList<>();
        for(int i=0 ; i<size ; i++){
            for(int j=0 ; j<size ; j++){
                if(board[i][j]==null){
                    cells.add(new Pair(i, j));
                }
            }
        }

        return cells;
    }

    public int getSize() {
        return size;
    }
}
