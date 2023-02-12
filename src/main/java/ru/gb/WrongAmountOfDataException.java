package ru.gb;

public class WrongAmountOfDataException extends RuntimeException {
    public WrongAmountOfDataException(String s) {
        super(s);
    }
}
