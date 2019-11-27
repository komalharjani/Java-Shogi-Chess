package game;

import exceptions.AnimalChessException;
import pieces.*;

import java.util.ArrayList;


public class Player {

    private String playerName;
    private int playerNo;
    boolean playerHasWon;
    ArrayList<Piece> hand = new ArrayList<Piece>();

    /**
     * @param name
     * @param playerNumber
     */
    //Constructor
    public Player(String name, int playerNumber) {
        playerName = name;
        playerNo = playerNumber;
    }

    public String getName() {
        return playerName;
    }


    public int getPlayerNumber() {
        return playerNo;
    }

    public ArrayList<Piece> getHand() {
        return hand;
    }

    /**
     * @param piece
     */
    public void addPieceToHand(Piece piece) {
        //Add piece to hand
        hand.add(piece);
        //Set square to null
        piece.getSquare().currPiece = null;
        piece.setSquare(null);
    }

    /**
     * @param piece
     * @param square
     * @throws AnimalChessException
     */
    public void dropPiece(Piece piece, Square square) throws AnimalChessException {
        //
        //If the piece is null --> set the piece to square and remove the piece from hand
        if (square.getPiece() == null) {
            piece.setSquare(square);
            square.setPiece(piece);
            hand.remove(piece);
        } else
            throw new AnimalChessException("square taken!");
    }

    public void winGame() {
        playerHasWon = true;
    }

    public boolean hasWon() {
        return playerHasWon;
    }

    /**
     * @param b
     */
    public void setHasWon(boolean b) {
        playerHasWon = b;
    }
}
