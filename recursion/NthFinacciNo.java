class NthFinacciNo{
	public static void main(String args[]){
		int n=6;
		n=findNthFibonacci(n);
		System.out.println(n);
	}
	private static int findNthFibonacci(int n){
		if(n==0 || n==1){
			return n;
		}
		return findNthFibonacci(n-1)+findNthFibonacci(n-2);
	}
}
