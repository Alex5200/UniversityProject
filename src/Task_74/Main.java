package Task_74;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание генератора случайных чисел
        Random random = new Random();

        // Генерация случайного целого числа в отрезке [5;155]
        int randomNumber = random.nextInt(151) + 5; // 151 = 155 - 5 + 1

        // Вывод сгенерированного числа
        System.out.println("Сгенерированное число: " + randomNumber);

        // Проверка, содержится ли число в интервале (25;100)
        if (randomNumber > 25 && randomNumber < 100) {
            System.out.println("Число " + randomNumber + " содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + randomNumber + " не содержится в интервале (25,100)");
        }
    }
}