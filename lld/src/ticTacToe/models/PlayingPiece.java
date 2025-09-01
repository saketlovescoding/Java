package ticTacToe.models;

public class PlayingPiece {

    private PieceType type;


    public PlayingPiece(PieceType type){
        this.type = type;
    }

    public PieceType getPieceType(){
        return this.type;
    }


}
