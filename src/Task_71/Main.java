/*

 71.Создать программу, проверяющую и сообщающую на экран, является
 ли целое число записанное в переменную n, чётным либо нечётным.

*/
package Task_71;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание сканера для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вывод приглашения для ввода целого числа
        System.out.print("Введите целое число (n): ");

        // Ввод целого числа в переменную n
        int n = scanner.nextInt();

        // Проверка чётности целого числа
        if (n % 2 == 0) {
            System.out.println("Число " + n + " является **чётным**.");
        } else {
            System.out.println("Число " + n + " является **нечётным**.");
        }

        // Закрытие сканера для освобождения ресурсов
        scanner.close();
    }
}