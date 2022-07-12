public class CapitalizeWords {
    //Напишите метод, кторый принимает на вход название города и исправляет написание:
    //Test Data:
    //“ташкент” → “Ташкент”
    //“ЧикаГО” → “Чикаго”
    public static void main(String[] args) {
        System.out.println(capitalizeWords1("ташкент"));
        System.out.println(capitalizeAllWords("ташкент  я люблю тебя"));
    }

    public static String capitalizeWords1(String str) {
        if (str != null && str.length() != 0) {
            str = str.trim().toLowerCase();
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return "Empty String";
    }

    //!!!!!! REDO
    //Напишите метод, кторый принимает на вход название города и исправляет написание:
//Test Data:
    //“ташкент  я люблю тебя” → “Ташкент Я Люблю Тебя”
    public static String capitalizeAllWords(String str) {
        if (str != null && str.length() != 0) {
            //делаем из строки новую строку с больщой буквы
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.println(str);

            String result = "";
            for (int i = 0; i < str.length(); i++) {
              //  if (str.charAt(i) == 32) {
                if(str.equals("")){
                    result = str.substring(0, 1).toUpperCase() + str.substring(1) +
                            str.substring(str.charAt(i + 1), str.charAt(i + 2)) + str.substring(str.charAt(i + 2));
                    // }
                    return result;
                }
            }

        }return "Empty String";
    }
}

