import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeChallengeTest {

    @Test
    public void testMultiply() {
        assertEquals(20, CodeChallenge.simpleCheck(4, 5));
    }

    @Test
    public void testAddition() {
        assertEquals(19, CodeChallenge.checkAddition(9, 4, 6));
    }
}
