import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String input = null;
        Roman converter = new Roman();
        System.out.print("Введите выражение: ");
        calc(input);
    }
    public static String calc(String input) throws Exception {
        Scanner scn = new Scanner(System.in);
        String expression = scn.nextLine();
        int a = 0;
        int b = 0;
        int result = 0;
        String[] array = expression.split(" ");
        for (String element : array) {
        }
        if (array.length != 3) throw new Exception("Строка не является математической операцией");
        boolean isRoman;
        if (Roman.isRoman(array[0]) == Roman.isRoman(array[2])) {
            isRoman = Roman.isRoman(array[0]);
        } else throw new Exception("Числа должны быть арабскими или римскими одновременно");

        if (isRoman) {
            a = Roman.romanToInt(array[0]);
            if (a < 0 || a > 10) throw new Exception("Число должно быть от 1 до 10 включительно");
            b = Roman.romanToInt(array[2]);
            if (b < 0 || b > 10) throw new Exception("Число должно быть  от 1 до 10 включительно");

        } else {
            a = Integer.parseInt(array[0]);
            if (a < 0 || a > 10) throw new Exception("Число должно быть от 1 до 10 включительно");
            b = Integer.parseInt(array[2]);
            if (b < 0 || b > 10) throw new Exception("Число должно быть  от 1 до 10 включительно");
        }
        if (expression.contains("+")) {
            result = a + b;
        } else if (expression.contains("-")) {
            result = a - b;
        } else if (expression.contains("*")) {
            result = a * b;
        } else if (expression.contains("/")) {
            {
                result = a / b;
            }
        } else throw new Exception("Неверное выражение");
        if (isRoman) {
            if (result < 1) throw new Exception("Число меньше единицы");
            else {
                System.out.println(Roman.intToRoman(result));
            }
        } else {
            input = Integer.toString(result);
            System.out.println(input);
        }
        return input;
    }
}
