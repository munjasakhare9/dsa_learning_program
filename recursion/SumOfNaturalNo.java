class SumOfNaturalNo{
	private static int findSum(int n){
		if(n==1){
			return 1;
		}
		return n+findSum(n-1);
	}
	public static void main(String args[]){
		int num=10;
		num=findSum(num);
		System.out.println(num);
	}
}