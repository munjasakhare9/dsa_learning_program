class CheckOddOrEven{
	static void checkNum(int n){
		int bitmask=1;
		if((n&bitmask)==0){
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
	}
	public static void main(String args[]){
		checkNum(3);
		checkNum(5);
		checkNum(8);
	}
}