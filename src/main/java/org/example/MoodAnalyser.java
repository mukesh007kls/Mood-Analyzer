package org.example;

public class MoodAnalyser {
    private String message;
   public MoodAnalyser(){
   }
   public MoodAnalyser(String message){
       this.message=message;
   }

   public String analyserMood(){
       if (this.message.contains("Sad"))
           return "SAD";
       else if (this.message.contains("Happy"))
           return "HAPPY";
       else return "Incorrect mood";
   }
}