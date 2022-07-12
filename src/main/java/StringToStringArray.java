import java.util.Arrays;

public class StringToStringArray {
    /**
     * Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertStringToArray("QA for Everyone")));
        System.out.println(Arrays.toString(convertStringToStringArray("Александр Сергеевич Пушкин")));
    }

    public static String[] convertStringToArray(String str) {
        return str.split(" ");
    }

    /**
     * Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии, отчества и возвращает массив строк:
     * Test Data:
     * “Александр Сергеевич Пушкин” →
     * {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
     */
    public static String[] convertStringToStringArray(String str) {
 String[] newArray= convertStringToArray(str);
        newArray[0]="Name: "+newArray[0];
        newArray[1]="So Name: "+newArray[1];
        newArray[2]="LastName: "+newArray[2];
        return newArray;
    }
}

