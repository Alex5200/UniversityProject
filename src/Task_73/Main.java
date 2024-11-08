/*
73.В три переменные a, b и c записаны три вещественных числа. Создать
 программу, которая будет находить и выводить на экран
 вещественные корни квадратного уравнения ax2+bx+c=0, либо
 сообщать, что корней нет.
* */

package Task_73;

import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создание генератора случайных чисел
        Random random = new Random();

        // Генерация случайных вещественных чисел для a, b и c
        double a = random.nextInt(100); // Умножаем на 10 для увеличения диапазона
        double b = random.nextDouble() * 10;
        double c = random.nextDouble() * 10;

        System.out.println("Случайно сгенерированные коэффициенты:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Вычисление дискриминанта
        double d = b * b - 4 * a * c;

        // Вывод результатов в зависимости от дискриминанта
        if (d > 0) {
            // Два вещественных корня
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Квадратное уравнение имеет два вещественных корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            // Один вещественный корень (кратный)
            double x = -b / (2 * a);
            System.out.println("Квадратное уравнение имеет один вещественный корень (кратный):");
            System.out.println("x = " + x);
        } else {
            // Нет вещественных корней (комплексные корни)
            System.out.println("Квадратное уравнение не имеет вещественных корней (имеет комплексные корни).");

        }
    }
}