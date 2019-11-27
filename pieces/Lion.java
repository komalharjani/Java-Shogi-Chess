package pieces;

import exceptions.AnimalChessException;
import game.*;

public class Lion extends Piece {

    /**
     * @param owner
     * @param square
     * @throws AnimalChessException
     */
    public Lion(Player owner, Square square) throws AnimalChessException {
        super(owner, square);

    }

    /**
     * @param capturer
     */
    @Override
    public void beCaptured(Player capturer) {
        //set owner of square above to capture
        setOwner(capturer);
        if (this.getOwner() == capturer) {
            this.getOwner().setHasWon(true);
            getSquare().getGame().getLionWinner();
        }

    }

}

