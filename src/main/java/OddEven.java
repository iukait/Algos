public class OddEven {
    //   Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,
//   если число нечетное, и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.

    public String findOddEven(long num) {
        if (num <= -2147483648L||num >= 2147483647L  ) {
            return "Undefined";
        }
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
