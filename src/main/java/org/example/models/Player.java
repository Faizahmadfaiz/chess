package org.example.models;

import org.example.enums.Color;

public abstract class Player {
    private Color color;

    public void play(Board board, Piece piece, Cell from, Cell to) {
        board.updateBoard(piece, from, to);
    }
}
