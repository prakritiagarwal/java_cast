package winprog;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SameOrNahTest {
    @Test
    public void IsSameRetunsTrue()
    {
        String word1 = "Test";
        assertTrue(SameOrNah.IsSame(word1, word1));
    }

    @Test
    public void IsSameRetunsFalse()
    {
        String word1 = "Test";
        String word2 = "Unit";
        assertFalse(SameOrNah.IsSame(word1, word2));
    }
    
}
