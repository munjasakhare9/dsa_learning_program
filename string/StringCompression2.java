class StringCompression2{
	public static void main(String args[]){
		String s1="aaabbcccdd";
		StringBuilder sb=new StringBuilder();
		char c1=s1.charAt(0);
		int count=0;
		for(int j=0;j<s1.length();j++){
			char c2=s1.charAt(j);
			if(c1==c2){
				count++;
			}
			else{
				sb.append(c1);
				sb.append(count);
				c1=s1.charAt(j);
				count=1;
			}
		}
		sb.append(c1);
		sb.append(count);
		System.out.println(sb);
	}
}