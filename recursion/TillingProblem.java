class TillingProblem{
	public static void main(String args[]){
		int n=5;
		n=findNumberOfWays(n);
		System.out.println(n);
	}
	private static int findNumberOfWays(int n){
		//if(n==0 || n==1) return 1;
		//return findNumberOfWays(n-1)+findNumberOfWays(n-2);
		
		/*int fnm1=findNumberOfWays(n-1);
		int fnm2=findNumberOfWays(n-2);
		int total=fnm1+fnm2;
		*/
		//return total;
		
		return (n==0 || n==1)? 1: findNumberOfWays(n-1)+findNumberOfWays(n-2);
	}
}