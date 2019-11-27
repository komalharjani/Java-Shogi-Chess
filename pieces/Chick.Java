package pieces;

import exceptions.AnimalChessException;
import game.*;

import java.util.ArrayList;

public class Chick extends Piece {
    boolean isPromoted;

    /**
     * @param owner
     * @param square
     * @throws AnimalChessException
     */
    //Constructor
    public Chick(Player owner, Square square) throws AnimalChessException {
        super(owner, square);
    }

    public boolean getIsPromoted() {
        return isPromoted;
    }

    @Override //Override Get Legal Moves for Chick
    public ArrayList<Square> getLegalMoves() {
        //Set new Array List for ChickList
        ArrayList<Square> chickList = new ArrayList<Square>();

//IF CHICK IS PROMOTED --> PLAYER 1
        if (this.getIsPromoted()) {
            if (getOwner().getPlayerNumber() == 1) {
                //CurrRow-1, CurrCol-1 (diagonal moves for player 1)
                if ((getSquare().getRow() - 1 >= 0) && (getSquare().getCol() - 1 >= 0)) {
                    if (Square.board[getSquare().getRow() - 1][getSquare().getCol() - 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol() - 1]);
                    } else if (Square.board[getSquare().getRow() - 1][getSquare().getCol() - 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol() - 1]);
                    }
                }
                //CurrRow-1, CurrCol+1 (diagonal moves for player 1)
                if ((getSquare().getRow() - 1 >= 0) && (getSquare().getCol() + 1 < 3)) {
                    if (Square.board[getSquare().getRow() - 1][getSquare().getCol() + 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol() + 1]);
                    } else if (Square.board[getSquare().getRow() - 1][getSquare().getCol() + 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol() + 1]);
                    }
                }

                //CurrRow-1, CurrCol
                if (getSquare().getRow() - 1 >= 0) {
                    if (Square.board[getSquare().getRow() - 1][getSquare().getCol()].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol()]);
                    } else if (Square.board[getSquare().getRow() - 1][getSquare().getCol()].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol()]);
                    }
                }

                //CurrRow, CurrCol-1
                if (getSquare().getCol() - 1 >= 0) {
                    if (Square.board[getSquare().getRow()][getSquare().getCol() - 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() - 1]);
                    } else if (Square.board[getSquare().getRow()][getSquare().getCol() - 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() - 1]);
                    }
                }
                //CurrRow, CurrCol+1
                if (getSquare().getCol() + 1 < 3) {
                    if (Square.board[getSquare().getRow()][getSquare().getCol() + 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() + 1]);
                    } else if (Square.board[getSquare().getRow()][getSquare().getCol() + 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() + 1]);
                    }
                }
                //CurrRow +1, CurrCol
                if (getSquare().getRow() + 1 < 4) {
                    if (Square.board[getSquare().getRow() + 1][getSquare().getCol()].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol()]);
                    } else if (Square.board[getSquare().getRow() + 1][getSquare().getCol()].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol()]);
                    }
                }

//IF CHICK IS PROMOTED --> PLAYER 0
            } else if (getOwner().getPlayerNumber() == 0) {

                //CurrRow+1, CurrCol-1 (diagonal moves for player 0)
                if ((getSquare().getRow() + 1 < 4) && (getSquare().getCol() - 1 >= 0)) {
                    if (Square.board[getSquare().getRow() + 1][getSquare().getCol() - 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol() - 1]);
                    } else if (Square.board[getSquare().getRow() + 1][getSquare().getCol() - 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol() - 1]);
                    }
                }

                //CurrRow+1, CurrCol+1 (diagonal moves for player 0)
                if ((getSquare().getRow() + 1 < 4) && (getSquare().getCol() + 1 < 3)) {
                    if (Square.board[getSquare().getRow() + 1][getSquare().getCol() + 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol() + 1]);
                    } else if (Square.board[getSquare().getRow() + 1][getSquare().getCol() + 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol() + 1]);
                    }
                }
                //CurrRow-1, CurrCol
                if (getSquare().getRow() - 1 >= 0) {
                    if (Square.board[getSquare().getRow() - 1][getSquare().getCol()].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol()]);
                    } else if (Square.board[getSquare().getRow() - 1][getSquare().getCol() + 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol()]);
                    }
                }

                //CurrRow, CurrCol-1
                if (getSquare().getCol() - 1 >= 0) {
                    if (Square.board[getSquare().getRow()][getSquare().getCol() - 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() - 1]);
                    } else if (Square.board[getSquare().getRow()][getSquare().getCol() - 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() - 1]);
                    }
                }
                //CurrRow, CurrCol+1
                if (getSquare().getCol() + 1 < 3) {
                    if (Square.board[getSquare().getRow()][getSquare().getCol() + 1].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() + 1]);
                    } else if (Square.board[getSquare().getRow()][getSquare().getCol() + 1].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow()][getSquare().getCol() + 1]);
                    }
                }
                //CurrRow+1, CurrCol
                if (getSquare().getRow() + 1 < 4) {
                    if (Square.board[getSquare().getRow() + 1][getSquare().getCol()].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol()]);
                    } else if (Square.board[getSquare().getRow() + 1][getSquare().getCol()].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol()]);
                    }
                }
            }
        }
//IF CHICK IS NOT PROMOTED
        else {
            //Forward moves for player 0
            if (getOwner().getPlayerNumber() == 0) {
                //PLAYER 0 (r+1, c)
                if (getSquare().getRow() + 1 < 4) {
                    if (Square.board[getSquare().getRow() + 1][getSquare().getCol()].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol()]);
                    } else if (Square.board[getSquare().getRow() + 1][getSquare().getCol()].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() + 1][getSquare().getCol()]);
                    }
                }
                //Forward moves for player 1
            } else if (getOwner().getPlayerNumber() == 1) {
                //PLAYER 1 (r-1, c)
                if (getSquare().getRow() - 1 >= 0) {
                    if (Square.board[getSquare().getRow() - 1][getSquare().getCol()].getPiece() == null) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol()]);
                    } else if (Square.board[getSquare().getRow() - 1][getSquare().getCol()].getPiece().getOwner() != getOwner()) {
                        chickList.add(Square.board[getSquare().getRow() - 1][getSquare().getCol()]);
                    }
                }
            }
        }
        return chickList;
    }

    /**
     * @param toSquare
     */
    @Override
    public void move(Square toSquare) {
        //If getLegalMoves contains toSquare, and the square is not null and the square owner is not this owner --> CAPTURE
        if (getLegalMoves().contains(toSquare)) {
            if ((toSquare.getPiece() != null) && (toSquare.getPiece().getOwner() != getOwner())) {
                toSquare.getPiece().beCaptured(getOwner());
            }
            //If getLegalMoves contains toSquare --> set the piece to null, set square toSquare, set the piece on toSquare piece
            getSquare().setPiece(null);
            setSquare(toSquare);
            getSquare().setPiece(this);

        }

        //If player 0 reaches row 3 --> PROMOTE
        if (getOwner().getPlayerNumber() == 0) {
            if (getSquare().getRow() == 3) {
                promote();
            }
        }
        //If player 1 reaches row 0 --> PROMOTE
        else {
            if (getSquare().getRow() == 0) {
                promote();
            }

        }
    }

    public void promote() {
        isPromoted = true;

    }

}
