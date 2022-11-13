package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();
    private Board board;
    private List<Move> moves = new ArrayList<>();

    public void makeMove() {
        Player currentPlayer = this.getCurrentPlayer();
        Piece currentPiece = this.getCurrentPiece();
        Cell fromCell = this.getFromCell();
        Cell toCell = this.getToCell();
        Boolean moveValid = currentPiece.validateMove(fromCell, toCell);
        if (!moveValid) {
            throw new RuntimeException("Move is invalid!");
        }
        currentPlayer.play(this.board, currentPiece, fromCell, toCell);
        Move currentMove = Move.builder()
                .pieceMoved(currentPiece)
                .from(fromCell)
                .to(toCell)
                .build();
        this.logMove(currentMove);
    }

    private void logMove(Move currentMove) {
        moves.add(currentMove);
    }

    private Cell getToCell() {
        // TODO: Do we need to take this input from user?
        return new Cell();
    }

    private Cell getFromCell() {
        // TODO: Do we need to take this input from user?
        return new Cell();
    }

    public void checkWinner() {
        // TODO
    }

    private Player getCurrentPlayer() {
        // return player whose turn is now
        return players.get(0); // TODO
    }

    private Piece getCurrentPiece() {
        // TODO: Do we need to take this input from user?
        return new Piece();
    }
}
