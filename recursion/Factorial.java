class Factorial{
	public static void main(String args[]){
		int num=5;
		num=findFactorial(num);
		System.out.println(num);
	}
	private static int findFactorial(int n){
		if(n==1){
			return 1;
		}
		return n*findFactorial(n-1);
	}
}