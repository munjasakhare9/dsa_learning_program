class MyPower{
	private static double getPower(double x, long n){
		if(n==0){
			return 1;
		}
		if(n>0){
			double halfSqaure=getPower(x,n/2);
			halfSqaure=halfSqaure*halfSqaure;
			if(n%2!=0){
				return x*halfSqaure;
			}
			return halfSqaure;
		}
		n=-(n);
		double halfSqaureNeg=getPower(x,n/2);
		halfSqaureNeg=halfSqaureNeg*halfSqaureNeg;
		return (n%2==0)?1/halfSqaureNeg:1/(x*halfSqaureNeg);
	}
	public static void main(String args[]){
		double power=getPower(2,-2);
		System.out.println(power);
	}
}