import com.google.inject.spi.ProviderWithExtensionVisitor;

import java.util.Arrays;

public class Util {
    public static void booleanPrintArray(boolean[] arr) {
        String str = ";";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + str);
        }
    }

    public static void stringPrintArray(String[] arr) {
        String str = ";";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + str);
        }
    }

    public static void intPrintArray(String[] arr) {
        String str = ";";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + str);
        }
    }

    public static double getAvgAge(int[] arr) {
        double avg;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;

        return avg;
    }

    public static String deleteSpace(String str) {
        if (str.isEmpty()) {
            System.out.println("Строка пустая");
            return str;
        } else if (str.charAt(0) + 1 == 33 && str.charAt(str.length() - 1) + 1 == 33) {
            System.out.println("“Лишние пробелы удалены”. ");
            return str.trim();
        } else {
            System.out.println("Пробелов не было");
        }
        return str;
    }

    /*
   * Написать алгоритм RemoveAlla.
   С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
   * Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
   * Метод возвращает обработанную строку.
   Test Data:
    “    QA4Everyone   “ →  “QA4Everyone“
   “panda   “ → “pnd”
   */
    public static String removeAlla(String str) {
        if (str.isEmpty()) {
            return "Srting is emptpy";
        } else {
            String s = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 97) {
                    s = str.replace("a", "");
                }
            }
            return s;
        }
    }

    /*Написать алгоритм RemoveAllZeros.
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
    Метод возвращает обработанную строку, в которой нет нулей.
    Test Data:
     “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
    “ 0000000111“ → “111”

    * */
    public static String RemoveAllZeros(String numbers) {
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
    /*
        * Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
        Test Data:
        “Abracadabra” → 5
        “Homenum Revelio” → 0 */

    public static int getAmoutLetterA(String str) {
        int count = 0;
        String lowCaseString = str.toLowerCase();
        if (!lowCaseString.isEmpty()) {
            for (int i = 0; i < lowCaseString.length(); i++) {
                if (lowCaseString.charAt(i) == 97) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
     * Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.*/
    public static boolean isStringPrezent(String text) {
        if (!text.isEmpty()) {
            String[] wordsArr = text.split(" ");
            for (int i = 0; i < wordsArr.length; i++) {
                if (wordsArr[i].equals("Java")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
    точку и кавычки в конце строки с помощью метода concat()
    Test Data:
    “One” → ““One.””
    “    TWO  “ → ““TWO.””
    * */
    public static String addQuotes(String str) {
        String quetesSring = str.concat("\"\".");
        return quetesSring;
    }


    //    public static String correctWord(String string) {
//        String superWord="";
//        if (!string.isEmpty()) {
//            String correctword = string.toLowerCase();
//
//            for( int i=0;i<correctword.length();i++){
//
//                    correctword.charAt(0)==correctword.charAt(0).toUpperCase();
//                }
//            }
//            //superWord= correctword.replace(Integer.toString(correctword.charAt(0)), Integer.toString (correctword.charAt(0)).toUpperCase());
//
//           // System.out.println(Integer.toString(correctword.charAt(0)));
//        }
//
//    }
    //перевести строку в массив
    public static String[] convertStringToArray(String str) {
        String[] strArray = new String[]{};
        strArray = str.split((""));
        return strArray;
    }

    //Напишите метод, кторый принимает на вход название города и исправляет написание:
    //Test Data:
    //“ташкент” → “Ташкент”
    //“ЧикаГО” → “Чикаго”
    public static String capitalizeWords(String str) {
        if (str != null && str.length() != 0) {
            str = str.trim().toLowerCase();
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return "Empty String";
    }

    //Напишите метод, кторый принимает на вход название города и исправляет написание:
//Test Data:
    //“ташкент  я люблю тебя” → “Ташкент Я Люблю Тебя”
    public static String capitalizeAllWords(String str) {
        if (str != null && str.length() != 0) {
           //делаем из строки новую строку с больщой буквы
            str=str.substring(0,1).toUpperCase()+str.substring(1);
            System.out.println(str);
            String result="";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 32) {
                    result =str.substring(0,1).toUpperCase()+str.substring(1)+
                            str.substring(str.charAt(i+1),str.charAt(i+2))+str.substring(str.charAt(i+2));
                }
                return result;
            }
        }return "Empty String";
    }
}
