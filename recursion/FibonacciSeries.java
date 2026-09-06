class FibonacciSeries{
	private static void printFibonacci(int n){
		int first = 0;
        int second = 1;

        if (n >= 1){
            System.out.print(first + " ");
		}

        if (n >= 2){
            System.out.print(second + " ");
		}
		for(int i=3;i<=n;i++){
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
	}
	public static void main(String args[]){
		int n=10;
		printFibonacci(n);
	}
}