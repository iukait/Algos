public class DeleteSpace {
    public  String deleteSpace(String str) {
        if(str!=null){
            if (str.isEmpty()) {
                return "Строка пустая";
            } else if (str.charAt(0) + 1 == 33 && str.charAt(str.length() - 1) + 1 == 33) {
                str.trim();
                return "Лишние пробелы удалены.";
            } else {
                return "Пробелов не было";
            }
        }return "";
    }
}
