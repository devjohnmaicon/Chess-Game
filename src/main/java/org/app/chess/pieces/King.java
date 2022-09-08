package org.app.chess.pieces;

import org.app.boardgame.Board;
import org.app.chess.ChessPiece;
import org.app.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
