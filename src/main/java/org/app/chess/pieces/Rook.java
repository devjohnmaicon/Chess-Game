package org.app.chess.pieces;

import org.app.boardgame.Board;
import org.app.chess.ChessPiece;
import org.app.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {super(board, color);}

    @Override
    public String toString() {return "T";}
}
