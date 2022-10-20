import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class StringUtil {

    /**
     * Проверка на полиндром
     */
    public static void checkPalindromeT1() {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();

        StringBuilder build = new StringBuilder(original); // Из строки в Билдер
        build.reverse(); // Переворачиваем

        String reverseString = build.toString(); // Билдер в строку

        if (original.equals(reverseString)) { // Проверяем
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
    }

    /**
     * Удаление дубликатов из стрки
     */
    public static void removeDuplicateT2() {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String result = "";

        for (int i = 0; i < original.length(); i++) { // Пробегаем по символам
            if (result.indexOf(original.charAt(i)) == -1) { // Если в результирующей строке нет такого символа добавляем его
                result = result + original.charAt(i);
            }
        }
        System.out.println(result);

    }

    /**
     * Проверка на анаграмму
     */
    public static void checkAnagramT3() {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        fillMap(map1); // Заполняем мапу с помощью метода (смотрите ниже)
        fillMap(map2);

        if (map1.keySet().size() != map2.keySet().size()) { // Если количество ключей разное - это 100% не анаграмма
            System.out.println("Это не анограмма");
        } else {
            Set<Character> keys = map1.keySet(); // Получаем ключи (символы в нашем случае)
            for (Character c : keys) { // Пробегаем по ним
                if (!map1.get(c).equals(map2.get(c))) { // Если и в той и в той карте ЧИСЛО (ЗНАЧЕНИЕ) НЕ одинаковое
                    System.out.println("Это не анограмма"); // ТОГДА НЕ АНАГРАММА
                    return;
                }
            }
            System.out.println("Это анограмма"); // Если все одниаковое - анаграмма
        }
    }

    /**
     * Проверка на лексиграфику какую то
     */
    public static void isLexicographicT4() {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String str2 = scan2.nextLine();

        int result = str1.compareTo(str2);
        System.out.println(result);
    }

    /**
     * Проверка на лексиграфику какую то не учиывая регистр
     */
    public static void isLexicographicWithoutCaseT5() {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String str2 = scan2.nextLine();

        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);
    }

    /**
     * Соединяем в конец
     */
    public static void concatToEndT6() {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String str2 = scan2.nextLine();

        System.out.println(str1.concat(str2));
    }

    /**
     * Проверяем одинаковые ли строка и Буфер
     */
    public static void checkWithBufferT7() {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        StringBuilder stringBuffer = new StringBuilder(scan.nextLine());

        if (!string.equals(stringBuffer.toString())) System.out.println("false"); // Чтобы проверить нужно буфер в строку превратить
        else System.out.println("true");

    }

    /**
     * Проверка заканчивается ли строка другой строкой
     */
    public static void checkEndWithAnotherStringT8() {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        boolean result = firstString.endsWith(secondString);
        System.out.println(result);
    }

    /**
     * Проверяем одинаковые ли строки
     */
    public static void checkEqualsDataT9() {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println(str1.equals(str2));
    }

    /**
     * Выводим длинну строки
     */
    public static void isLengthT10() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str.length());
    }

    /**
     * В нижний регистр
     */
    public static void toLowerRegisterT11() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str.toLowerCase());
    }

    /**
     * В верхний
     */
    public static void tuUpperRegisterT12() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str.toUpperCase());
    }

    // TODO 13 - I DONT KNOW HOW DO THIS

    /**
     * Удаляем дубликаты
     */
    public static void removeDuplicatesT14() {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        String resultString = "";

        for (char c : originalString.toCharArray()) { // Пробегаем по символам
            if (resultString.indexOf(c) != -1) continue; // Если результирующая строка имеет такой символ, тогда ничего не делаем
            resultString += c; // В противном добавляем в результирующую её
        }
        System.out.println(resultString);
    }

    /**
     * Возвращаем первый не повторяющийся символ
     */
    public static void getFirstNotRepeatSymbolT15() {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();

        for (char c : originalString.toCharArray()) {
            if (originalString.indexOf(c) == originalString.lastIndexOf(c)) { // Если индекс первого символа такой же как и индекс последнего символа, значит оно в одном месте
                System.out.println(c);
                break;
            }
        }
    }

    /**
     * Проверяем первые два символа такие же как в конце?
     */
    public static void checkEndWithStartT16() {
        Scanner scanner = new Scanner(System.in);

        String originalString = scanner.nextLine();
        String firstTwo = originalString.substring(0, 2); // Забираем первые два символа из оригинальной строки

        boolean result = originalString.endsWith(firstTwo); // Проверяем
        System.out.println(result);
    }

    /**
     * Собираем кол-во символов ИДУЩИХ ДРУГ ЗА ДРУГОМ ТРИ РАЗА
     */
    public static void countOfThreeRepeatedSymbolsT17() {
        Scanner scanner = new Scanner(System.in);
        // сумма всех цифр в строке
        String originalString = scanner.nextLine(); //abcccddeffftttto
        String result = "";

        for (int i = 0; i < originalString.length() - 2; i++) { // Пробегаем по строке НЕ УЧИТЫВАЯ ПОСЛЕДНИЕ ДВА СИМВОЛА, чтобы не выйти за массив
            if (originalString.charAt(i) == originalString.charAt(i + 1) && originalString.charAt(i + 1) == originalString.charAt(i + 2)) { // Здесь проверяем равен ли первый второму а второй первому
                if (result.indexOf(originalString.charAt(i)) != -1) continue; // Если равен, тогда проверяем есть ли он в результирующей, если есть продолжаем
                result += originalString.charAt(i); // Если его нет тогда добавляем его
            }
        }
        System.out.println("Колво повторяющихся три раза символов : " + result.length()); // Выводим длинну
    }

    /**
     * Ссумируем все числа в строке
     */
    public static void sumOfNumsInStringT18() {
        Scanner scanner = new Scanner(System.in);
        // сумма всех цифр в строке
        String originalString = scanner.nextLine(); //d1k2alasj4fhfja6shf2jkas9
        int result = 0;

        // С помощью регулярного выражения удаляем все символы и буквы ("0-9" - это все числа, а ^ - это НЕ, то есть НЕ ЧИСЛА)
        String nums = originalString.replaceAll("[^0-9]", "");  // Здесь получится 124629, заменили все НЕ ЧИСЛА на ""
        for (char c : nums.toCharArray()) { // [1,2,4,6,2,9]
            String num = String.valueOf(c); // '1' -> "1" Парсим в строку
            result += Integer.parseInt(num); // "1" -> 1 Парсим в число и ссумируем в результ
            // result += Integer.parseInt(String.valueOf(c)) // '1' -> "1" -> 1 Либо все это в одной строке
        }
        System.out.println("Сумма = " + result);
    }

    private static void fillMap(HashMap<Character, Integer> map) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) { // Пробегаем по символам строки
            if (map.containsKey(str.charAt(i))) { // Если такой символ есть
                int value = map.get(str.charAt(i)) + 1; // Получаем его значение и добавлем + 1
                map.put(str.charAt(i), value); // Вставляем новое значение
            } else {
                map.put(str.charAt(i), 1); // Если не было - ставим 1
            }
        }
    }
}
