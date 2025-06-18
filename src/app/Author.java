package app;
//Імпортуємо анотацію Retention

import java.lang.annotation.Retention;
//Імпортуємо політику збереження
import java.lang.annotation.RetentionPolicy;

//Анотація буде доступна під час виконання
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    //Ім'я та прізвище автора
    String firstName();

    String lastName();
}
