public class Main {
    public static void main(String[] args) {
        System.out.println("дед - " +isWordPalindrome("дед"));
        System.out.println("год - " + isWordPalindrome("год"));
        System.out.println("кабак - " + isWordPalindrome("кабак"));
        System.out.println("кабан - " + isWordPalindrome("кабан"));
        System.out.println("доход - " + isWordPalindrome("доход"));
        System.out.println("шалаш - " + isWordPalindrome("шалаш"));
        System.out.println("");

        System.out.println("Искать такси - " + isTextPalindrome("Искать такси"));
        System.out.println("Лидер бредил - " + isTextPalindrome("Лидер бредил"));
        System.out.println("А роза упала на лапу Азора - " + isTextPalindrome("А роза упала на лапу Азора"));
        System.out.println("Уж редко рукою окурок держу - " + isTextPalindrome("Уж редко рукою окурок держу"));
    }

    private static boolean isWordPalindrome(String word) {
        char chars[] = word.toLowerCase().toCharArray();
        var left = 0;
        var right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isTextPalindrome(String text) {
        char chars2[] = text.toLowerCase().toCharArray();
        var left2 = 0;
        var right2 = chars2.length-1;

        while (left2 < right2) {
            if (chars2[left2] != chars2[right2]) {
                return false;
            }
            do {
                left2++;
            } while (left2 < right2 && chars2[left2] == ' ');

            do {
                right2--;
            } while (right2 > left2 && chars2[right2] == ' ');
        }
        return true;
    }
}