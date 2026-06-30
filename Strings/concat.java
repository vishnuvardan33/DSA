
class concat {

    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        s2 = s2.concat(s3);
        System.out.println(s2);
    }
}
