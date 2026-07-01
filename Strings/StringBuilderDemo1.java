public class StringBuilderDemo1 {
    public static void main(String[] args)
    {
        StringBuilder sb
            = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial StringBuilder: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);
    }
}