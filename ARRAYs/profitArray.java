
public class profitArray {
    //brute force approach//0(n2)
    //public static void profit(int arr[]) {
    //    int maxprofit = 0;
    //    for (int i = 0; i < arr.length - 1; i++) {
    //        for (int j = i + 1; j < arr.length; j++) {
    //            int profit = arr[j] - arr[i];
    //           maxprofit = Math.max(maxprofit, profit);
    //        }
    //    }
    //    System.out.println("Maximum profit: " + maxprofit);
    //}

    //optimal approach//0(n)
    public int maxprofit(int[] arr) {
        int buy = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (buy < arr[i]) {
                profit = Math.max(profit, arr[i] - buy);
            } else {
                buy = arr[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        profitArray pa = new profitArray();
        System.out.println("Maximum profit: " + pa.maxprofit(arr));
    }
}
