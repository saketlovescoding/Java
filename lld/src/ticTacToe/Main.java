package ticTacToe;

import ticTacToe.models.*;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        Player p1 = new Player("Anisha", new PlayingPieceO());
        Player p2 = new Player("Saket", new PlayingPieceX());

        Deque<Player> players = new LinkedList<>();
        players.add(p1);
        players.add(p2);

        Board b = new Board(3);
        Game g = new Game(players, b);

        g.start();

    }
}
