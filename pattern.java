
public class pattern {

    public static void main(String[] args) {
        System.out.print("\n hello\n java\n");
        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
