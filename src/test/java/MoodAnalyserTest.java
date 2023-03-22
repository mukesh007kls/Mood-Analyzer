import org.example.MoodAnalyser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MoodAnalyserTest {
    @Test
    public void givenMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Happy mood");
        String mood=moodAnalyser.analyserMood();
        assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMoodShouldReturnSad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("i am in Sad mood");
        String mood=moodAnalyser.analyserMood();
        assertEquals("SAD",mood);
    }

    @Test
    public void givenNULLMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood=moodAnalyser.analyserMood();
        assertEquals("HAPPY",mood);
    }
}
