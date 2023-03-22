package org.example;

public class MoodAnalyserException extends Exception {
    public enum ExceptionType {
        NULL, EMPTY
    }

    public ExceptionType type;

    public MoodAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
