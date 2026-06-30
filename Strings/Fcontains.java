
import java.util.ArrayList;

class Fcontains {

    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java!";
        ArrayList<Character> uniqueChars = new ArrayList<>();
        //for (char ch : str.toCharArray()) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
            }
        }
        System.out.println(uniqueChars);

    }
}
