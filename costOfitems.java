
import java.util.*;

public class costOfitems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        int[] cost = new int[n];
        System.out.println("Enter the cost of each item:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalCost += cost[i];
        }
        System.out.println("Total cost of items: " + totalCost);

        //adding tax gst 18%
        double tax = totalCost * 0.18;
        System.out.println("Tax (18%): " + tax);
        sc.close();
    }
}
