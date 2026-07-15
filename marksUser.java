import java.util.*;
public class marksUser {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of students : ");
		int n = sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter marks of each student : ");
		for(int i=0; i<n; i++){
			marks[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++){
			System.out.print(marks[i]+" ");

		}
		for(int i=0; i<n; i++){
			if(marks[i]>=35){
				System.out.println("Student"+(i+1) +" is got : "+marks[i]+" so pass ");

			}
			else{
				System.out.println("Student"+(i+1) +" is got : "+marks[i]+" so fail ");

			}
			
		}
	}
}

		
		
		