**Трейс-таблица**
================

| **Шаг** | **Код** | **Входные Данные** | **Выходные Данные/Действия** | **Состояние Переменных** |
| --- | --- | --- | --- | --- |
| **1** | `Random random = new Random();` | - | - | `random` (инициализирован) |
| **2** | `Scanner scanner = new Scanner(System.in);` | - | - | `scanner` (инициализирован) |
| **3** | `int a = random.nextInt(100);` | - | Генерировано: `a = 14` | `a = 14` |
| **4** | `int b = random.nextInt(100);` | - | Генерировано: `b = 7` | `a = 14`, `b = 7` |
| **5** | `while (b <= a) {... }` **(вход в цикл)** | `b = 7`, `a = 14` | "Ошибка! b должно быть больше a. Введите b еще раз:" | `a = 14`, `b = 7` |
| **6** | `b = scanner.nextInt();` **(в цикле)** | Пользователь вводит: `25` | - | `a = 14`, `b = 25` |
| **7** | `while (b <= a) {... }` **(выход из цикла)** | `b = 25`, `a = 14` | - | `a = 14`, `b = 25` |
| **8** | `int randomNumber = a + random.nextInt(b - a + 1);` | - | Генерировано (например): `randomNumber = 20` | `a = 14`, `b = 25`, `randomNumber = 20` |
| **9** | `System.out.println(...);` | - | "Генерированное псевдослучайное число в диапазоне [14; 25] равно: 20" | `a = 14`, `b = 25`, `randomNumber = 20` |
| **10** | `scanner.close();` | - | - | `scanner` (закрыт), `a = 14`, `b = 25`, `randomNumber = 20` |