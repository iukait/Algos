import java.sql.SQLOutput;

public class IsPalidrome {

    public static boolean isPaligrome(String polodrome) {
        if (polodrome.length() == 1 || polodrome.length() == 0) {
            return true;
        }
        if (polodrome.charAt(0) == polodrome.charAt(polodrome.length() - 1)) {
            return isPaligrome(polodrome.substring(1, polodrome.length() - 1));
        }
        return false;
    }



}
