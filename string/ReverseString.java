class ReverseString{
	public static void main(String args[]){
		String s1="racecar";
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
				System.out.println("Not Palindrome String");
				return;
			}
		}
		System.out.println("Palindrome String");
	}
}