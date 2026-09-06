import java.util.Arrays;
class RemoveDuplicates{
	public static void main(String args[]){
		String str1="appnnacollege";
		boolean b[]=new boolean[26];
		getChar(b,str1,0,str1.length()-1);
		String res=getString(b);
		System.out.println(Arrays.toString(b));
		System.out.println(res);
		
		
	}
	private static void getChar(boolean b[],String str1, int start, int end){
		if(start>end){
			return;
		}
		b[str1.charAt(start)-'a']=true;
		start++;
		getChar(b, str1, start, end);
	}
	
	private static String getString(boolean b[]){
		StringBuilder str=new StringBuilder();
		for(int i=0;i<b.length;i++){
			if(b[i]==true){
				str.append((char)(i+'a'));
			}
		}
		return str.toString();
	}
}