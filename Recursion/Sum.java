
class Sum {

    public static int printsum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + printsum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = printsum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
