import org.example.MoodAnalyser;
import org.example.MoodAnalyserException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MoodAnalyserTest {
    @Test
    public void givenMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy mood");
        String mood;
        try {
            mood = moodAnalyser.analyserMood();
            assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void givenMoodShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in Sad mood");
        String mood;
        try {
            mood = moodAnalyser.analyserMood();
            assertEquals("SAD", mood);
        } catch (MoodAnalyserException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void giveNULLMoodShouldThrowMoodAnalyserException(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood;
        try {
            mood=moodAnalyser.analyserMood();
        }catch (MoodAnalyserException exception){
            Assert.assertSame(MoodAnalyserException.ExceptionType.NULL,exception.type);
        }
    }

}
