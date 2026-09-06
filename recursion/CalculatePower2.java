class CalculatePower2{
	private static int calPower(int x, int n){
		if(n==0) return 1;
		return x*calPower(x,n-1);
	}
	public static void main(String args[]){
		System.out.println(calPower(2,4));
	}
}
