class BinaryStringProblem{
	public static void main(String args[]){
		int n=2;
		binaryStringProblem(3, 0, "");
	}
	private static void binaryStringProblem(int n, int lastPlace, String str){
		if(n==0){
			System.out.println(str);
			return;
		}
		binaryStringProblem(n-1, 0, str+"0");
		if(lastPlace==0){
			binaryStringProblem(n-1, 1,str+"1");
		}
	}
}