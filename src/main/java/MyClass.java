import java.util.Random;

public class MyClass {


    public static void main(String[] args) {
        String[] catsNames = {"Черныш", "Мурка", "Мурзик", "Рыжик"};
        // printArray(catsNames);
        String[] catsColors = {"red", "black", "grey", "white"};
        int[] catsAges = {1, 2, 3, 4};

        boolean[] isCatBlack = new boolean[catsNames.length];
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].contains("black")) {
                isCatBlack[i] = true;
            } else {
                isCatBlack[i] = false;
            }
        }
        Util.booleanPrintArray(isCatBlack);

        System.out.println("---------------Task 11---------------------------");
        if ((catsColors.length == isCatBlack.length) && (catsColors.length != 0)) {
            for (int i = 0; i < catsColors.length; i++) {
                if (catsColors[i].equals("white") && isCatBlack[i] == false) {
                    System.out.println("Накорми кота!");
                }
            }
        }

        Util.stringPrintArray(catsNames);

        for (int i = 0; i < catsNames.length; i++) {
            if ((catsNames.length == catsAges.length) && (catsNames.length == catsColors.length) && (catsNames.length != 0)) {
                if (i == catsNames.length - 1) {
                    System.out.println(catsNames[i] + "," + catsAges[i] + "," + catsColors[i]);
                }
            }
        }
        System.out.println(catsAges[catsAges.length - 1] + "," + catsColors[catsColors.length - 1] + "," + catsNames[catsNames.length - 1]);

        System.out.println("''''''''''''''''''''''''Task 12''''''''''''''");
        /*Распечатать средний возраст котов из массива catsAges*/
        double avg;
        double sum = 0.0;
        for (int i = 0; i < catsAges.length; i++) {
            sum += catsAges[i];
        }
        System.out.println(avg = sum / catsAges.length);

        System.out.println("''''''''''''''''''''''''Task 13''''''''''''''");
        /*Распечатать возраст самого молодого кота*/
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > max) {
                max = catsAges[i];
            }
        }
        System.out.println(max);
        System.out.println("''''''''''''''''''''''''Task 14''''''''''''''");
        /*Распечатать возраст самого старого кота*/
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < min) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        System.out.println("''''''''''''''''''''''''Task 15''''''''''''''");
        /*Распечатать количество серых котов*/
        int count = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("grey")) {
                count += 1;
            }

        }
        System.out.println("there are " + count + " grey cats");

        System.out.println("''''''''''''''''''''''''Task 16''''''''''''''");
        /*Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет*/
        if ((catsNames.length == catsAges.length) && (catsAges.length != 0)) {
            for (int i = 0; i < catsNames.length; i++) {
                if (i % 2 == 0 && catsAges[i] < 4) {
                    System.out.println(catsNames[i]);
                }
            }
        }
        System.out.println("''''''''''''''''''''''''Task 16-1''''''''''''''");
        /* Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)*/

        int numCount = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                numCount++;
            }
        }
        System.out.println(numCount);
        System.out.println("'''''''''''''''''''''''''''''''''''''");
        int[] arr = new int[numCount];

        for (int i = 0, j = 0; i < arr.length; i++, j += 2) {

            System.out.println(arr[i] += j);
        }
        System.out.println("''''''''''''''''''''''''Task 17''''''''''''''");

        /* Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        Проверить работу метода тестом, если параметр - массив catsAges*/

        System.out.println(Util.getAvgAge(catsAges));

        System.out.println("''''''''''''''''''''''''Task 18''''''''''''''");
        /* Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900*/
        int a = -1000;
        int b = -900;
        int[] arr1 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += i;
        }

        System.out.println("''''''''''''''''''''''''Task 19''''''''''''''");
        //  Создать массив из 10 случайных положительных целых чисел
        int[] arr2 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] += random.nextInt(100) + 10;
            System.out.println(arr2[i]);
        }
    }
}






