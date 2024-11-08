package Task_75;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Генерация случайного трёхзначного натурального числа
        Random random = new Random();
        int chislo = random.nextInt(900) + 100; // Диапазон от 100 до 999

        // Нахождение наибольшей цифры
        int najbolshayaCifra = najbolshayaCifra(chislo);

        // Вывод результата
        System.out.println("В числе " + chislo + " наибольшая цифра " + najbolshayaCifra);
    }


    public static int najbolshayaCifra(int chislo) {
        int[] cifry = new int[3];

        // Разбиение числа на отдельные цифры
        cifry[0] = chislo / 100; // Сотни
        cifry[1] = (chislo / 10) % 10; // Десятки
        cifry[2] = chislo % 10; // Единицы

        // Нахождение максимальной цифры
        return Math.max(Math.max(cifry[0], cifry[1]), cifry[2]);
    }
}