class StringCompression{
	public static void main(String args[]){
		String s1="aaabbcccdd-";
		StringBuilder sb=new StringBuilder();
		int i=0;
		for(int j=0;j<s1.length();j++){
			char c1=s1.charAt(i);
			char c2=s1.charAt(j);
			if(c1!=c2){
				sb.append(c1);
				sb.append(j-i);
				i=j;
			}
		}
		System.out.println(sb);
	}
}