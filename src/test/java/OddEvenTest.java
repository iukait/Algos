import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OddEvenTest {
    /*
    * Test Data:
    -345 →  “Odd”
    0 →  “Even”
    222222 →  “Even”
    2147483647 + 1 →  “Undefined”
*/
    @Test
    @Order(2)
    public void testOddEvenNegativNumber() {
        int num1 = -345;

        OddEven oddEven = new OddEven();
        String expectedResult = "Odd";
        String actualResult = oddEven.findOddEven(num1);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(1)
    public void testOddEvenZero() {
        int num2 = 0;

        OddEven oddEven = new OddEven();
        String expectedResult = "Even";
        String actualResult = oddEven.findOddEven(num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Order(3)
    @Test
    public void testOddEvenPozitiveNumber() {
        int num3 = 222222;

        OddEven oddEven = new OddEven();
        String expectedResult = "Even";
        String actualResult = oddEven.findOddEven(num3);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(4)
    public void testOddEvenOverflow() {
        int num3 = 2147483647+1;

        OddEven oddEven = new OddEven();
        String expectedResult = "Undefined";
        String actualResult = oddEven.findOddEven(num3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
