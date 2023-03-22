package org.example;

public class MoodAnalyser {
    private String message;
   public MoodAnalyser(){
   }
   public MoodAnalyser(String message){
       this.message=message;
   }

   public String analyserMood(){
       try {
           if (this.message.contains("Sad"))
               return "SAD";
           else
               return "HAPPY";
       }catch (NullPointerException exception){
           return "HAPPY";
       }
   }
}