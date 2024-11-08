package Task_72;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание сканера для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Вывод приглашения для ввода первого числа
        System.out.print("Введите первое число (m): ");

        // Ввод первого числа в переменную m
        double m = scanner.nextDouble();

        // Вывод приглашения для ввода второго числа
        System.out.print("Введите второе число (n): ");

        // Ввод второго числа в переменную n
        double n = scanner.nextDouble();

        // Находим ближайшее к 10 число
        if (Math.abs(m - 10) < Math.abs(n - 10)) {
            System.out.println("Ближайшее к 10 число: " + m);
        } else if (Math.abs(n - 10) < Math.abs(m - 10)) {
            System.out.println("Ближайшее к 10 число: " + n);
        } else {
            System.out.println("Оба числа равноудалены от 10: " + m + " и " + n);
        }

        // Закрытие сканера для освобождения ресурсов
        scanner.close();
    }
}