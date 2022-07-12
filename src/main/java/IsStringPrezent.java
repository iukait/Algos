public class IsStringPrezent {
    /** Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.*/
    public static void main(String[] args) {
        System.out.println(isStringPrezent2("dfgh;dklfgg   g;dfklg "));
    }
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
    public static boolean isStringPrezent2(String text){
        return text.contains("Java");

    }

}
