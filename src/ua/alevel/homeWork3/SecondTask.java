package ua.alevel.homeWork3;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Считаем количество слов в строке
        int quantity = s.split(" ").length;
        System.out.println(quantity);
    }
}
