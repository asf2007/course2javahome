package les2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String Value, int row, int col) {
        super(String.format("Invalid value '%s' in array cell[%d][%d], required integer",
                Value, row, col));
    }
}
