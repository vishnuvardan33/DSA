
import java.util.*;

public class update {// update the array

    public static void updateArray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        updateArray(marks);
        System.out.println("Updated marks: " + Arrays.toString(marks));
    }
}
