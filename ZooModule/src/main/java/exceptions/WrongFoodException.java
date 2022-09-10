package exceptions;

public class WrongFoodException extends IllegalArgumentException {
    @Override
    public String getMessage() {
        return "Bad food for this animal";
    }
}
