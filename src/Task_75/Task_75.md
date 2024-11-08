
### Trace Table

| **Шаг** | **Метод** | **Переменные** | **Входные Данные** | **Выходные Данные/Результат** | **Описание** |
| --- | --- | --- | --- | --- | --- |
| 1    | `main()` | `random` | - | Сгенерировано случайное число | Инициализация генератора случайных чисел |
| 2    | `main()` | `chislo` | - | `542` | Генерация случайного трёхзначного числа (пример) |
| 3    | `najbolshayaCifra(chislo)` | `cifry[3]` | `chislo = 542` | `cifry = [5, 4, 2]` | Разбиение числа на цифры |
| 4    | `najbolshayaCifra(chislo)` | `najbolshayaCifra` | `cifry = [5, 4, 2]` | `5` | Нахождение максимальной цифры |
| 5    | `main()` | Строка вывода | `chislo = 542`, `najbolshayaCifra = 5` | "В числе 542 наибольшая цифра 5" | Формирование и вывод результата |