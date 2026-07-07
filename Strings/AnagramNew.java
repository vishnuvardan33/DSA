
import java.util.Scanner;

public class AnagramNew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase().replaceAll("[^a-z]", ""); // Convert to lowercase and remove non-alphabetic characters
        str2 = str2.toLowerCase().replaceAll("[^a-z]", ""); // Convert to lowercase and remove non-alphabetic characters

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        if (n != m) {
            return false;
        } else {
            int[] count = new int[26]; // Assuming only lowercase letters a-z
            for (int i = 0; i < n; i++) {
                count[str1.charAt(i) - 'a']++;
                count[str2.charAt(i) - 'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
