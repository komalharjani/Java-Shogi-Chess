package game;

import exceptions.AnimalChessException;
import pieces.*;

public class Square {

    Game gameDec;
    public static Square[][] board;
    int rows;
    int cols;
    Piece currPiece;

    public Square(Game game, int row, int col) {

        gameDec = game;
        rows = row;
        cols = col;
    }

    /**
     * @param piece
     * @throws AnimalChessException
     */
    public void placePiece(Piece piece) throws AnimalChessException {
        //If current piece is null --> place piece
        if (currPiece == null) {
            currPiece = piece;
        } else {
            throw new AnimalChessException("Square Taken!");
        }
    }

    public Square[][] getBoard() {
        return board;
    }

    public void removePiece() {
        currPiece = null;
    }

    public Game getGame() {
        return gameDec;
    }

    public Piece getPiece() {
        return currPiece;
    }

    public void setPiece(Piece piece) {
        this.currPiece = piece;
    }

    public int getRow() {
        return rows;
    }

    public int getCol() {
        return cols;
    }

}
