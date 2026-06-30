
import java.util.ArrayList;

class prints2 {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 3, 2, 4};
        ArrayList<Integer> unique = new ArrayList<>();
        for (int item : t) {
            if (!unique.contains(item)) {
                unique.add(item);
            }
        }
        System.out.println(unique);
    }
}
