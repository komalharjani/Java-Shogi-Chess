package pieces;

import exceptions.AnimalChessException;
import game.*;

import java.util.ArrayList;

public abstract class Piece {

    private Game game;
    private Player owner;
    private game.Square square;

    /**
     * @param owner
     * @param square
     * @throws AnimalChessException
     */
    public Piece(Player owner, Square square) throws AnimalChessException {
        this.owner = owner;
        if (square.getPiece() != null) {
            throw new AnimalChessException("Square occupied.");
        } else {
            square.placePiece(this);
            this.square = square;
        }
    }

    //return an array list of legal moves for each animal
    public ArrayList<Square> getLegalMoves() {

        //New Array List of Legal Moves for Elephant
        ArrayList<Square> elephantList = new ArrayList<Square>();
        //New Array List of Legal Moves for Giraffe
        ArrayList<Square> giraffeList = new ArrayList<Square>();
        //New Array List of Legal Moves for LionList
        ArrayList<Square> lionList = new ArrayList<Square>();

        //Elephant Moves:

        //r-1, c+1 Diagonal Right-Up
        //r-1, c-1 Diagonal Left-Up
        //r+1, c+1 Diagonal Right-Down
        //r+1, c-1 Diagonal Left-Down

        //Edge Cases --> row - 1 top edge (-1 >=0)
        //row + 1 bottom edge
        //col - 1 --> left edge
        // col + 1 --> right edge


        //If Elephant is an instance of this class (4 legal moves)
        if (this instanceof Elephant) {
            //CurrRow-1, CurrCol+1
            if ((square.getRow() - 1 >= 0) && (square.getCol() + 1 < 3)) { //Edge Cases
                //If currRow-1, CurrCol+1 is empty --> add it to the list
                if (Square.board[square.getRow() - 1][square.getCol() + 1].getPiece() == null) {
                    elephantList.add(Square.board[square.getRow() - 1][square.getCol() + 1]);
                    //Else --> add to the list but also capture the piece
                } else if (Square.board[square.getRow() - 1][square.getCol() + 1].getPiece().owner != owner) {
                    elephantList.add(Square.board[square.getRow() - 1][square.getCol() + 1]);
                    Square.board[square.getRow() - 1][square.getCol() + 1].getPiece().beCaptured(owner);
                }
            }
            //CurrRow-1, CurrCol-1
            if ((square.getRow() - 1 >= 0) && (square.getCol() - 1 >= 0)) {
                if (Square.board[square.getRow() - 1][square.getCol() - 1].getPiece() == null) {
                    elephantList.add(Square.board[square.getRow() - 1][square.getCol() - 1]);
                } else if (Square.board[square.getRow() - 1][square.getCol() - 1].getPiece().owner != owner) {
                    elephantList.add(Square.board[square.getRow() - 1][square.getCol() - 1]);
                    Square.board[square.getRow() - 1][square.getCol() - 1].getPiece().beCaptured(owner);
                }
            }
            //CurrRow+1, CurrCol+1
            if ((square.getRow() + 1 < 4) && (square.getCol() + 1 < 3)) {
                if (Square.board[square.getRow() + 1][square.getCol() + 1].getPiece() == null) {
                    elephantList.add(Square.board[square.getRow() + 1][square.getCol() + 1]);
                } else if (Square.board[square.getRow() + 1][square.getCol() + 1].getPiece().owner != owner) {
                    elephantList.add(Square.board[square.getRow() + 1][square.getCol() + 1]);
                    Square.board[square.getRow() + 1][square.getCol() + 1].getPiece().beCaptured(owner);
                }
            }
            //CurrRow+1, CurrCol-1
            if ((square.getRow() + 1 < 4) && (square.getCol() - 1 >= 0)) {
                if (Square.board[square.getRow() + 1][square.getCol() - 1].getPiece() == null) {
                    elephantList.add(Square.board[square.getRow() + 1][square.getCol() - 1]);
                } else if (Square.board[square.getRow() + 1][square.getCol() - 1].getPiece().owner != owner) {
                    elephantList.add(Square.board[square.getRow() + 1][square.getCol() - 1]);
                    Square.board[square.getRow() + 1][square.getCol() - 1].getPiece().beCaptured(owner);
                }
            }
            return elephantList;
        }
        //New Array List of Legal Moves for Giraffe (4 legal moves)
        else if (this instanceof Giraffe) {
            //CurrRow-1, CurrCol
            if (square.getRow() - 1 >= 0) {
                if (Square.board[square.getRow() - 1][square.getCol()].getPiece() == null) {
                    giraffeList.add(Square.board[square.getRow() - 1][square.getCol()]);
                } else if (Square.board[square.getRow() - 1][square.getCol()].getPiece().owner != owner) {
                    giraffeList.add(Square.board[square.getRow() - 1][square.getCol()]);
                    Square.board[square.getRow() - 1][square.getCol()].getPiece().beCaptured(owner);
                }
            }
            //CurrRow+1, CurrCol
            if (square.getRow() + 1 < 4) {
                if (Square.board[square.getRow() + 1][square.getCol()].getPiece() == null) {
                    giraffeList.add(Square.board[square.getRow() + 1][square.getCol()]);
                } else if (Square.board[square.getRow() + 1][square.getCol()].getPiece().owner != owner) {
                    giraffeList.add(Square.board[square.getRow() + 1][square.getCol()]);
                    Square.board[square.getRow() + 1][square.getCol()].getPiece().beCaptured(owner);
                }
            }
            //CurrRow, CurrCol-1
            if (square.getCol() - 1 >= 0) {
                if (Square.board[square.getRow()][square.getCol() - 1].getPiece() == null) {
                    giraffeList.add(Square.board[square.getRow()][square.getCol() - 1]);
                } else if (Square.board[square.getRow()][square.getCol() - 1].getPiece().owner != owner) {
                    giraffeList.add(Square.board[square.getRow()][square.getCol() - 1]);
                    Square.board[square.getRow()][square.getCol() - 1].getPiece().beCaptured(owner);
                }
            }
            //CurrRow, CurrCol+1
            if (square.getCol() + 1 < 3) {
                if (Square.board[square.getRow()][square.getCol() + 1].getPiece() == null) {
                    giraffeList.add(Square.board[square.getRow()][square.getCol() + 1]);
                } else if (Square.board[square.getRow()][square.getCol() + 1].getPiece().owner != owner) {
                    giraffeList.add(Square.board[square.getRow()][square.getCol() + 1]);
                    Square.board[square.getRow()][square.getCol() + 1].getPiece().beCaptured(owner);
                }
            }
            return giraffeList;
        }

        //New Array List of Legal Moves for lion (8 moves)
        else if (this instanceof Lion) {
            //CurrRow-1, CurrCol-1
            if ((square.getRow() - 1 >= 0) && (square.getCol() - 1 >= 0)) {
                if (Square.board[square.getRow() - 1][square.getCol() - 1].getPiece() == null) {
                    lionList.add(Square.board[square.getRow() - 1][square.getCol() - 1]);
                } else if (Square.board[square.getRow() - 1][square.getCol() - 1].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow() - 1][square.getCol() - 1]);
                    Square.board[square.getRow() - 1][square.getCol() - 1].getPiece().beCaptured(owner);
                }
            }

            //CurrRow-1, CurrCol
            if (square.getRow() - 1 >= 0) {
                if (Square.board[square.getRow() - 1][square.getCol()].getPiece() == null) {
                    lionList.add(Square.board[square.getRow() - 1][square.getCol()]);
                } else if (Square.board[square.getRow() - 1][square.getCol()].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow() - 1][square.getCol()]);
                    Square.board[square.getRow() - 1][square.getCol()].getPiece().beCaptured(owner);
                }
            }
            //CurrRow-1, CurrCol+1
            if ((square.getRow() - 1 >= 0) && (square.getCol() + 1 < 3)) {
                if (Square.board[square.getRow() - 1][square.getCol() + 1].getPiece() == null) {
                    lionList.add(Square.board[square.getRow() - 1][square.getCol() + 1]);
                } else if (Square.board[square.getRow() - 1][square.getCol() + 1].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow() - 1][square.getCol() + 1]);
                    Square.board[square.getRow() - 1][square.getCol() + 1].getPiece().beCaptured(owner);
                }
            }
            //CurrRow, CurrCol-1
            if (square.getCol() - 1 >= 0) {
                if (Square.board[square.getRow()][square.getCol() - 1].getPiece() == null) {
                    lionList.add(Square.board[square.getRow()][square.getCol() - 1]);
                } else if (Square.board[square.getRow()][square.getCol() - 1].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow()][square.getCol() - 1]);
                    Square.board[square.getRow()][square.getCol() - 1].getPiece().beCaptured(owner);
                }
            }

            //CurrRow, CurrCol+1
            if (square.getCol() + 1 < 3) {
                if (Square.board[square.getRow()][square.getCol() + 1].getPiece() == null) {
                    lionList.add(Square.board[square.getRow()][square.getCol() + 1]);
                } else if (Square.board[square.getRow()][square.getCol() + 1].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow()][square.getCol() + 1]);
                    Square.board[square.getRow()][square.getCol() + 1].getPiece().beCaptured(owner);
                }
            }

            //CurrRow+1, CurrCol
            if (square.getRow() + 1 < 4) {
                if (Square.board[square.getRow() + 1][square.getCol()].getPiece() == null) {
                    lionList.add(Square.board[square.getRow() + 1][square.getCol()]);
                } else if (Square.board[square.getRow() + 1][square.getCol()].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow() + 1][square.getCol()]);
                    Square.board[square.getRow() + 1][square.getCol()].getPiece().beCaptured(owner);
                }
            }
            //CurrRow+1, CurrCol-1
            if ((square.getRow() + 1 < 4) && (square.getCol() - 1 >= 0)) {
                if (Square.board[square.getRow() + 1][square.getCol() - 1].getPiece() == null) {
                    lionList.add(Square.board[square.getRow() + 1][square.getCol() - 1]);
                } else if (Square.board[square.getRow() + 1][square.getCol() - 1].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow() + 1][square.getCol() - 1]);
                    Square.board[square.getRow() + 1][square.getCol() - 1].getPiece().beCaptured(owner);
                }
            }
            //CurrRow+1, CurrCol+1
            if ((square.getRow() + 1 < 4) && (square.getCol() + 1 < 3)) {
                if (Square.board[square.getRow() + 1][square.getCol() + 1].getPiece() == null) {
                    lionList.add(Square.board[square.getRow() + 1][square.getCol() + 1]);
                } else if (Square.board[square.getRow() + 1][square.getCol() + 1].getPiece().owner != owner) {
                    lionList.add(Square.board[square.getRow() + 1][square.getCol() + 1]);
                    Square.board[square.getRow() + 1][square.getCol() + 1].getPiece().beCaptured(owner);
                }
            }
            return lionList;
        }
        return null;
    }

    /**
     * @param toSquare
     */
    //Method to Move to A New Square
    public void move(Square toSquare) {
        //get size of Hand
        int handsize = getOwner().getHand().size();
        //if legal moves contains this piece
        if (getSquare().getGame() == null) {
            if ((toSquare.getPiece() != null) && (toSquare.getPiece().owner != owner)) {
                toSquare.getPiece().beCaptured(owner);
            }
            square.setPiece(null);
            square = toSquare;
            square.setPiece(this);

        } else if (getLegalMoves().contains(toSquare)) {
            //if there is a piece - it does not belong to this owner
            square.setPiece(null);
            square = toSquare;
            square.setPiece(this);
        }
        if (getOwner().getHand().size() - handsize > 1) {
            getOwner().getHand().remove(getOwner().getHand().size() - 1);
        }

    }

    /**
     * @param capturer
     */
    public void beCaptured(Player capturer) {
        //Set owner of square above to capturer
        owner = capturer;
        //Add the captured piece to owner's hand
        owner.addPieceToHand(this);
    }

    public Square getSquare() {
        return square;
    }

    /**
     * @param setSquare
     */
    public void setSquare(Square setSquare) {
        square = setSquare;
    }

    public Player getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     */
    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
