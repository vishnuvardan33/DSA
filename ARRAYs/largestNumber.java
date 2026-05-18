
public class largestNumber {

    public static int getlargestnumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number is: " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int largest = getlargestnumber(arr);
        System.out.println("Largest number is: " + largest);
    }
}
