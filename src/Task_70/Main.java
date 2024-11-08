package Task_70;/*
    70.В переменные a и b записаны целые числа, при этом b больше a.
    Создайте программу, которая будет генерировать и выводить на экран
    целое псевдослучайное число из отрезка [a;b]
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Ввод переменных a и b
        Scanner scanner = new Scanner(System.in);
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        // Проверка, что b больше a
        while (b <= a) {
            System.out.println("Ошибка! b должно быть больше a. Введите b еще раз:");
            b = scanner.nextInt();
        }

        // Генерация псевдослучайного числа в диапазоне [a; b]
        int randomNumber = a + random.nextInt(b - a + 1); // +1 чтобы включить b в диапазон

        // Вывод результата
        System.out.println("Генерированное псевдослучайное число в диапазоне [" + a + "; " + b + "] равно: " + randomNumber);

        scanner.close(); // Закрытие сканера для освобождения ресурсов
    }
}