public class RemoveAlla {
    /*
  * Написать алгоритм RemoveAlla. написать алгоритм, который принимает на вход строку.  * Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
  * Метод возвращает обработанную строку.
  Test Data:
   “    QA4Everyone   “ →  “QA4Everyone“
  “panda   “ → “pnd”
  */
    public static String removeAlla(String str) {
        if (str != null && !str.isEmpty()) {
            return str.replaceAll("[A,a]", "");
        } else return str;
    }
}
