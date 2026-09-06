class DecOrder{
	public static void main(String args[]){
		printDecOrder(15);
	}
	private static void printDecOrder(int n){
		if(n==1){
			System.out.print(n+" ");
			return;
		}
		System.out.print(n+" ");
		printDecOrder(n-1);
	}
}
