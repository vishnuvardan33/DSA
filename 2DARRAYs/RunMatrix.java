import java.util.Scanner;
public class RunMatrix {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		//input rows and columns
		System.out.println("Enter size of the matrix n (rows), m (columns) :");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//create matrix
		int[][] matrix = new int[n][m];
		
		//input elements
		System.out.println("Enter elements into the matrix the size is ("+n*m+")");
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				matrix[i][j] = sc.nextInt();
			}
		}

		//out put
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();

		}
		sc.close();


	}
}
