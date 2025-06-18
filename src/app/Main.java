package app;
//Імпортуємо клас Method для роботи з методами через рефлексію

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        //Створюємо масив чисел
        int[] numbers = {10, 20, 30, 40, 50};
//Викликаємо метод finMax з класу ArrayUtils
        int max = ArrayUtils.findMax(numbers);
        //Викликаємо метод calculateAverage з класу ArrayUtils
        double avg = ArrayUtils.calculateAverage(numbers);

        //Виводимо результат в консоль
        System.out.println("Max: " + max);
        System.out.println("Average " + avg);
        System.out.println();

//Отримуємо клас ArrayUtils через рефлексію
        Class<ArrayUtils> clas = ArrayUtils.class;
        //Отримуємо всі методи класу
        Method[] methods = clas.getDeclaredMethods();
//Проходимо по кожному класу
        for (Method method : methods) {
            //Якщо метод має анотації MethodInfo та Author
            if (method.isAnnotationPresent(MethodInfo.class) && method.isAnnotationPresent(Author.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class); //Отримуємо анотацію MethodInfo
                Author author = method.getAnnotation(Author.class); //Отримуємо анотацію Author

//Виводимо інформацію про метод
                System.out.println("Method name: " + methodInfo.name());
                System.out.println("Return type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());
                //Виводимо ім'я та прізвище автора
                System.out.println("Author: " + author.firstName() + " " + author.lastName());
                System.out.println("---------------------------");
            }
        }
    }
}
