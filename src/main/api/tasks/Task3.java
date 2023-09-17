package api.tasks;

public class Task3 {
    public static boolean isPalindrome(String word) {
        int length = word.length();
        // Двигаемся с обоих концов слова к середине
        for (int i = 0; i < (length / 2); i++) {
            // Сравниваем символы попарно
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                System.out.println("is not palindrome");
                return false;
            }
        }
        System.out.println("is palindrome");
        return true;
    }
}
