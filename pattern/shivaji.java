
import java.util.*;

public class shivaji {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {

            System.out.println("prime");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");

    }
}
