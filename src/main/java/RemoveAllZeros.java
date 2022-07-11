public class RemoveAllZeros {
    /*Написать алгоритм RemoveAllZeros.     написать алгоритм, который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.  Метод возвращает обработанную строку, в которой нет нулей.
    Test Data:
     “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
    “ 0000000111“ → “111”
    * */
    public static void main(String[] args) {
        System.out.println(removeAllZeros(   " 0000000111"));
    }
    public static String removeAllZeros(String str){
                String result=str.trim().replace("0","");
        return result.replace(" ","");
    }
}
