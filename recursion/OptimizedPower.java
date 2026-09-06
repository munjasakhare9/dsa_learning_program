class OptimizedPower{
	private static double optimizedPower(double x, int n){
		if(n==0){
			return 1;
		}
		double halfPower=optimizedPower(x,n/2)*optimizedPower(x,n/2);
		if(n%2!=0){
			return x*halfPower;
		}
		return halfPower;
	}
	public static void main(String args[]){
		System.out.println(optimizedPower(2.0,5));
	}
}