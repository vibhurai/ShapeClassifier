import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeClassifierTest {

    private ShapeClassifier classifier;

    @Before
    public void setUp() {
        classifier = new ShapeClassifier();
    }

    @Test
    public void testLineCorrectGuess() {
        String result = classifier.evaluateGuess("Line,Small,Yes,5");
        assertEquals("Yes", result);
    }

    @Test
    public void testCircleCorrectGuess() {
        String result = classifier.evaluateGuess("Circle,Large,Yes,50,50");
        assertEquals("Yes", result);
    }

    @Test
    public void testEllipseCorrectGuess() {
        String result = classifier.evaluateGuess("Ellipse,Large,No,50,30");
        assertEquals("Yes", result);
    }

    @Test
    public void testEquilateralTriangleCorrectGuess() {
        String result = classifier.evaluateGuess("Equilateral,Large,Yes,100,100,100");
        assertEquals("Yes", result);
    }

    @Test
    public void testIsoscelesTriangleCorrectGuess() {
        String result = classifier.evaluateGuess("Isosceles,Small,No,3,3,4");
        assertEquals("Yes", result);
    }

    @Test
    public void testScaleneTriangleCorrectGuess() {
        String result = classifier.evaluateGuess("Scalene,Small,No,3,4,5");
        assertEquals("Yes", result);
    }

    @Test
    public void testRectangleCorrectGuess() {
        String result = classifier.evaluateGuess("Rectangle,Large,Yes,50,30,50,30");
        assertEquals("Yes", result);
    }

    @Test
    public void testSquareCorrectGuess() {
        String result = classifier.evaluateGuess("Square,Large,Yes,50,50,50,50");
        assertEquals("Yes", result);
    }

    @Test
    public void testIncorrectShapeGuess() {
        String result = classifier.evaluateGuess("Circle,Large,Yes,50,50,50,50");
        assertTrue(result.startsWith("No: Suggestion="));
    }

    @Test
    public void testIncorrectSizeGuess() {
        String result = classifier.evaluateGuess("Circle,Small,Yes,50,50");
        assertEquals("Yes: Wrong Size", result);
    }

    @Test
    public void testIncorrectEvenOddGuess() {
        String result = classifier.evaluateGuess("Circle,Large,No,50,50");
        assertEquals("Yes: Wrong Even/Odd", result);
    }

    @Test
    public void testIncorrectSizeAndEvenOddGuess() {
        String result = classifier.evaluateGuess("Circle,Small,No,50,50");
        assertEquals("Yes: Wrong Size,Wrong Even/Odd", result);
    }

    @Test
    public void testInvalidParameters() {
        String result = classifier.evaluateGuess("Circle,Large,Yes");
        assertEquals("No", result);
    }

    @Test
    public void testNegativeParameter() {
        String result = classifier.evaluateGuess("Line,Small,Yes,-5");
        assertEquals("Yes", result);
    }

    @Test
    public void testLargeParameter() {
        String result = classifier.evaluateGuess("Line,Large,Yes,5000");
        assertEquals("Yes", result);
    }

    @Test
    public void testNotATriangle() {
        String result = classifier.evaluateGuess("Equilateral,Large,Yes,1,1,10");
        assertTrue(result.contains("Suggestion=Not A Triangle"));
    }

    @Test(expected = RuntimeException.class)
    public void testTooManyBadGuesses() {
        classifier.evaluateGuess("Circle,Large,Yes,50,30");
        classifier.evaluateGuess("Circle,Large,Yes,50,30");
        classifier.evaluateGuess("Circle,Large,Yes,50,30");
    }
}