class ReverseString{
	public static String reverseStringCall(String str){
		String res="";
		int n=str.length();
		for(int i=0; i<n; i++){
			res=str.charAt(i)+res;
		}
		return res;
	}
	public static void main(String[] args){
		System.out.println(reverseStringCall("A man, a plan, a canal: Panama"));
	}
}
