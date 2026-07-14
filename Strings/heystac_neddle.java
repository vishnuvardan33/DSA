public class heystac_neddle{
	public static void main(String[] args){
		
		String heystack="sadbutsad";
		String neddle="sad";
		System.out.println(checkneddle(heystack,neddle));
	}
	public static int checkneddle(String heystack, String neddle){
		for(int i=0; i<heystack.length()-neddle.length()-i; i++){
			if(heystack.charAt(i)==neddle.charAt(0)){
				if(heystack.substring(i,neddle.length()+i).equals(neddle)){
					return i;
				}
			}
		}
		return -1;
	}
}