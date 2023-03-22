import org.example.MoodAnalyser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MoodAnalyserTest {
    @Test
    public void givenMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyserMood("I am in Happy mood");
        assertEquals("HAPPY",mood);
    }

    @Test
    public void givenMoodShouldReturnSad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyserMood("i am in Sad mood");
        assertEquals("SAD",mood);
    }

    @Test
    public void givenMoodShouldReturnIncorrect(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyserMood("i am fine");
        assertEquals("Incorrect mood",mood);
    }
}
