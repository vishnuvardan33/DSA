
import java.util.*;

public class sumofEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, upto that number sum of even and odd numbers printed:");
        int n = sc.nextInt();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to " + n + " = " + sumEven);
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + sumOdd);
    }
}
