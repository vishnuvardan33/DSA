class Sbufferdiff{
	public static void main(String[] args){
		//1.defalut stringBuffer

		StringBuffer sb1 = new StringBuffer();
		sb1.append("Default buffer");
		System.out.println(sb1);

		//2 using constructor with specified capacity
		
		StringBuffer sb2 = new StringBuffer(50);
		sb2.append("capacity buffer");
		System.out.println(sb2);

		//3 using string Buffer

		StringBuffer sb3 = new StringBuffer("This is string buffer");
		sb3.append("hi sb3");
		System.out.println(sb3);
	}
}