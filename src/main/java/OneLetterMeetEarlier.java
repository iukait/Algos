public class OneLetterMeetEarlier {
    /*Написать метод,  который принимает на вход 2 буквы и возвращает true, если первая буква встречается раньше второй, иначе метод возвращает false
method(“a”, “m”) → true
method(“m”, “l”) → false
    * */
    public static void main(String[] args) {
        System.out.println(oneLetterMeetEarlier("a","m"));
    }
    public  static boolean oneLetterMeetEarlier(String first, String  second){
        return first.charAt(0) < second.charAt(0);
    }
}
