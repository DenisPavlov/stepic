package lesson2;

public class Task2_3_1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();
        text = text.replaceAll("[^a-zA-Z0-9]", "");

        return text.equals(new StringBuilder(text).reverse().toString());
    }
}
