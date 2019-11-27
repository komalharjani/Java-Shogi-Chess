package pieces;

import exceptions.AnimalChessException;
import game.Player;
import game.Square;

public class Giraffe extends Piece {

    /**
     * @param owner
     * @param square
     * @throws AnimalChessException
     */
    public Giraffe(Player owner, Square square) throws AnimalChessException {
        super(owner, square);
    }
}
