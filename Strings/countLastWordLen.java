public class countLastWordLen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String stn=sc.nextLine();
		
		System.out.println("The length of the last word in a sentence is:"+is_countLastWordLen(stn));
	}
	public static int is_countLastWordLen(String stn){
		String sentence=stn.trim();
		int n=sentence.length();
		int count=0; 
		for(int i=n-1; i>=0; i--){
			if(sentence.charAt(i)==''){
				break;
			}
			count++;
		}
		return count;
	}
}
			
		
		
	