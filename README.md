## Учебный проект "Решение алгоритмических задач"
### A. Покраска деревьев

| <!-- -->            | <!-- -->                         |
|---------------------|----------------------------------|
| Ограничение времени | 1 секунда                        |
| Ограничение памяти  | 64Mb                             |
| Ввод	               | стандартный ввод или input.txt   |
| Вывод	              | стандартный вывод или output.txt |

Вася и Маша участвуют в субботнике и красят стволы деревьев в белый цвет. 
Деревья растут вдоль улицы через равные промежутки в 1 метр. Одно из деревьев
обозначено числом ноль, деревья по одну сторону занумерованы положительными
числами 1, 2 и т.д., а в другую — отрицательными − 1 , − 2 и т.д.
Ведро с краской для Васи установили возле дерева P, а для Маши — возле дерева
Q. Ведра с краской очень тяжелые и Вася с Машей не могут их переставить,
поэтому они окунают кисть в ведро и уже с этой кистью идут красить дерево.
Краска на кисти из ведра Васи засыхает, когда он удаляется от ведра более
чем на V метров, а из ведра Маши — на M метров. Определите, сколько деревьев
может быть покрашено.

**Формат ввода**

В первой строке содержится два целых числа P и V — номер дерева, у которого
стоит ведро Васи и на сколько деревьев он может от него удаляться.

Во второй строке содержится два целых числа Q и M — аналогичные данные для
Маши.

Все числа целые и по модулю не превосходят 10^8.

**Формат вывода**

Выведите одно число — количество деревьев, которые могут быть покрашены.

**Пример:**

| Ввод | Вывод |
|:----:|:-----:|
| 0 7  |  25   |
| 12 5 |       |

### C. Форматирование файла
| <!-- -->            | <!-- -->                         |
|---------------------|----------------------------------|
| Ограничение времени | 1 секунда                        |
| Ограничение памяти  | 256Mb                            |
| Ввод	               | стандартный ввод или input.txt   |
| Вывод	              | стандартный вывод или output.txt |

Петя - начинающий программист. Сегодня он написал код из n строк.
К сожалению оказалось, что этот код трудно читать. Петя решил
исправить это, добавив в различные места пробелы. А точнее, для
i-й строки ему нужно добавить ровно a с индексом i пробелов.
Для добавления пробелов Петя выделяет строку и нажимает на одну
из трёх клавиш: Space, Tab, и Backspace. При нажатии на Space в
строку добавляется один пробел. При нажатии на Tab в строку
добавляются четыре пробела. При нажатии на Backspace в строке
удаляется один пробел. Ему хочется узнать, какое наименьшее 
количество клавиш придётся нажать, чтобы добавить необходимое
количество пробелов в каждую строку. Помогите ему!

**Формат ввода**
Первая строка входных данных содержит одно целое положительное число
n
(
1
≤
n
≤
1
0
5
)
– количество строк в файле.
Каждая из следующих
n
строк содержит одно целое неотрицательное число
a
i
(
0
≤
a
i
≤
1
0
9
)
– количество пробелов, которые нужно добавить в
i
-ю строку файла.

**Формат вывода**
Выведите одно число – минимальное количество нажатий, чтобы добавить в каждой строке необходимое количество пробелов.
**Пример:**

| Ввод | Вывод |
|:----:|:-----:|
|  5   |   8   |
|  1   |       |
|  4   |       |
|  12  |       |
|  9   |       |
|  0   |       |

**Примечания**
В примере можно:

1 раз нажать на Space в первой строке.

1 раз нажать на Tab на второй строке.

3 раза нажать на Tab в третьей строке.

2 раза нажать на Tab и один раз нажать на Space в четвёртой строке. 

Ничего не нажимать в пятой строке.

**В итоге** получается
1 + 1 + 3 + 3 = 8
нажатий. Можно доказать, что нельзя добавить необходимое количество пробелов за
7
нажатий или меньше.
