public class IsFirstLastLetterSame {
    /**
     * Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и заканчивается на одинаковую букву, и faulse иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */
    public static void main(String[] args) {
        System.out.println(isFirstLastLetterSame("Abracadabra"));
        String text = "Abracadabra";
        System.out.println(text.charAt(text.length() - 1));
        System.out.println(isFirstLastLetterSame2("Abracadabr"));
    }

    public static boolean isFirstLastLetterSame(String text) {
        return text
                .trim()
                .toLowerCase()
                .charAt(0)
                == text
                .charAt(text.length() - 1);
    }

    public static boolean isFirstLastLetterSame2(String text) {
        return text.toLowerCase().substring(0,1).equals( text.substring(text.length() - 1));
    }
}
