class capacityInBuffer{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		sb.append("hi vishnu");
		System.out.println(sb);

		System.out.println(sb.capacity());
		sb.append("dddddddddddddd     d          wwwwwwwwwww");
		System.out.println(sb);

		System.out.println(sb.capacity());

	}
}