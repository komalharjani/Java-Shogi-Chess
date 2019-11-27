package exceptions;

public class AnimalChessException extends java.lang.Exception {
    String msg;

    public AnimalChessException(String msg) {

        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
 
