class IncOrder{
	public static void main(String args[]){
		printIncOrder(15);
	}
	private static void printIncOrder(int n){
		if(n==1){
			System.out.print(n+" ");
			return;
		}
		printIncOrder(n-1);
		System.out.print(n+" ");
	}
}