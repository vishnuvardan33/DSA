
import java.util.*;

public class halfPyramid {

    public static void main(String[] args) {
        // This program prints a half pyramid pattern of numbers based on user input for the number of rows.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
