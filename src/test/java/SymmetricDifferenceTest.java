import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceTest {
    private static final Set<Integer> FIRST_SET = new HashSet<>() {
        {
            add(1);
            add(2);
            add(3);
        }
    };

    private static final Set<Integer> SECOND_SET = new HashSet<>() {
        {
            add(2);
            add(3);
            add(4);
        }
    };

    private static final Set<Integer> THIRD_SET = new HashSet<>() {
        {
            add(4);
            add(5);
        }
    };

    private static final Set<Integer> RESULT_WITH_SOME_ELEMENTS = new HashSet<>() {
        {
            add(1);
            add(4);
        }
    };

    private static final Set<Integer> RESULT_WITH_ALL_ELEMENTS = new HashSet<>() {
        {
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }
    };

    private static final Set<Integer> EMPTY_RESULT = new HashSet<>();

    @Test
    public void resultWithSomeDifferentElements() {
        SymmetricDifference<Integer> difference = new SymmetricDifference<>();
        Set<Integer> actualResult = difference.symmetricDifference(FIRST_SET, SECOND_SET);
        Assert.assertEquals("Test failed with actual result: " + actualResult.toString(),
                RESULT_WITH_SOME_ELEMENTS, actualResult);
    }

    @Test
    public void emptyResult() {
        SymmetricDifference<Integer> difference = new SymmetricDifference<>();
        Set<Integer> actualResult = difference.symmetricDifference(FIRST_SET, FIRST_SET);
        Assert.assertEquals("Test failed with actual result: " + actualResult.toString(),
                EMPTY_RESULT, actualResult);
    }

    @Test
    public void resultWithAllDifferentElements() {
        SymmetricDifference<Integer> difference = new SymmetricDifference<>();
        Set<Integer> actualResult = difference.symmetricDifference(FIRST_SET, THIRD_SET);
        Assert.assertEquals("Test failed with actual result: " + actualResult.toString(),
                RESULT_WITH_ALL_ELEMENTS, actualResult);
    }
}
