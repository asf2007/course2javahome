package les2;

public class MyArraySizeException extends IllegalArgumentException {
    public MyArraySizeException() {
        super("Invalid array size");
    }
}
