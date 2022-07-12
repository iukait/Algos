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
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
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
}


