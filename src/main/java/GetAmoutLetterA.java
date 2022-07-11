public class GetAmoutLetterA {
     /** Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
        Test Data:
        “Abracadabra” → 5
        “Homenum Revelio” → 0 */
     public static void main(String[] args) {
         System.out.println(getAmoutLetterA("sfsdgdgdf"));
     }

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
    public static int getAmoutLetterAII(String str){
        return str.length()-str
                .toLowerCase()
                .replace("a","")
                .length();
    }

}
