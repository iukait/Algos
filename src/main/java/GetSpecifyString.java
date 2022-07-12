public class GetSpecifyString {
    /** Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится между первой и последней буквой-параметром:
Test Data:
“Abracadabra”, “b” → “bracadab”
“Whippersnapper”, “p” → “ppersnapp”

*/
    public static void main(String[] args) {
        String exemple="qwertyuioplkhggw";
        System.out.println( getSpecifyString("Abracadabra",'b'));
        System.out.println( "qwertyuioplkhgg".indexOf("b"));
        System.out.println(exemple.indexOf("w"));
        System.out.println(exemple.lastIndexOf("w"));
        System.out.println(exemple.length());
    }
    public static String getSpecifyString( String str, char letter){
       return str.substring((str.indexOf('b')),str.lastIndexOf('b')+1);
   }
}
