import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class AscendingSequenceTest {
    @Test
    @Order(1)
    public void testAscendingSequencePosNumHappyPath() {
        //Arrange
        int start = 0;
        int end = 5;
        int step = 1;
        //Act
        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        //Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testAscendingSequenceNegNumHappyPath() {
        int start = -5;
        int end = 0;
        int step = 1;

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {-5, -4, -3, -2, -1, 0};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testAscendingSequenceStep2HappyPath() {
        int start = -5;
        int end = 0;
        int step = 2;

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {-5, -3, -1};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    // @Ignore
    public void testAscendingSequenceStep3HappyPath() {
        int start = 0;
        int end = 12;
        int step = 3;

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {0, 3, 6, 9, 12};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testAscendingSequencePozNegHappyPath() {
        int start = -3;
        int end = 3;
        int step = 1;

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {-3, -2, -1, 0, 1, 2, 3};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargeThenEndNegativ() {
        int start = 9;
        int end = 3;
        int step = 1;

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsZeroNegativ() {
        int start = 3;
        int end = 9;
        int step = 0;

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsNegativ() {
        int start = 3;
        int end = 9;
        int step = -1;

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);
        int[] expectedResult = {};

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
