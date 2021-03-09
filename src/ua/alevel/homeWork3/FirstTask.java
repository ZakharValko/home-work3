package ua.alevel.homeWork3;

import java.util.Locale;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Убираем пробелы из строки
        String noSpaces = s.replace(" ", "");
        System.out.println(noSpaces);

        // Пишем строку без больших букв
        String lowNoSpace = noSpaces.toLowerCase(Locale.ROOT);
        System.out.println(lowNoSpace);

        String reverseString = reverseWithCharArray(lowNoSpace);
        System.out.println(reverseString);

        // Определяем является ли строка полиндромом
        if (lowNoSpace.equals(reverseString)) {
            System.out.println("Строка является полиндромом");
        } else {
            System.out.println("Нет, строка не является полиндромом");
        }
    }

    // Метод для записи строки в обратном порядке
    public static String reverseWithCharArray(String inputString) {
        char[] charArray = inputString.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        return resultString;
    }
}
