package org.example.models;

import lombok.Getter;
import org.example.enums.Color;
import org.example.enums.PieceType;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Piece {
    private Color color;
    private PieceType pieceType;
    public Boolean validateMove(Cell from, Cell to) {
        // TODO: validateMove logic
        return true;
    }

    public List<Move> validMoves() {
        // TODO: getAllValidMoves for the piece
        return new ArrayList<>();
    }
}
