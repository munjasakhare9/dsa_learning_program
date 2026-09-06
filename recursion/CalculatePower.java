class CalculatePower{
	private static double getPower(double x, int n){
		if(n==0){
			return 1;
		}
		if(n>0){
			return x*getPower(x,n-1);
		}
		return (1/x)*getPower(x,n+1);
	}
	public static void main(String args[]){
		double power=getPower(2,-2);
		System.out.println(power);
	}
}	