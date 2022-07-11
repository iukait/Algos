import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class DeleteSpaceTest {
    @Test
    // String=""@
    @Order(1)
    public void testStringIsEmpty() {
        String emptyString = "";

        DeleteSpace deleteSpace = new DeleteSpace();
        String actualResult=deleteSpace.deleteSpace(emptyString);

        Assertions.assertEquals("Строка пустая",actualResult);
    }
    @Test
    @Order(2)
    public void testStringIsNull() {
        String nullString = null;

        DeleteSpace deleteSpace = new DeleteSpace();
        String actualResult=deleteSpace.deleteSpace(nullString);

        Assertions.assertEquals("",actualResult);
    }

    @Test
    @Order(3)
    public void testStringwithSpace() {
        String spaceString = "  El   ica  ";

        DeleteSpace deleteSpace = new DeleteSpace();
        String actualResult=deleteSpace.deleteSpace(spaceString);

        Assertions.assertEquals("Лишние пробелы удалены.",actualResult);
    }
    @Test
    @Order(4)
    public void testStringwithoutSpace() {
        String spaceString = "Elica";

        DeleteSpace deleteSpace = new DeleteSpace();
        String actualResult=deleteSpace.deleteSpace(spaceString);

        Assertions.assertEquals("Пробелов не было",actualResult);
    }
}
