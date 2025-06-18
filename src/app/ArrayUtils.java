package app;

public class ArrayUtils {
    //Вказуємо анотацію MethodInfo з даними про метод findMax
    @MethodInfo(
            name = "findMax", //Назва методу
            returnType = "int", //Метод повертає int
            description = "Finds the maximum number in an array" //Опис дії методу
    )
    //Вказуємо автора методу
    @Author(
            firstName = "Oleh",
            lastName = "Bilynskyi"
    )
    //Метод повертає найбільше число в масиві
    public static int findMax(int[] array) {
        //Ініціалізуємо змінну max першим елементом масиву
        int max = array[0];
        //Проходимо по кожному числу в масиві
        for (int num : array) {
            //Якщо поточне число більше max, оновлюємо max
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //Анотація з описом методу calculateAverage
    @MethodInfo(
            name = "calculateAverage", //Назва методу
            returnType = "double", //Тип повернення - double
            description = "Calculates the average of an array" //Опис
    )

    //Анотація з даними про автора
    @Author(
            firstName = "Ivan",
            lastName = "Shevchenko"
    )

    //Метод обчислює середнє значення елементів масиву
    public static double calculateAverage(int[] array) {
        //Ініціалізуємо суму
        int sum = 0;
        //Проходимо по кожному числу і додаємо до суми
        for (int num : array) {
            sum += num;
        }
        //Ділимо суму на довжину масиву і повертаємо результат
        return (double) sum / array.length;
    }
}