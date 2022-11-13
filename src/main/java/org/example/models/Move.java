package org.example.models;

import lombok.Builder;

@Builder
public class Move {
    private Player player;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private Cell from;
    private Cell to;
}
