public class AddQuotes {
    /** Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
     * точку и кавычки в конце строки с помощью метода concat()
     * Test Data:
     * “One” → ““One.””
     * “    TWO  “ → ““TWO.””
     */
    public static StringBuilder addQuotes(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append("\"")
                .append(str)
                .append(".\"");
    }
}
