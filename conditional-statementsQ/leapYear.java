
import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {
        // A leap year is a year that is divisible by 4 but not divisible by 100, or it is divisible by 400.
        // Time Complexity: O(1)
        // Space Complexity: O(1)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
