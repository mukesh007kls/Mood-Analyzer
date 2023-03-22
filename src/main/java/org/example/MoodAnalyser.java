package org.example;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyserMood() throws MoodAnalyserException {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (Exception exception) {
            if (message == null)
                throw new MoodAnalyserException("Enter correct mood,entered null mood",
                        MoodAnalyserException.ExceptionType.NULL);
            else
                throw new MoodAnalyserException("Enter correct mood,empty argument",
                        MoodAnalyserException.ExceptionType.EMPTY);
        }
    }
}