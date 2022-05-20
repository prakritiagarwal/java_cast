package winprog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestScoresTest {
    @Test
    public void getGradeReturnsAGrade() 
    {
        assertEquals("Your grade is an A", TestScores.getGrade(99));
    }
    
    @Test
    public void getGradeReturnsBGrade() 
    {
        assertEquals("Your grade is B", TestScores.getGrade(85));
    }
}
