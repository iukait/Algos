public class RemoveAllZeros {
    /**Написать алгоритм RemoveAllZeros.     написать алгоритм, который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.  Метод возвращает обработанную строку, в которой нет нулей.
    Test Data:
     “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
    “ 0000000111“ → “111”
    * */
    public static void main(String[] args) {
        System.out.println(removeAllZeros(" 0000000111"));
    }

    public static String removeAllZeros(String str) {
        return str.trim().replace("0", "").replace(" ", "");

    }

    public static String removeAllZeros1(String numbers) {
        String str = "";
        String str1 = "";
        if (!numbers.isEmpty()) {
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) == 48) {
                    str = numbers.replace("0", "");
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) + 1 == 33)) {
                    str1 = str.replace(" ", "");
                }
            }
        }
        return str1;

    }
}
