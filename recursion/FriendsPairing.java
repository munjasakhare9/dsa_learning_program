class FriendsPairing{
	public static void main(String args[]){
		int n=3;
		n=friendsPairing(n);
		System.out.println(n);
	}
	private static int friendsPairing(int n){
		if(n==1|| n==2){
			return n;
		}
		return (n-1)+(n-1)*(n-2);
	}
}