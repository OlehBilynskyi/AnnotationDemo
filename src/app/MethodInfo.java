package app;
//Імпортуємо анотацію Retention, яка дозволяє вказати, як довго зберігається анотація

import java.lang.annotation.Retention;
//Імпортуємо enum RetentionPolicy для вибору політики збереження
import java.lang.annotation.RetentionPolicy;

//Вказуємо, що ця анотація буде зберігатись під час виконання
@Retention(RetentionPolicy.RUNTIME)
//Оголошення нової анотації з назвою MethodInfo
public @interface MethodInfo {
    String name(); //Оголошення елемента - назва методу

    String returnType(); //Тип повернення методу

    String description(); //Опис того, що робить метод
}
