
public class demoS {

    public static void main(String args[]) {
        String name = "Hello World";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf('o'));
        System.out.println(name.indexOf('o', name.indexOf('o') + 1));
        System.out.println(name.indexOf("World"));
        System.out.println(name.substring(6));
        System.out.println(name.substring(0, 5));
    }
}
