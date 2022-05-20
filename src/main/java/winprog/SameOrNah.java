package winprog;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a word:");
        String word = scanner.next();
        System.out.println("Enter another word:");
        String word2 = scanner.next();

        boolean isSAme = IsSame(word, word2);

        if (isSAme) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
        scanner.close();
    }

    public static boolean IsSame(String word1, String word2)
    {
        if (word1.equals(word2)) {
            return true;
        } else {
            return false;
        }

    }
}