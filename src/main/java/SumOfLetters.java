public class SumOfLetters {
    /**
     * Написать метод, который возвращает сумму всех букв слова
     * “abc” → 294
     * “ABC” → 198
     * “123” → 0 (это не буквы)//чтобы это проверить нужн ACSII код.Только хначения-65-122
     */

    public static void main(String[] args) {
        System.out.println(sumOfLetters("123"));
        System.out.println("123".matches("[0-9]+"));
        System.out.println(sumOfLetters1("ABC"));

    }

    public static int sumOfLetters(String text) {
        if (text.length() != 0 && text != null) {
            if (!text.matches("[0-9]+")) {
                int sum = 0;
                for (int i = 0; i < text.length(); i++) {
                    sum += text.charAt(i);
                }
                return sum;
            }
            return 0;
        }
        return 0;
    }

    public static int sumOfLetters1(String text) {
        if (text.length() != 0 && text != null) {
            int sum = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 65 && text.charAt(i) <= 122) {
                    sum += text.charAt(i);
                }
            }
            return sum;
        }
        return 0;

    }
}


