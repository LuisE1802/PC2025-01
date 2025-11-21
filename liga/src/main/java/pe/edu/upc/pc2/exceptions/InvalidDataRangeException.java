package pe.edu.upc.pc2.exceptions;

public class InvalidDataRangeException extends RuntimeException {
    public InvalidDataRangeException(String message) { super(message); }
    public InvalidDataRangeException() { super(); }
}
