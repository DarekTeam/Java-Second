import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Home_5 {
    public static void main(String[] args) {
        // 1.
        Map<String, String> javaLessonsMap = new HashMap<>();
        System.out.println(
                "Задание №1\nИнициализируем словарь в котором будут храниться номра и темы уроков по курсу \"Знакомство с JAVA\"");
        System.out.println();

        // 2.
        System.out.println("Задание №2\nНаполняем словарь информацией:");
        javaLessonsMap.put("Урок 1", "Знакомство с языком программирования Java");
        javaLessonsMap.put("Урок 2", "Почему вы не можете не использовать API");
        javaLessonsMap.put("Урок 3", "Коллекции JAVA: Введение");
        javaLessonsMap.put("Урок 4", "Хранение и обработка данных ч1: приоритетные коллекции");
        javaLessonsMap.put("Урок 5", "Хранение и обработка данных ч2: множество коллекций Map");
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер урока: " + a + ". Тема урока: " + b));
        System.out.println();

        // 3. 
        System.out.println("Задание №3\nПридаем эмоциональную окраску темам уроков:");
        javaLessonsMap.replaceAll((a, b) -> b + "!");
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер урока: " + a + ". Тема урока (с изумлением): " + b));
        System.out.println();

        // 4. 
        Map<String, String> map = new TreeMap<>();
        System.out.println(
                "Задание №1\nИнициализируем словарь в котором будут храниться номра и темы уроков по курсу \"Знакомство с JAVA\"");
        System.out.println();
        System.out.println("Задание №2\nНаполняем словарь информацией:");
        map.put("Урок 1", "Знакомство с языком программирования Java");
        map.put("Урок 2", "Почему вы не можете не использовать API");
        map.put("Урок 3", "Коллекции JAVA: Введение");
        map.put("Урок 4", "Хранение и обработка данных ч1: приоритетные коллекции");
        map.put("Урок 5", "Хранение и обработка данных ч2: множество коллекций Map");
        map.forEach((a, b) -> System.out.println("Номер урока: " + a + ". Тема урока: " + b));
        System.out.println();
    }
}

