package org.example.models;

import lombok.Getter;
import org.example.enums.Color;

@Getter
public class Cell {
    private Color color;
    private Piece piece;
    private int row;
    private int col;
}
