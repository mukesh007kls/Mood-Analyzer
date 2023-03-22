package org.example;

public class MoodAnalyser {
   public MoodAnalyser(){
   }

   public String analyserMood(String message){
       if (message.contains("Sad"))
           return "SAD";
       else if (message.contains("Happy"))
           return "HAPPY";
       else return "Incorrect mood";
   }
}