import java.util.Scanner;
public class print_reverseString {
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		System.out.println("The reverse of the string is: "+print_reverseStr(str));
	}
	public static String print_reverseStr(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}	
		