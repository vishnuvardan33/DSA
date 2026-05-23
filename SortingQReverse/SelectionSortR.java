public class SelectionSortR {
	public static void Sort(int arr[]){
		for(int i=0; i<arr.length-1; i++){
			int minPos =i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[minPos] < arr[j]){
					minPos=j;
				}
			}
			int temp = arr[minPos];
			arr[minPos]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String args[]){
		int arr[]={25,13,99,10,100,1,2};
		Sort(arr);
		System.out.println("The sorted array is :");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
					