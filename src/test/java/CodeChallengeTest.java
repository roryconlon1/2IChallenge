import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CodeChallengeTest {


    @Test
    public void testDuplicatesRemovedByLength() {
        assertEquals(6, CodeChallenge.uniqueNumbers(new Integer[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 6}).length);
        assertEquals(6, CodeChallenge.uniqueNumbers(new Integer[]{1, 12, 2, 2, 3, 3, 4, 4, 5, 5}).length);
        assertEquals(6, CodeChallenge.uniqueNumbers(new Integer[]{100, 100, 78, 78, 36, 36, 24, 24, 17, 5}).length);

    }

    @Test
    public void testAllUniqueVals() {
        Integer[] checkValuesAreUnique = CodeChallenge.uniqueNumbers(new Integer[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 6});
        assertTrue(Arrays.asList(checkValuesAreUnique).contains(1));
        assertTrue(Arrays.asList(checkValuesAreUnique).contains(2));
        assertTrue(Arrays.asList(checkValuesAreUnique).contains(3));
        assertTrue(Arrays.asList(checkValuesAreUnique).contains(4));
        assertTrue(Arrays.asList(checkValuesAreUnique).contains(5));
        assertTrue(Arrays.asList(checkValuesAreUnique).contains(6));
    }

    @Test
    public void testUniqueDescVals() {
        assertArrayEquals(new Integer[]{6, 5, 4, 3, 2, 1}, CodeChallenge.uniqueNumbersDesc(new Integer[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 6}));
        assertArrayEquals(new Integer[]{12, 5, 4, 3, 2, 1}, CodeChallenge.uniqueNumbersDesc(new Integer[]{1, 12, 2, 2, 3, 3, 4, 4, 5, 5}));
        assertArrayEquals(new Integer[]{100, 78, 36, 24, 17, 5}, CodeChallenge.uniqueNumbersDesc(new Integer[]{100, 100, 78, 78, 36, 36, 24, 24, 17, 5}));
    }
}
