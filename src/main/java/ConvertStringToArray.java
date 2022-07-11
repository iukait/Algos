public class ConvertStringToArray {

    public static char[] stringToArrayChar(String str) {
        char[] stringArrayChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            stringArrayChar[i] = str.charAt(i);
        }
        return stringArrayChar;
    }
}
