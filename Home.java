import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home{
         // 1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки). все символы другой строки
    public static void main (String firstText, String secondText) {
        Pattern pattern = Pattern.compile(secondText);
        Matcher matcher = pattern.matcher(firstText);
        while (matcher.find()) {
            System.out.println(firstText.substring(matcher.start(), matcher.end()));
        }
}
// 2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
    public static  boolean searchPalindrom(String firstStr, String secondStr) {
        return firstStr.equals(new StringBuilder(secondStr).reverse().toString());
    }
    // 4 Дано два числа, например 3 и 56, необходимо составить следующие строки:
    // 3 + 56 = 59
    // 3 – 56 = -53
    // 3 * 56 = 168
    // Используем метод StringBuilder.append().
    public static String compilerMathToStr(int num1, int num2, char sign) {
        StringBuilder mathTask = new StringBuilder();
        mathTask.append(num1).append(" ").append(sign).append(" ").append(num2).append(" = ");
        switch (sign) {
            case '+':
                mathTask.append(num1 + num2);
                break;
            case '-':
                mathTask.append(num1 - num2);
                break;
            case '*':
                mathTask.append(num1 * num2);
                break;
        }
        return mathTask.toString();
    }

// 5 Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.insert(),
    // StringBuilder.deleteCharAt().
    public static String replacEqual(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.deleteCharAt(index).insert(index, "равно").toString();
    }
    // 6 *Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.replace().
    public static String nextReplacEquel(String mathTask) {
        StringBuilder task = new StringBuilder(mathTask);
        int index = task.indexOf("=");
        return task.replace(index, index + 1, "equel").toString();
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первую строку: ");
        String str1 = iScanner.nextLine();
        System.out.printf("Введите вторую строку: ");
        String str2 = iScanner.nextLine();
        iScanner.close();

        // 1
        System.out.println(
                "1.\nНиже все наименьшие окна первой строки, содержащие все символы второй строки (при их наличии): ");
        minWindow(str1, str2);

        // 2
        System.out.println();
        if (searchPalindrom(str1, str2)) {
            System.out.println("2.\nВведенные вами строки являются вращением друг друга");
        } else
            System.out.println("2.\nВведенные вами строки НЕ являются вращением друг друга");

               // 4
        System.out.println();
        System.out.println("4.\nПримеры в виде строк:");
        int a = 3, b = 56;
        System.out.println(compilerMathToStr(a, b, '+'));
        System.out.println(compilerMathToStr(a, b, '-'));
        System.out.println(compilerMathToStr(a, b, '*'));

        // 5
        System.out.println();
        System.out.println("5-6.\nПримеры с заменой знака '=' на слово");
        System.out.println(replacEqual(compilerMathToStr(a, b, '+')));

        // 6
        System.out.println(nextReplacEquel(compilerMathToStr(a, b, '-')));
        System.out.println();
    }
    private static void minWindow(String str1, String str2) {
    }    
}
