package org.example;
/*
@author   $Baranska_Viktoriia
@project   $Roman_To_Integer
@class  $444A
@version  1.0.0
@since 29.09.2024 - 18.43
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Використання Scanner для отримання вводу від користувача
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть римське число (або 'exit' для виходу): ");
            String input = scanner.nextLine().toUpperCase(); // Перетворюємо на верхній регістр

            // Перевірка на вихід з програми
            if (input.equalsIgnoreCase("exit")) { // Використовуємо ignoreCase для зручності
                System.out.println("Вихід з програми.");
                break;
            }

            try {
                int arabicNumber = RomanArabicConverter.romanToArabic(input); // Виклик методу
                System.out.println(input + " -> " + arabicNumber); // Виведення результату
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Обробка виключень
            }
        }
        scanner.close(); // Закриття сканера
    }
}
